/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samistine.inquisitorapi;

import java.io.Serializable;

/**
 *
 * @author Samuel
 */
public class InqPotionEffect implements Serializable {

    private final int duration;
    private final int amplifier;
    private final String type;

    public InqPotionEffect(int duration, int amplifier, String type) {
        this.duration = duration;
        this.amplifier = amplifier;
        this.type = type;
    }

    public int getDuration() {
        return duration;
    }

    public int getAmplifier() {
        return amplifier;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "InqPotionEffect{" + "duration=" + duration + ", amplifier=" + amplifier + ", type=" + type + '}';
    }

}
