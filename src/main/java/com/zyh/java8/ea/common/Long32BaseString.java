/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zyh.java8.ea.common;

/**
 * test a long value convert to string base differenct radix.
 * check the string's length
 * @author zhyhang
 */
public class Long32BaseString {
    
    public static void main(String... argv){
        long num=1024l*1024*1024*100+3;
        System.out.println(String.valueOf(num));
        System.out.println(Long.toString(num, 36));
        System.out.println(Long.toHexString(num));
    }
}
