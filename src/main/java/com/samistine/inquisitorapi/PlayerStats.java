/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samistine.inquisitorapi;

import java.sql.Timestamp;
import java.util.List;
import org.json.simple.JSONObject;

/**
 *
 * @author Samuel
 */
public interface PlayerStats {

    /**
     * Gets the player's display name.
     * <p>
     * If the player's display name was changed while he was offline, this will
     * probably return his older display name
     *
     * @return Player's display name
     */
    public String getDisplayName();

    /**
     * Gets the player's display name, returning a default value if not found.
     * <p>
     * If the player's display name was changed while he was offline, this will
     * probably return his older display name
     *
     * @param def The default value to return if the display name is not found
     * @return Player's display name
     */
    public String getDisplayName(String def);

    /**
     * Gets the player's last client address.
     *
     * @return Player's Last Known Address
     */
    public String getAddress();

    /**
     * Gets the player's last client address, returning a default value if not
     * found.
     *
     * @param def The default value to return if the address is not found
     * @return Player's Last Known Address
     */
    public String getAddress(String def);

    /**
     * Player's inventory.<br>
     * In slot order.
     *
     * @return
     */
    public InqItem[] getInventory();

    public InqItem[] getInventory(InqItem[] def);

    /**
     * Player's armor.<br>
     * In slot order.
     *
     * @return
     */
    public InqItem[] getArmor();

    public InqItem[] getArmor();

    /**
     * The inventory slot number of which item is being held.
     * <p>
     * Since the value can never be null, and is by default 0, this will always
     * return a valid integer.
     *
     * @return The slot the item being held
     */
    public int getHeldItemSlot();

    /**
     * Player's health, from 0 to 20.
     * <p>
     * Since the value can never be null, and is by default 0, this will always
     * return a valid integer.
     *
     * @return
     */
    public int getHealth();

    /**
     * Player's remaining air from 0 to 300.
     * <p>
     * The value is never be null, and it's default value in the database is 0
     * <br>
     * <b>This will always return a valid integer.</b>
     *
     * @return
     */
    public int getRemainingAir();

    public int getRemainingAir();

    /**
     * Player's remaining fire ticks from -20 to 0.
     *
     * @return
     */
    public int getFireTicks();

    public int getFireTicks();

    /**
     * Player's food level from 0 to 20.
     *
     * @return
     */
    public int getFoodLevel();

    public int getFoodLevel();

    /**
     * Player's exhaustion.
     *
     * @return
     */
    public float getExhaustion();

    public float getExhaustion();

    /**
     * Player's saturation.
     *
     * @return
     */
    public float getSaturation();

    public float getSaturation();

    /**
     * Last game mode.
     *
     * @return
     */
    public String getGameMode();

    public String getGameMode();

    /**
     * Experience level.
     *
     * @return
     */
    public int getLevel();

    public int getLevel();

    /**
     * Amount of experience gained toward next level as a percentage.
     *
     * @return
     */
    public float getExp();

    public float getExp();

    /**
     * Total experience points.
     *
     * @return
     */
    public int getTotalExperience();

    public int getTotalExperience();

    /**
     * Current potion effects encoded as an array of strings.
     *
     * @return
     */
    public List<String> getPotionEffects();

    public List<String> getPotionEffects();

    /**
     * The name of the server the player was last on.
     *
     * @return
     */
    public String getServer();

    public String getServer();

    /**
     * The name of the world the player was last in.
     *
     * @return
     */
    public String getWorld();

    public String getWorld();

    /**
     * The coordinates where the player was last.
     *
     * @return
     */
    public Coords getCoords();

    public Coords getCoords();

    /**
     * The groups the player belongs to. <br>
     * This is only available if the Vault plugin is installed and providing
     * permissions integration.
     *
     * @return
     */
    public List<String> getGroups();

    public List<String> getGroups();

    /**
     * The amount of money the player has. <br>
     * This is only available if the Vault plugin is installed and providing
     * economy integration.
     *
     * @return
     */
    public double getMoney();

    public double getMoney();

    /**
     * The name of the server where the player's bed is located.
     *
     * @return
     */
    public String getBedServer();

    public String getBedServer();

    /**
     * The name of the world where the player's bed is located.
     *
     * @return
     */
    public String getBedWorld();

    public String getBedWorld();

    /**
     * The coordinates of the player's bed.
     *
     * @return
     */
    public Coords getBedCoords();

    public Coords getBedCoords();

    /**
     * Number of times the player has joined.
     *
     * @return
     */
    public int getJoins();

    public int getJoins();

    /**
     * Number of times the player has quit.
     *
     * @return
     */
    public int getQuits();

    public int getQuits();

    /**
     * The date and time of the first join.
     *
     * @return
     */
    public Timestamp getFirstJoin();

    public Timestamp getFirstJoin();

    /**
     * The date and time of the last join.
     *
     * @return
     */
    public Timestamp getLastJoin();

    public Timestamp getLastJoin();

    /**
     * The date and time of the last quit.
     *
     * @return
     */
    public Timestamp getLastQuit();

    public Timestamp getLastQuit();

    /**
     * Number of times the player has been kicked
     *
     * @return
     */
    public int getKicks();

    public int getKicks();

    /**
     * The date and time of the last kick.
     *
     * @return
     */
    public Timestamp getLastKickTime();

    public Timestamp getLastKickTime();

    /**
     * The message sent to the player during the last kick.
     *
     * @return
     */
    public String getLastKickMessage();

    public String getLastKickMessage();

    /**
     * Number of times the player has died.
     *
     * @return
     */
    public int getDeaths();

    public int getDeaths();

    /**
     * The causes of the player's deaths. <br>
     * This is a JSON object where each key is a reason and the corresponding
     * value is a count.
     *
     * @return
     */
    public JSONObject getDeathCauses();

    public JSONObject getDeathCauses();

    /**
     * The date and time the player last died.
     *
     * @return
     */
    public Timestamp getLastDeathTime();

    public Timestamp getLastDeathTime();

    /**
     * The message sent to the player when they last died.
     *
     * @return
     */
    public String getLastDeathMessage();

    public String getLastDeathMessage();

    /**
     * The number of other players killed by this player.
     *
     * @return
     */
    public int getTotalPlayersKilled();

    public int getTotalPlayersKilled();

    /**
     * A key based pair of other players killed by this player and the amount of
     * times.<br>
     * This is a JSON object where each key is a player name and the
     * corresponding value is a count.
     *
     * @return
     */
    public JSONObject getPlayersKilledMap();

    public JSONObject getPlayersKilledMap();

    /**
     * The weapons used to kill other players. <br>
     * This is a JSON object where each key is a weapon name and the
     * corresponding value is a count.
     *
     * @return
     */
    public JSONObject getPlayersKilledWeapons();

    public JSONObject getPlayersKilledWeapons();

    /**
     * The date and time when the last player killed by this player was killed.
     *
     * @return
     */
    public Timestamp getPlayersKilledLastTime();

    public Timestamp getPlayersKilledLastTime();

    /**
     * The name of the last player killed by this player.
     *
     * @return
     */
    public String getPlayersKilledLastName();

    public String getPlayersKilledLastName();

    /**
     * The number of mobs killed by this player.
     *
     * @return
     */
    public int getTotalMobsKilled();

    public int getTotalMobsKilled();

    /**
     * The mobs killed. <br>
     * This is a JSON object where each key is a mob name and the corresponding
     * value is a count.
     *
     * @return
     */
    public JSONObject getMobsKilledMap();

    public JSONObject getMobsKilledMap();

    /**
     * The weapons used to kill mobs. <br>
     * This is a JSON object where each key is a weapon name and the
     * corresponding value is a count.
     *
     * @return
     */
    public JSONObject getMobsKilledWeapons();

    public JSONObject getMobsKilledWeapons();

    /**
     * The date and time when the last mob killed by this player was killed.
     *
     * @return
     */
    public Timestamp getMobsKilledLastTime();

    public Timestamp getMobsKilledLastTime();

    /**
     * The name of the last player killed by this player ????
     *
     * @return
     */
    public String lastMobKilled();

    public String lastMobKilled();

    /**
     * The total number of blocks broken.
     *
     * @return
     */
    public int getTotalBlocksBroken();

    public int getTotalBlocksBroken();

    /**
     * The blocks broken. <br>
     * This is a JSON object where each key is a material name and the
     * corresponding value is a count.
     *
     * @return
     */
    public JSONObject getBlocksBrokenMap();

    public JSONObject getBlocksBrokenMap();

    /**
     * The total number of blocks placed.
     *
     * @return
     */
    public int getTotalBlocksPlaced();

    public int getTotalBlocksPlaced();

    /**
     * The blocks placed. <br>
     * This is a JSON object where each key is a material name and the
     * corresponding value is a count.
     *
     * @return
     */
    public JSONObject getBlocksPlacedMap();

    public JSONObject getBlocksPlacedMap();

    /**
     * Animals tamed by the player. <br>
     * This is a JSON object where each key is a mob name and the corresponding
     * value is a count.
     *
     * @return
     */
    public int getAnimalsTamedMap();

    public int getAnimalsTamedMap();

    /**
     * The total distance traveled.
     *
     * @return
     */
    public float getTotalDistanceTraveled();

    public float getTotalDistanceTraveled();

    /**
     * The distances traveled by different means. <br>
     * This is a JSON object where each key is a travel method and the
     * corresponding value is the number of meters travelled.
     *
     * @return
     */
    public JSONObject getDistancesTraveled();

    public JSONObject getDistancesTraveled();

    /**
     * The amount of time traveled by different means. <br>
     * This is a JSON object where each key is a travel method and the
     * corresponding value is the number of seconds travelled.
     *
     * @return
     */
    public JSONObject getTravelTimesMeans();

    public JSONObject getTravelTimesMeans();

    /**
     * The amount of time traveled in each type of biome. <br>
     * This is a JSON object where each key is a biome name and the
     * corresponding value is the number of seconds travelled.
     *
     * @return
     */
    public JSONObject getTravelTimesBiome();

    public JSONObject getTravelTimesBiome();

    /**
     * The total number of items dropped.
     *
     * @return
     */
    public int getItemsDroppedCount();

    public int getItemsDroppedCount();

    /**
     * This is a JSON object where each key is a material name and the
     * corresponding value is a count.
     *
     * @return
     */
    public JSONObject getItemsDroppedMap();

    public JSONObject getItemsDroppedMap();

    /**
     * The total number of items picked up.
     *
     * @return
     */
    public int getItemsPickedUpCount();

    public int getItemsPickedUpCount();

    /**
     * This is a JSON object where each key is a material name and the
     * corresponding value is a count.
     *
     * @return
     */
    public JSONObject getItemsPickedUpMap();

    public JSONObject getItemsPickedUpMap();

    /**
     * The total number of items crafted.
     *
     * @return
     */
    public int getItemsCraftedCount();

    public int getItemsCraftedCount();

    /**
     * This is a JSON object where each key is a material name and the
     * corresponding value is a count.
     *
     * @return
     */
    public JSONObject getItemsCraftedMap();

    public JSONObject getItemsCraftedMap();

    /**
     * This is a JSON object where each key is an egg type and the corresponding
     * value is a count.
     *
     * @return
     */
    public JSONObject getEggsThrownMap();

    public JSONObject getEggsThrownMap();

    /**
     * This is a JSON object where each key is an item name and the
     * corresponding value is a count.
     *
     * @return
     */
    public JSONObject getFoodEatenMap();

    public JSONObject getFoodEatenMap();

    /**
     * Number of times the player has slept in a bed.
     *
     * @return
     */
    public int getTimesSlept();

    public int getTimesSlept();

    public int getArrowsShot();

    public int getArrowsShot();

    public int getFiresStarted();

    public int getFiresStarted();

    public int getFishCaught();

    public int getFishCaught();

    public int getChatMessages();

    public int getChatMessages();

    public int getPortalsCroassed();

    public int getPortalsCroassed();

    public int getWaterBucketsFilled();

    public int getWaterBucketsFilled();

    public int getWaterBucketsEmptied();

    public int getWaterBucketsEmptied();

    public int getLavaBucketsFilled();

    public int getLavaBucketsFilled();

    public int getLavaBucketsEmptied();

    public int getLavaBucketsEmptied();

    public int getCowsMilked();

    public int getCowsMilked();

    public int getMooshroomsMilked();

    public int getMooshroomsMilked();

    public int getMooshroomsSheared();

    public int getMooshroomsSheared();

    public int getSheepSheared();

    public int getSheepSheared();

    public int getSheepDyed();

    public int getSheepDyed();

    public int getLifetimeExpierience();

    public int getLifetimeExpierience();

    public int getItemsEnchanted();

    public int getItemsEnchanted();

    public int getItemEnchantmentLevels();

    public int getItemEnchantmentLevels();

    public float getSessionTime();

    public float getSessionTime();

    public float getTotalTime();

    public float getTotalTime();

    public boolean getOnline();

    public boolean getOnline();

}
