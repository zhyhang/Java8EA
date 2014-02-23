/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zyh.java8.ea.common;

/**
 *
 * @author zhyhang
 */
public class AutoUnBoxingTrap {
    
    public static void main(String[] argv) throws InterruptedException{
        //auto unboxing 
        //ternary operation will lead type conversion
        System.out.println(true?new Integer(1):new Double(2.0));
        
        //NullPointerException
        Integer i = new Integer(1);
	if (i.equals(1))
	    i = null;
        Object o = true ? i : new Double(2.0); // NullPointerException!
	System.out.println(o);
        
    }
    
}
