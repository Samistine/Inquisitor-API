/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samistine.inquisitorapi.rest.objects;

/**
 *
 * @author Samuel
 */
public class Response {

    private boolean success;
    private Result result;

    public class Result {

        private Stats stats;

        public Stats getStats() {
            return stats;
        }

        @Override
        public String toString() {
            return "Result{" + "stats=" + stats + '}';
        }

    }

    public Result getResult() {
        return result;
    }

    public boolean isSuccess() {
        return success;
    }

    @Override
    public String toString() {
        return "Response{" + "success=" + success + ", result=" + result + '}';
    }

}
