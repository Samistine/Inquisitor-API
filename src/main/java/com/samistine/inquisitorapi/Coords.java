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
public class Coords implements Serializable {

    public double x;
    public double y;
    public double z;

    public Coords(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    @Override
    public String toString() {
        return x + "," + y + "," + z;
    }

}
