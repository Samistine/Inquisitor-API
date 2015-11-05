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
public class ParsingError extends GeneralError {

    /**
     * Creates a new instance of <code>JSONException</code> without detail
     * message.
     */
    public ParsingError() {
    }

    /**
     * Constructs an instance of <code>JSONException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public ParsingError(String msg) {
        super(msg);
    }
}
