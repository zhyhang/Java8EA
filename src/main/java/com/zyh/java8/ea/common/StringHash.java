/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zyh.java8.ea.common;

/**
 * reference:<br>
 * <a href="http://stackoverflow.com/questions/1660501/what-is-a-good-64bit-hash-function-in-java-for-textual-strings">ref1</a><br>
 *<a href="http://www.partow.net/programming/hashfunctions/index.html">ref2</a><br>
 * 
 * @author zhyhang
 */
public class StringHash {

    private static long hashCode(String s) {
        long h = 1125899906842597L; // prime
        int len = s.length();

        for (int i = 0; i < len; i++) {
            h = 31 * h + s.charAt(i);
        }
        return h;
    }
    
    public static void main(String... argv){
        System.out.println(hashCode("CAESEPURA0SOUilCSemR0uk27YE"));
        System.out.println(hashCode("CAESEERwysQ-bNyGoCm6AYFXsGY"));
        System.out.println(hashCode("CAESENj00bO2ew-C_xzuMzbYe5U"));
        
    }

}
