/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samistine.inquisitorapi;

import java.text.DateFormat;
import java.util.concurrent.TimeUnit;

/**
 * Class intended for SamistineNetwork-Plotme/ThatGuy AI Robot
 *
 * @author Samuel
 */
public class StatsStringParser {

    private final DateFormat df;

    public StatsStringParser(DateFormat df) {
        this.df = df;
    }

    public String getTestString(PlayerStats stats) {
        StringBuilder sb = new StringBuilder();
        for (String tag : Statics.statsParseTags) {
            sb.append(tag).append("=").append("{" + tag + "}");
            sb.append("|");
        }
        return parseString(stats, sb.toString());
    }

    public String parseString(PlayerStats stats, String txt) {
        txt = txt.replace("{displayName}", stats.getDisplayName());
        //txt = txt.replace("{inventory}",);
        //txt = txt.replace("{armor}",);
        txt = txt.replace("{heldItemSlot}", Integer.toString(stats.getHeldItemSlot()));
        txt = txt.replace("{health}", Integer.toString(stats.getHealth()));
        txt = txt.replace("{remainingAir}", Integer.toString(stats.getRemainingAir()));
        txt = txt.replace("{fireTicks}", Integer.toString(stats.getFireTicks()));
        txt = txt.replace("{foodLevel}", Integer.toString(stats.getFoodLevel()));
        txt = txt.replace("{exhaustion}", Float.toString(stats.getExhaustion()));
        txt = txt.replace("{saturation}", Float.toString(stats.getSaturation()));
        txt = txt.replace("{gameMode}", stats.getGameMode().toLowerCase()); //Lowercase, since
        txt = txt.replace("{level}", Integer.toString(stats.getLevel()));
        txt = txt.replace("{exp}", Float.toString(stats.getExp()));
        txt = txt.replace("{totalExperience}", Integer.toString(stats.getTotalExperience()));
        //txt = txt.replace("{potionEffects}",);
        //txt = txt.replace("{server}",);
        txt = txt.replace("{world}", stats.getWorld());
        txt = txt.replace("{coords}", stats.getCoords().toString());
        //txt = txt.replace("{groups}",);
        txt = txt.replace("{money}", Double.toString(stats.getMoney()));
        //txt = txt.replace("{bedServer}",);
        txt = txt.replace("{bedWorld}", stats.getBedWorld());
        txt = txt.replace("{bedCoords}", stats.getBedCoords().toString());
        txt = txt.replace("{joins}", Integer.toString(stats.getJoins()));
        txt = txt.replace("{firstJoin}", df.format(stats.getFirstJoin()));
        txt = txt.replace("{lastJoin}", df.format(stats.getLastJoin()));
        txt = txt.replace("{quits}", Integer.toString(stats.getQuits()));
        txt = txt.replace("{lastQuit}", df.format(stats.getLastQuit()));
        txt = txt.replace("{kicks}", Integer.toString(stats.getKicks()));
        txt = txt.replace("{lastKick}", df.format(stats.getLastKickTime()));
        txt = txt.replace("{lastKickMessage}", stats.getLastKickMessage());
        txt = txt.replace("{deaths}", Integer.toString(stats.getDeaths()));
        //deathCauses
        txt = txt.replace("{lastDeath}", df.format(stats.getLastDeathTime()));
        txt = txt.replace("{lastDeathMessage}", stats.getLastDeathMessage());
        txt = txt.replace("{totalPlayersKilled}", Integer.toString(stats.getTotalPlayersKilled()));
        //txt = txt.replace("{playersKilled}",);
        //playersKilledByWeapon
        txt = txt.replace("{lastPlayerKill}", df.format(stats.getPlayersKilledLastTime()));
        txt = txt.replace("{lastPlayerKilled}", stats.getPlayersKilledLastName());
        txt = txt.replace("{totalMobsKilled}", Integer.toString(stats.getTotalMobsKilled()));
        //txt = txt.replace("{mobsKilled}",);
        //txt = txt.replace("{mobsKilledByWeapon}",);
        txt = txt.replace("{lastMobKill}", "Not Implemented");
        txt = txt.replace("{lastMobKilled}", "Not Implemented");
        txt = txt.replace("{totalBlocksBroken}", Integer.toString(stats.getTotalBlocksBroken()));
        //txt = txt.replace("{blocksBroken}",);
        txt = txt.replace("{totalBlocksPlaced}", Integer.toString(stats.getTotalBlocksPlaced()));
        //txt = txt.replace("{blocksPlaced}",);
        //txt = txt.replace("{animalsTamed}",);
        txt = txt.replace("{totalDistanceTraveled}", Float.toString(stats.getTotalDistanceTraveled()));
        //txt = txt.replace("{travelDistances}",);
        //txt = txt.replace("{biomeDistances}",);
        //txt = txt.replace("{travelTimes}",);
        //txt = txt.replace("{biomeTimes}",);
        txt = txt.replace("{totalItemsDropped}", Integer.toString(stats.getItemsDroppedCount()));
        //txt = txt.replace("{itemsDropped}",);
        txt = txt.replace("{totalItemsPickedUp}", Integer.toString(stats.getItemsPickedUpCount()));
        //txt = txt.replace("{itemsPickedUp}",);
        txt = txt.replace("{totalItemsCrafted}", Integer.toString(stats.getItemsCraftedCount()));
        //txt = txt.replace("{itemsCrafted}",);
        //txt = txt.replace("{eggsThrown}",);
        //txt = txt.replace("{foodEaten}",);
        txt = txt.replace("{timesSlept}", Integer.toString(stats.getTimesSlept()));
        txt = txt.replace("{arrowsShot}", Integer.toString(stats.getArrowsShot()));
        txt = txt.replace("{firesStarted}", Integer.toString(stats.getFiresStarted()));
        txt = txt.replace("{fishCaught}", Integer.toString(stats.getFishCaught()));
        txt = txt.replace("{chatMessages}", Integer.toString(stats.getChatMessages()));
        txt = txt.replace("{portalsCrossed}", Integer.toString(stats.getPortalsCroassed()));
        txt = txt.replace("{waterBucketsFilled}", Integer.toString(stats.getWaterBucketsFilled()));
        txt = txt.replace("{waterBucketsEmptied}", Integer.toString(stats.getWaterBucketsEmptied()));
        txt = txt.replace("{lavaBucketsFilled}", Integer.toString(stats.getLavaBucketsFilled()));
        txt = txt.replace("{lavaBucketsEmptied}", Integer.toString(stats.getLavaBucketsEmptied()));
        txt = txt.replace("{cowsMilked}", Integer.toString(stats.getCowsMilked()));
        txt = txt.replace("{mooshroomsMilked}", Integer.toString(stats.getMooshroomsMilked()));
        txt = txt.replace("{mooshroomsSheared}", Integer.toString(stats.getMooshroomsMilked()));
        txt = txt.replace("{sheepSheared}", Integer.toString(stats.getSheepSheared()));
        txt = txt.replace("{sheepDyed}", Integer.toString(stats.getSheepDyed()));
        txt = txt.replace("{lifetimeExperience}", Integer.toString(stats.getLifetimeExpierience()));
        txt = txt.replace("{itemsEnchanted}", Integer.toString(stats.getItemsEnchanted()));
        txt = txt.replace("{itemEnchantmentLevels}", Integer.toString(stats.getItemEnchantmentLevels()));
        txt = txt.replace("{sessionTime}", new TimeConverter((long) stats.getSessionTime()).get());
        txt = txt.replace("{totalTime}", new TimeConverter((long) stats.getTotalTime()).get());
        //txt = txt.replace("{lastUpdate}", getStat(Stat));
        //txt = txt.replace("{online}",);
        return txt;
    }

    private class TimeConverter {

        private final long seconds;

        protected TimeConverter(long seconds) {
            this.seconds = seconds;
        }

        protected String get() {
            return convertSecondsToHoursMinutes();
        }

        private String convertSecondsToHoursMinutes() {
            int hours = (int) TimeUnit.SECONDS.toHours(seconds);
            int minute = (int) TimeUnit.SECONDS.toMinutes(seconds - TimeUnit.HOURS.toSeconds(hours));
            switch (hours) {
                case 0:
                    return String.format("%s", minutes(minute).replace(" and ", ""));
                case 1:
                    return String.format("%s hour%s", hours, minutes(minute));
                default:
                    return String.format("%s hours%s", hours, minutes(minute));
            }
        }

        private String minutes(int minutes) {
            switch (minutes) {
                case 0:
                    return "";
                case 1:
                    return String.format(" and %s minute", minutes);
                default:
                    return String.format(" and %s minutes", minutes);
            }
        }
    }

}
