/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zyh.java8.ea.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author zhyhang
 */
public class SortCompareLambda {
    
    public static void main(String[] argv){
        
            List<String> strList=Arrays.asList("yuhang.zhao","changbai.zheng","zipeng.dong","xuan.zheng");
            //a lambda 
            Collections.sort(strList, (String a,String b)->b.compareTo(a));
            System.out.println(strList);
            
        
    }
        
    
    
}
