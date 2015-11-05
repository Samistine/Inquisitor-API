/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samistine.inquisitorapi.rest;

import com.samistine.inquisitorapi.Coords;
import com.samistine.inquisitorapi.InqItem;
import com.samistine.inquisitorapi.PlayerStats;
import com.samistine.inquisitorapi.rest.objects.Stats;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Samuel
 */
public class RestPlayerStats implements PlayerStats {

    private final Stats stats;

    public RestPlayerStats(Stats stats) {
        this.stats = stats;
    }

    @Override
    public String getDisplayName() {
        return stats.displayName;
    }

    @Override
    public String getAddress() {
        return stats.address;
    }

    @Override
    public InqItem[] getInventory() {
        return stats.inventory;
    }

    @Override
    public InqItem[] getArmor() {
        return stats.armor;
    }

    @Override
    public int getHeldItemSlot() {
        return stats.heldItemSlot;
    }

    @Override
    public int getHealth() {
        return stats.health;
    }

    @Override
    public int getRemainingAir() {
        return stats.remainingAir;
    }

    @Override
    public int getFireTicks() {
        return stats.fireTicks;
    }

    @Override
    public int getFoodLevel() {
        return stats.foodLevel;
    }

    @Override
    public float getExhaustion() {
        return stats.exhaustion;
    }

    @Override
    public float getSaturation() {
        return stats.saturation;
    }

    @Override
    public String getGameMode() {
        return stats.gameMode;
    }

    @Override
    public int getLevel() {
        return stats.level;
    }

    @Override
    public float getExp() {
        return stats.exp;
    }

    @Override
    public int getTotalExperience() {
        return stats.totalExperience;
    }

    @Override
    public List<String> getPotionEffects() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getServer() {
        return stats.server;
    }

    @Override
    public String getWorld() {
        return stats.world;
    }

    @Override
    public Coords getCoords() {
        try {
            String[] str2 = stats.coords.split(",");
            return new Coords(Double.parseDouble(str2[0]), Double.parseDouble(str2[1]), Double.parseDouble(str2[2]));
        } catch (Exception ex) {
            return new Coords(-1, -1, -1);
        }
    }

    @Override
    public List<String> getGroups() {
        return Arrays.asList(stats.groups);
    }

    @Override
    public double getMoney() {
        return stats.money;
    }

    @Override
    public String getBedServer() {
        return stats.bedServer;
    }

    @Override
    public String getBedWorld() {
        return stats.bedWorld;
    }

    @Override
    public Coords getBedCoords() {
        try {
            String str = stats.bedCoords;
            String[] str2 = str.split(",");
            return new Coords(Double.parseDouble(str2[0]), Double.parseDouble(str2[1]), Double.parseDouble(str2[2]));
        } catch (Exception ex) {
            return new Coords(-1, -1, -1);
        }
    }

    @Override
    public int getJoins() {
        return stats.joins;
    }

    @Override
    public int getQuits() {
        return stats.quits;
    }

    @Override
    public Timestamp getFirstJoin() {
        return Timestamp.valueOf(stats.firstJoin);
    }

    @Override
    public Timestamp getLastJoin() {
        return Timestamp.valueOf(stats.lastJoin);
    }

    @Override
    public Timestamp getLastQuit() {
        return Timestamp.valueOf(stats.lastQuit);
    }

    @Override
    public int getKicks() {
        return stats.kicks;
    }

    @Override
    public Timestamp getLastKickTime() {
        return Timestamp.valueOf(stats.lastKick);
    }

    @Override
    public String getLastKickMessage() {
        return stats.lastKickMessage;
    }

    @Override
    public int getDeaths() {
        return stats.deaths;
    }

    @Override
    public org.json.simple.JSONObject getDeathCauses() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    public Timestamp getLastDeathTime() {
        return Timestamp.valueOf(stats.lastDeath);
    }

    @Override
    public String getLastDeathMessage() {
        return stats.lastDeathMessage;
    }

    @Override
    public int getTotalPlayersKilled() {
        return stats.totalPlayersKilled;
    }

    @Override
    public org.json.simple.JSONObject getPlayersKilledMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    public org.json.simple.JSONObject getPlayersKilledWeapons() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    public Timestamp getPlayersKilledLastTime() {
        return Timestamp.valueOf(stats.lastPlayerKill);
    }

    @Override
    public String getPlayersKilledLastName() {
        return stats.lastPlayerKilled;
    }

    @Override
    public int getTotalMobsKilled() {
        return stats.totalMobsKilled;
    }

    @Override
    public org.json.simple.JSONObject getMobsKilledMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    public org.json.simple.JSONObject getMobsKilledWeapons() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Timestamp getMobsKilledLastTime() {
        return Timestamp.valueOf(stats.lastMobKill);
    }

    @Override
    public String lastMobKilled() {
        return stats.lastMobKilled;
    }

    @Override
    public int getTotalBlocksBroken() {
        return stats.totalBlocksBroken;
    }

    @Override
    public org.json.simple.JSONObject getBlocksBrokenMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getTotalBlocksPlaced() {
        return stats.totalBlocksPlaced;
    }

    @Override
    public org.json.simple.JSONObject getBlocksPlacedMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getAnimalsTamedMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getTotalDistanceTraveled() {
        return stats.totalDistanceTraveled;
    }

    @Override
    public org.json.simple.JSONObject getDistancesTraveled() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public org.json.simple.JSONObject getTravelTimesMeans() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public org.json.simple.JSONObject getTravelTimesBiome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getItemsDroppedCount() {
        return stats.totalItemsDropped;
    }

    @Override
    public org.json.simple.JSONObject getItemsDroppedMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getItemsPickedUpCount() {
        return stats.totalItemsPickedUp;
    }

    @Override
    public org.json.simple.JSONObject getItemsPickedUpMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getItemsCraftedCount() {
        return stats.totalItemsCrafted;
    }

    @Override
    public org.json.simple.JSONObject getItemsCraftedMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public org.json.simple.JSONObject getEggsThrownMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public org.json.simple.JSONObject getFoodEatenMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getTimesSlept() {
        return stats.timesSlept;
    }

    @Override
    public int getArrowsShot() {
        return stats.arrowsShot;
    }

    @Override
    public int getFiresStarted() {
        return stats.firesStarted;
    }

    @Override
    public int getFishCaught() {
        return stats.fishCaught;
    }

    @Override
    public int getChatMessages() {
        return stats.chatMessages;
    }

    @Override
    public int getPortalsCroassed() {
        return stats.portalsCrossed;
    }

    @Override
    public int getWaterBucketsFilled() {
        return stats.waterBucketsFilled;
    }

    @Override
    public int getWaterBucketsEmptied() {
        return stats.waterBucketsEmptied;
    }

    @Override
    public int getLavaBucketsFilled() {
        return stats.lavaBucketsFilled;
    }

    @Override
    public int getLavaBucketsEmptied() {
        return stats.lavaBucketsEmptied;
    }

    @Override
    public int getCowsMilked() {
        return stats.cowsMilked;
    }

    @Override
    public int getMooshroomsMilked() {
        return stats.mooshroomsMilked;
    }

    @Override
    public int getMooshroomsSheared() {
        return stats.mooshroomsSheared;
    }

    @Override
    public int getSheepSheared() {
        return stats.sheepSheared;
    }

    @Override
    public int getSheepDyed() {
        return stats.sheepDyed;
    }

    @Override
    public int getLifetimeExpierience() {
        return stats.lifetimeExperience;
    }

    @Override
    public int getItemsEnchanted() {
        return stats.itemsEnchanted;
    }

    @Override
    public int getItemEnchantmentLevels() {
        return stats.itemEnchantmentLevels;
    }

    @Override
    public float getSessionTime() {
        return stats.sessionTime;
    }

    @Override
    public float getTotalTime() {
        return stats.totalTime;
    }

    @Override
    public boolean getOnline() {
        switch (stats.online) {
            case 0:
                return false;
            case 1:
                return true;
            default:
                return false;
        }
    }

}
