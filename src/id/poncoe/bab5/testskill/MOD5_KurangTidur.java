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
public class MOD5_KurangTidur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal a = new Bird();
        a.breath();
        a.eat();
        System.out.println("");
        
        Flyable f = (Flyable) a;
        f.fly();
        
        Vehicle v = new Plane();
        v.move();
        System.out.println("");
        
        f = (Flyable) v;
        f.fly();
        
    }
}
