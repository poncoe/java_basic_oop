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

public class DemoCollection2 {
    public static void main(String[] args) {
        Set collect = new TreeSet();
        class Person implements Comparable{
            String name;
            Person(String name){
                this.name = name;
            }
            @Override
            public String toString(){
                return name;
            }
            @Override
            public int compareTo(Object o){
                Person p = (Person) o;
                return name.compareTo(p.name);
            }
        }
        collect.add(new Person("Dono"));
        collect.add(new Person("Bona"));
        collect.add(new Person("Roni"));
        for (Object p : collect){
            System.out.println(p);
        }
    }
    
}
