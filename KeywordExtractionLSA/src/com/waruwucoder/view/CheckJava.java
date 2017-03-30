/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.waruwucoder.view;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Waruwu
 */
public class CheckJava {
    
    public static void main(String[] args){
        
        List<String> doc1 = Arrays.asList("Lorem", "ipsum", "dolor", "ipsum", "sit", "ipsum");
        System.out.println(doc1.size());
        
        String do1 = "Hari ini";
        
        System.out.println(do1.toLowerCase());
        
        System.out.println(Math.log10(9/3));
        
        double a = 12.67812312421;
        double roundOff = Math.round(a * 100.0) /100.0;
        System.out.println(roundOff);
    }
    
}
