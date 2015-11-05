/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samistine.inquisitorapi.bukkit;

import com.frdfsnlght.inquisitor.api.API;
import com.samistine.inquisitorapi.exceptions.PlayerNotFoundException;
import com.samistine.inquisitorapi.InquisitorPlayer;
import com.samistine.inquisitorapi.PlayerStats;
import java.util.UUID;

/**
 *
 * @author Samuel
 */
public class BukkitInquisitorPlayer implements InquisitorPlayer {
    
    private final String name;
    private final UUID uuid;
    private final API pluginAPI;

    /**
     * For now, you will need to submit both name and uuid, since lookups can only be done via name at
     * this moment, but I want to soon move over to uuid-only lookup.
     * @param name
     * @param uuid 
     * @param pluginAPI 
     */
    public BukkitInquisitorPlayer(String name, UUID uuid, API pluginAPI) {
        this.name = name;
        this.uuid = uuid;
        this.pluginAPI = pluginAPI;
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
    public PlayerStats getPlayerStats() throws PlayerNotFoundException {
        return new BukkitPlayerStats(this, pluginAPI);
    }
    
}
