/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samistine.inquisitorapi;

import com.samistine.inquisitorapi.bukkit.BukkitInquisitorPlayer;
import com.samistine.inquisitorapi.rest.RestInquisitorPlayer;
import java.util.UUID;

/**
 *
 * @author Samuel
 */
public class InquisitorPlayerFactory {

    /**
     * Create player using <b><i>Plugin API access</i></b>
     *
     * @param inquisitor the inquisitor plugin
     * @param name The name of the player
     * @param uuid The uuid of the player
     * @return
     */
    public static InquisitorPlayer createPlayer(com.frdfsnlght.inquisitor.Inquisitor inquisitor, String name, UUID uuid) {
        return new BukkitInquisitorPlayer(name, uuid, inquisitor.getAPI());
    }

    /**
     * Create player using <b><i>REST API</i></b>
     *
     * @param api the inquisitor REST API, eg: "example.com:8080/api"
     * <b>without trailing slash</b>.
     * @param name The name of the player
     * @param uuid The uuid of the player
     * @return
     */
    public static InquisitorPlayer createPlayer(String api, String name, UUID uuid) {
        return new RestInquisitorPlayer(api + "/stats/" + name, name, uuid);
    }

}
