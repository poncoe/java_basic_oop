/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.poncoe.bab6.testskill;

import java.util.*;

/**
 *
 * @author Poncoe
 */
public class DemoCollection {
    public static void main(String[] args) {
        Set collect = new LinkedHashSet();
        collect.add(10);
        collect.add(3);
        collect.add(7);
        collect.add(null);
        collect.add(4);
        collect.add(7);
        collect.add(9);
        for (Object a : collect){
            System.out.println(a);
        }
    }
    
}
