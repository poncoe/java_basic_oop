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
public class SampleCollection {
    public static void main(String[] args) {
        class Person{
            String name;
            Person(String name){
                this.name = name;
            }
            @Override
            public String toString(){
                return name;
            }
        }
        List list = new LinkedList();
        list.add("Hello");
        list.add(new Person("Codot"));
        list.add(23);
        list.add(true);
        list.add(33.23);
        for (Object x : list){
            System.out.println(x);
        }
        list.remove(3);
        list.remove(1);
        for (Object x : list){
            System.out.println(x);
        }
    }
    
}
