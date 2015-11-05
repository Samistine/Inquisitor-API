/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samistine.inquisitorapi.exceptions;

/**
 *
 * @author Samuel
 */
public class PlayerNotFoundException extends GeneralError {

    /**
     * Creates a new instance of <code>PlayerNotFoundException</code> without
     * detail message.
     */
    public PlayerNotFoundException() {
    }

    /**
     * Constructs an instance of <code>PlayerNotFoundException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public PlayerNotFoundException(String msg) {
        super(msg);
    }
}
