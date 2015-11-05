/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samistine.inquisitorapi.rest.objects;

import com.samistine.inquisitorapi.InqItem;
import com.samistine.inquisitorapi.InqPotionEffect;
import java.util.Arrays;

/**
 *
 * @author Samuel
 */
public class Stats {

    public String name;
    public String displayName;
    public String address;
    public InqItem[] inventory;
    public InqItem[] armor;
    public int heldItemSlot;
    public int health;
    public int remainingAir;
    public int fireTicks;
    public int foodLevel;
    public float exhaustion;
    public float saturation;
    public String gameMode;
    public int level;
    public float exp;
    public int totalExperience;
    public InqPotionEffect[] potionEffects;
    public String server;
    public String world;
    public String coords;
    public String[] groups;
    public double money;
    public String bedServer;
    public String bedWorld;
    public String bedCoords;
    public int joins;

    /**
     * Timestamp *
     */
    public String firstJoin;

    /**
     * Timestamp *
     */
    public String lastJoin;

    public int quits;

    /**
     * Timestamp *
     */
    public String lastQuit;

    public int kicks;

    /**
     * Timestamp *
     */
    public String lastKick;

    public String lastKickMessage;
    public int deaths;
    //MAPPED deathCauses;

    /**
     * Timestamp *
     */
    public String lastDeath;

    public String lastDeathMessage;
    public int totalPlayersKilled;
    //MAPPED playersKilled;
    //MAPPED playersKilledByWeapon;

    /**
     * Timestamp *
     */
    public String lastPlayerKill;

    public String lastPlayerKilled;
    public int totalMobsKilled;
    // MAPPED mobsKilled;
    //MAPPED mobsKilledByWeapon;

    /**
     * Timestamp *
     */
    public String lastMobKill;

    public String lastMobKilled;
    public int totalBlocksBroken;
    //MAPPED blocksBroken;
    public int totalBlocksPlaced;
    //MAPPED blocksPlaced;
    //MAPPED animalsTamed;
    public float totalDistanceTraveled;
    //MAPPED travelDistances;
    //MAPPED biomeDistances;
    //MAPPED travelTimes;
    //MAPPED biomeTimes;
    public int totalItemsDropped;
    //MAPPED itemsDropped;
    public int totalItemsPickedUp;
    //MAPPED itemsPickedUp;
    public int totalItemsCrafted;
    //MAPPED itemsCrafted;
    //MAPPED eggsThrown;
    //MAPPED foodEaten;
    public int timesSlept;
    public int arrowsShot;
    public int firesStarted;
    public int fishCaught;
    public int chatMessages;
    public int portalsCrossed;
    public int waterBucketsFilled;
    public int waterBucketsEmptied;
    public int lavaBucketsFilled;
    public int lavaBucketsEmptied;
    public int cowsMilked;
    public int mooshroomsMilked;
    public int mooshroomsSheared;
    public int sheepSheared;
    public int sheepDyed;
    public int lifetimeExperience;
    public int itemsEnchanted;
    public int itemEnchantmentLevels;
    public float sessionTime;
    public float totalTime;

    /**
     * Timestamp *
     */
    public String lastUpdate;

    public int online;

    @Override
    public String toString() {
        return "Stats{" + "name=" + name + ", displayName=" + displayName + ", address=" + address + ", inventory=" + Arrays.toString(inventory) + ", armor=" + Arrays.toString(armor) + ", heldItemSlot=" + heldItemSlot + ", health=" + health + ", remainingAir=" + remainingAir + ", fireTicks=" + fireTicks + ", foodLevel=" + foodLevel + ", exhaustion=" + exhaustion + ", saturation=" + saturation + ", gameMode=" + gameMode + ", level=" + level + ", exp=" + exp + ", totalExperience=" + totalExperience + ", potionEffects=" + Arrays.toString(potionEffects) + ", server=" + server + ", world=" + world + ", coords=" + coords + ", groups=" + Arrays.toString(groups) + ", money=" + money + ", bedServer=" + bedServer + ", bedWorld=" + bedWorld + ", bedCoords=" + bedCoords + ", joins=" + joins + ", firstJoin=" + firstJoin + ", lastJoin=" + lastJoin + ", quits=" + quits + ", lastQuit=" + lastQuit + ", kicks=" + kicks + ", lastKick=" + lastKick + ", lastKickMessage=" + lastKickMessage + ", deaths=" + deaths + ", lastDeath=" + lastDeath + ", lastDeathMessage=" + lastDeathMessage + ", totalPlayersKilled=" + totalPlayersKilled + ", lastPlayerKill=" + lastPlayerKill + ", lastPlayerKilled=" + lastPlayerKilled + ", totalMobsKilled=" + totalMobsKilled + ", lastMobKill=" + lastMobKill + ", lastMobKilled=" + lastMobKilled + ", totalBlocksBroken=" + totalBlocksBroken + ", totalBlocksPlaced=" + totalBlocksPlaced + ", totalDistanceTraveled=" + totalDistanceTraveled + ", totalItemsDropped=" + totalItemsDropped + ", totalItemsPickedUp=" + totalItemsPickedUp + ", totalItemsCrafted=" + totalItemsCrafted + ", timesSlept=" + timesSlept + ", arrowsShot=" + arrowsShot + ", firesStarted=" + firesStarted + ", fishCaught=" + fishCaught + ", chatMessages=" + chatMessages + ", portalsCrossed=" + portalsCrossed + ", waterBucketsFilled=" + waterBucketsFilled + ", waterBucketsEmptied=" + waterBucketsEmptied + ", lavaBucketsFilled=" + lavaBucketsFilled + ", lavaBucketsEmptied=" + lavaBucketsEmptied + ", cowsMilked=" + cowsMilked + ", mooshroomsMilked=" + mooshroomsMilked + ", mooshroomsSheared=" + mooshroomsSheared + ", sheepSheared=" + sheepSheared + ", sheepDyed=" + sheepDyed + ", lifetimeExperience=" + lifetimeExperience + ", itemsEnchanted=" + itemsEnchanted + ", itemEnchantmentLevels=" + itemEnchantmentLevels + ", sessionTime=" + sessionTime + ", totalTime=" + totalTime + ", lastUpdate=" + lastUpdate + ", online=" + online + '}';
    }

}
