/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samistine.inquisitorapi;

import com.samistine.inquisitorapi.exceptions.GeneralError;
import java.util.UUID;

/**
 *
 * @author Samuel
 */
public interface InquisitorPlayer {
   
    
    public String getName();
    public UUID getUniqueID();
    
    /**
     * Issues a THREAD_LOCKING task to get this players stats,
     * <b>Remember to save the results, secondary calls are not cached
     * @return 
     * @throws com.samistine.inquisitorapi.exceptions.GeneralError 
     */
    public PlayerStats getPlayerStats() throws GeneralError;
    
}
