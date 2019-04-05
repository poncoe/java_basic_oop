/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.poncoe.bab6.testskill;

/**
 *
 * @author poncoe
 */
public class Cat extends Animal {
    
    @Override
    public void showName(){
        System.out.println("Kuchink");
    }
    
    @Override
    public void move(){
        System.out.println("Jalan Kaki");
    }
}
