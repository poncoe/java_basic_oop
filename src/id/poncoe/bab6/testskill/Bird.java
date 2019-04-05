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
public class Bird extends Animal {
    
    @Override
    public void showName(){
        System.out.println("Burunk");
    }
    
    @Override
    public void move(){
        System.out.println("Terbank");
    }
}
