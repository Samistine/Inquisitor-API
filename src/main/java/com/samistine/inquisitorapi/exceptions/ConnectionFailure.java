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
public class ConnectionFailure extends GeneralError {

    /**
     * Creates a new instance of <code>ConnectionFailure</code> without detail
     * message.
     */
    public ConnectionFailure() {
    }

    /**
     * Constructs an instance of <code>ConnectionFailure</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ConnectionFailure(String msg) {
        super(msg);
    }
}
