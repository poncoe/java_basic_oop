/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.poncoe.bab5.testskill;

/**
 *
 * @author Poncoe
 */
public class Plane implements Flyable, Vehicle {
    private int velocity;
    
    @Override
    public void fly(){
        System.out.println("Plane Flying using Jet Machine");
    }
    
    @Override
    public void move(){
        velocity++;
        System.out.println("Velocity "+velocity);
    }
    
    @Override
    public void brake(){
        if(velocity>0) velocity--;
        System.out.println("Velocity"+velocity);
    }
    
}
