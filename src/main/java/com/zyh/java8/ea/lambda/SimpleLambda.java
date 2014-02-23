/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zyh.java8.ea.lambda;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zhyhang
 */
public class SimpleLambda {
    
    public static void main(String... argv){
        new Thread(()->{
            System.out.println("running");
            try {
                TimeUnit.SECONDS.sleep(15);
            } catch (InterruptedException ex) {
                Logger.getLogger(SimpleLambda.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("over!");
        }).start();
    }
    
}
