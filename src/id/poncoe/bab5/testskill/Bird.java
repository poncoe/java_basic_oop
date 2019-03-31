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
public class Bird extends Animal implements Flyable {
    
    @Override
    public void breath(){
        System.out.println("Burung Bernafas menggunakan paru-paru");
    }
    
    @Override
    public void eat(){
        System.out.println("Burung Memakan Makanan");
    }
    
    @Override
    public void fly(){
        System.out.println("Burung Terbang dengan Sayap");
    }
}
