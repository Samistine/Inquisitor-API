/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samistine.inquisitorapi.bukkit;

import com.samistine.inquisitorapi.exceptions.PlayerNotFoundException;
import com.frdfsnlght.inquisitor.api.API;
import com.samistine.inquisitorapi.Coords;
import com.samistine.inquisitorapi.InquisitorPlayer;
import com.samistine.inquisitorapi.InqItem;
import com.samistine.inquisitorapi.PlayerStats;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.json.simple.JSONObject;

/**
 *
 * @author Samuel
 */
public class BukkitPlayerStats implements PlayerStats {

    private static Object
    private Map<String, Object> data;

    protected BukkitPlayerStats(InquisitorPlayer player, API pluginAPI) throws PlayerNotFoundException {
        try {
            data = pluginAPI.getPlayerStats(player.getName());
        } catch (Exception ex) {
            throw new PlayerNotFoundException("Could not find player " + player.getName());
        }
    }

    @Override
    public String getDisplayName() {
        Object displayName = data.get("displayName");
        return (displayName instanceof String) ? (String) displayName : null;
    }

    @Override
    public String getAddress() {
        Object result = data.get("address");
        return (result instanceof String) ? (String) result : null;
    }

    @Override
    public InqItem[] getInventory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public InqItem[] getArmor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getHeldItemSlot() {
        Object result = data.get("heldItemSlot");
        return (result instanceof Integer) ? ((Integer) result) : 0;
    }

    @Override
    public int getHealth() {
        Object result = data.get("health");
        return (result instanceof Integer) ? ((Integer) result) : null;
    }

    @Override
    public int getRemainingAir() {
        Object result = data.get("remainingAir");
        return (result instanceof Integer) ? ((Integer) result) : null;
    }

    @Override
    public int getFireTicks() {
        Object result = data.get("fireTicks");
        return (result instanceof Integer) ? ((Integer) result) : null;
    }

    @Override
    public int getFoodLevel() {
        Object result = data.get("foodLevel");
        return (result instanceof Integer) ? ((Integer) result) : null;
    }

    @Override
    public float getExhaustion() {
        Object result = data.get("exhaustion");
        return (result instanceof Float) ? ((Float) result) : null;
    }

    @Override
    public float getSaturation() {
        Object result = data.get("saturation");
        return (result instanceof Float) ? ((Float) result) : null;
    }

    @Override
    public String getGameMode() {
        Object result = data.get("gameMode");
        return (result instanceof String) ? (String) result : null;
    }

    @Override
    public int getLevel() {
        Object result = data.get("level");
        return (result instanceof Integer) ? ((Integer) result) : null;
    }

    @Override
    public float getExp() {
        Object result = data.get("exp");
        return (result instanceof Float) ? ((Float) result) : null;
    }

    @Override
    public int getTotalExperience() {
        Object result = data.get("totalExperience");
        return (result instanceof Integer) ? ((Integer) result) : null;
    }

    @Override
    public List<String> getPotionEffects() {
        Object result = data.get("potionEffects");
        return (result instanceof List) ? ((List<String>) result) : null;
    }

    @Override
    public String getServer() {
        Object result = data.get("server");
        return (result instanceof String) ? (String) result : null;
    }

    @Override
    public String getWorld() {
        Object result = data.get("world");
        return (result instanceof String) ? (String) result : null;
    }

    @Override
    public Coords getCoords() {
        try {
            String str = (String) data.get("coords");
            String[] str2 = str.split(",");
            return new Coords(Double.parseDouble(str2[0]), Double.parseDouble(str2[1]), Double.parseDouble(str2[2]));
        } catch (Exception ex) {
            return null;
        }
    }

    @Override
    public List<String> getGroups() {
        Object result = data.get("groups");
        return (result instanceof List) ? (List<String>) result : null;
    }

    @Override
    public double getMoney() {
        Object result = data.get("money");
        return (result instanceof Double) ? (Double) result : null;
    }

    @Override
    public String getBedServer() {
        Object result = data.get("bedServer");
        return (result instanceof String) ? (String) result : null;
    }

    @Override
    public String getBedWorld() {
        Object result = data.get("bedWorld");
        return (result instanceof String) ? (String) result : null;
    }

    @Override
    public Coords getBedCoords() {
        try {
            String str = (String) data.get("bedCoords");
            String[] str2 = str.split(",");
            return new Coords(Double.parseDouble(str2[0]), Double.parseDouble(str2[1]), Double.parseDouble(str2[2]));
        } catch (Exception ex) {
            return null;
        }
    }

    @Override
    public int getJoins() {
        Object result = data.get("joins");
        return (result instanceof Integer) ? ((Integer) result) : null;
    }

    @Override
    public int getQuits() {
        Object result = data.get("quits");
        return (result instanceof Integer) ? ((Integer) result) : null;
    }

    @Override
    public Timestamp getFirstJoin() {
        Object result = data.get("firstJoin");
        return (result instanceof Date) ? new Timestamp(((Date) result).getTime()) : null;
    }

    @Override
    public Timestamp getLastJoin() {
        Object result = data.get("lastJoin");
        return (result instanceof Date) ? new Timestamp(((Date) result).getTime()) : null;
    }

    @Override
    public Timestamp getLastQuit() {
        Object result = data.get("lastQuit");
        return (result instanceof Date) ? new Timestamp(((Date) result).getTime()) : null;
    }

    @Override
    public int getKicks() {
        Object result = data.get("kicks");
        return (result instanceof Integer) ? ((Integer) result) : null;
    }

    @Override
    public Timestamp getLastKickTime() {
        Object result = data.get("lastKick");
        return (result instanceof Date) ? new Timestamp(((Date) result).getTime()) : null;
    }

    @Override
    public String getLastKickMessage() {
        Object result = data.get("lastKickMessage");
        return (result instanceof String) ? ((String) result) : null;
    }

    @Override
    public int getDeaths() {
        Object result = data.get("deaths");
        return (result instanceof Integer) ? ((Integer) result) : null;
    }

    @Override
    public JSONObject getDeathCauses() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Timestamp getLastDeathTime() {
        Object result = data.get("lastDeath");
        return (result instanceof Date) ? new Timestamp(((Date) result).getTime()) : null;
    }

    @Override
    public String getLastDeathMessage() {
        Object result = data.get("lastDeathMessage");
        return (result instanceof String) ? ((String) result) : null;
    }

    @Override
    public int getTotalPlayersKilled() {
        Object result = data.get("totalPlayersKilled");
        return (result instanceof Integer) ? ((Integer) result) : null;
    }

    @Override
    public JSONObject getPlayersKilledMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JSONObject getPlayersKilledWeapons() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Timestamp getPlayersKilledLastTime() {
        Object result = data.get("lastPlayerKill");
        return (result instanceof Date) ? new Timestamp(((Date) result).getTime()) : null;
    }

    @Override
    public String getPlayersKilledLastName() {
        Object result = data.get("lastPlayerKilled");
        return (result instanceof String) ? ((String) result) : null;
    }

    @Override
    public int getTotalMobsKilled() {
        Object result = data.get("totalMobsKilled");
        return (result instanceof Integer) ? ((Integer) result) : null;
    }

    @Override
    public JSONObject getMobsKilledMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JSONObject getMobsKilledWeapons() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Timestamp getMobsKilledLastTime() {
        Object result = data.get("lastMobKill");
        return (result instanceof Date) ? new Timestamp(((Date) result).getTime()) : null;
    }

    @Override
    public String lastMobKilled() {
        Object result = data.get("lastMobKilled");
        return (result instanceof String) ? ((String) result) : null;
    }

    @Override
    public int getTotalBlocksBroken() {
        Object result = data.get("totalBlocksBroken");
        return (result instanceof Integer) ? ((Integer) result) : null;
    }

    @Override
    public JSONObject getBlocksBrokenMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getTotalBlocksPlaced() {
        Object result = data.get("totalBlocksPlaced");
        return (result instanceof Integer) ? ((Integer) result) : null;
    }

    @Override
    public JSONObject getBlocksPlacedMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getAnimalsTamedMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getTotalDistanceTraveled() {
        Object result = data.get("totalDistanceTraveled");
        return (result instanceof Float) ? ((Float) result) : null;
    }

    @Override
    public JSONObject getDistancesTraveled() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JSONObject getTravelTimesMeans() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JSONObject getTravelTimesBiome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getItemsDroppedCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JSONObject getItemsDroppedMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getItemsPickedUpCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JSONObject getItemsPickedUpMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getItemsCraftedCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JSONObject getItemsCraftedMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JSONObject getEggsThrownMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JSONObject getFoodEatenMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getTimesSlept() {
        Object result = data.get("timesSlept");
        return (result instanceof Integer) ? ((Integer) result) : null;
    }

    @Override
    public int getArrowsShot() {
        Object result = data.get("arrowsShot");
        return (result instanceof Integer) ? ((Integer) result) : null;
    }

    @Override
    public int getFiresStarted() {
        Object result = data.get("firesStarted");
        return (result instanceof Integer) ? ((Integer) result) : null;
    }

    @Override
    public int getFishCaught() {
        Object result = data.get("fishCaught");
        return (result instanceof Integer) ? ((Integer) result) : null;
    }

    @Override
    public int getChatMessages() {
        Object result = data.get("chatMessages");
        return (result instanceof Integer) ? ((Integer) result) : null;
    }

    @Override
    public int getPortalsCroassed() {
        Object result = data.get("portalsCrossed");
        return (result instanceof Integer) ? ((Integer) result) : null;
    }

    @Override
    public int getWaterBucketsFilled() {
        Object result = data.get("waterBucketsFilled");
        return (result instanceof Integer) ? ((Integer) result) : null;
    }

    @Override
    public int getWaterBucketsEmptied() {
        Object result = data.get("waterBucketsEmptied");
        return (result instanceof Integer) ? ((Integer) result) : null;
    }

    @Override
    public int getLavaBucketsFilled() {
        Object result = data.get("lavaBucketsFilled");
        return (result instanceof Integer) ? ((Integer) result) : null;
    }

    @Override
    public int getLavaBucketsEmptied() {
        Object result = data.get("lavaBucketsEmptied");
        return (result instanceof Integer) ? ((Integer) result) : null;
    }

    @Override
    public int getCowsMilked() {
        Object result = data.get("cowsMilked");
        return (result instanceof Integer) ? ((Integer) result) : null;
    }

    @Override
    public int getMooshroomsMilked() {
        Object result = data.get("mooshroomsMilked");
        return (result instanceof Integer) ? ((Integer) result) : null;
    }

    @Override
    public int getMooshroomsSheared() {
        Object result = data.get("mooshroomsSheared");
        return (result instanceof Integer) ? ((Integer) result) : null;
    }

    @Override
    public int getSheepSheared() {
        Object result = data.get("sheepSheared");
        return (result instanceof Integer) ? ((Integer) result) : null;
    }

    @Override
    public int getSheepDyed() {
        Object result = data.get("sheepDyed");
        return (result instanceof Integer) ? ((Integer) result) : null;
    }

    @Override
    public int getLifetimeExpierience() {
        Object result = data.get("lifetimeExperience");
        return (result instanceof Integer) ? ((Integer) result) : null;
    }

    @Override
    public int getItemsEnchanted() {
        Object result = data.get("itemsEnchanted");
        return (result instanceof Integer) ? ((Integer) result) : null;
    }

    @Override
    public int getItemEnchantmentLevels() {
        Object result = data.get("itemEnchantmentLevels");
        return (result instanceof Integer) ? ((Integer) result) : null;
    }

    @Override
    public float getSessionTime() {
        Object result = data.get("sessionTime");
        return (result instanceof Float) ? ((Float) result) : null;
    }

    @Override
    public float getTotalTime() {
        Object result = data.get("totalTime");
        return (result instanceof Float) ? ((Float) result) : null;
    }

    @Override
    public boolean getOnline() {
        Object result = data.get("online");
        return (result instanceof Boolean) ? ((Boolean) result) : null;
    }

}
