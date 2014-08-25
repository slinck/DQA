/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.operativecomputing.cl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author steve.linck
 */
public class CommanLine {
    
static final Logger logger = LogManager.getLogger(CommanLine.class.getName());

public static void getConn() {
    logger.trace("getConn Call");
}
    
}
