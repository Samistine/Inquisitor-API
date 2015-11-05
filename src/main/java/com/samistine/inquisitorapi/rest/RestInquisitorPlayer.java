/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samistine.inquisitorapi.rest;

import java.util.UUID;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.samistine.inquisitorapi.InquisitorPlayer;
import com.samistine.inquisitorapi.PlayerStats;
import com.samistine.inquisitorapi.exceptions.ConnectionFailure;
import com.samistine.inquisitorapi.exceptions.GeneralError;
import com.samistine.inquisitorapi.exceptions.ParsingError;
import com.samistine.inquisitorapi.exceptions.PlayerNotFoundException;
import com.samistine.inquisitorapi.rest.objects.Response;

/**
 *
 * @author Samuel
 */
public class RestInquisitorPlayer implements InquisitorPlayer {

    Gson gson = new Gson();
    private final String full_api_address;
    private final String name;
    private final UUID uuid;

    public RestInquisitorPlayer(String full_api_address, String name, UUID uuid) {
        this.full_api_address = full_api_address;
        this.name = name;
        this.uuid = uuid;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public UUID getUniqueID() {
        return uuid;
    }

    @Override
    public PlayerStats getPlayerStats() throws GeneralError {
        String responsedata;
        try {
            responsedata = new HTTPClient().get(full_api_address);
        } catch (Exception ex) {
            throw new ConnectionFailure("Connection to " + full_api_address + " failed");
        }

        Response response;
        try {
            response = gson.fromJson(responsedata, Response.class);
        } catch (JsonSyntaxException ex) {
            throw new ParsingError("Unable to parse api response for " + getName());
        }

        if (response.isSuccess()) {
            return new RestPlayerStats(response.getResult().getStats());
        } else {
            throw new PlayerNotFoundException("API returned with a failure at " + full_api_address);
        }
    }

}
