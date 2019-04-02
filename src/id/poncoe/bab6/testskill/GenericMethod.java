/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.poncoe.bab6.testskill;

/**
 *
 * @author Poncoe
 */

import java.util.*;

public class GenericMethod {
    public static int average(List<Integer> list){
        int total = 0;
        for (int x : list){
            total = total+x;
        }
        return total/list.size();
    }
    
    public static double sum(List<? extends Number> list){
        double total = 0;
        for (Number x : list){
            total = total+x.doubleValue();
        }
        return total;
    }
    
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(45);
        list.add(75);
        list.add(35);
        System.out.println("Total: "+sum(list));
        System.out.println("Rata-Rata:"+average(list));
    }
    
}
