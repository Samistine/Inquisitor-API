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
public class GeneralError extends Exception {

    /**
     * Creates a new instance of <code>GeneralError</code> without detail
     * message.
     */
    public GeneralError() {
    }

    /**
     * Constructs an instance of <code>GeneralError</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public GeneralError(String msg) {
        super(msg);
    }
}
