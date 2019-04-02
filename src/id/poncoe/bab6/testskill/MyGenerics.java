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

public class MyGenerics<E> {
    private List<E> list = new ArrayList<>();
        public int getSize(){
            return list.size();
        }
        public void insert (E item){
            list.add(item);
        }
        public void printAll(){
            while(!list.isEmpty()){
                E item = list.remove(list.size()-1);
                System.out.println(item);
            }
        }
    public static void main(String[] args) {
        class Building{
            String address;
            Building(String address){
                this.address = address;
            }
            @Override
            public String toString(){
                return "Address: "+address;
            }
        }
        MyGenerics<Building> building = new MyGenerics<>();
        building.insert(new Building("JL A no 1"));
        building.insert(new Building("JL B no 2"));
        building.insert(new Building("JL C no 3"));
        building.printAll();
    }
    
}
