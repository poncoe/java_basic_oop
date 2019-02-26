/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.poncoe.bab5.task;

/**
 *
 * @author poncoe
 */
public class TryShape {
    public void showShape(Shape s){
        if (s instanceof Circle){
            System.out.println("Ini Adalah Lingkaran");
        } else if (s instanceof Square){
            System.out.println("Ini Adalah Persegi");
        } else {
            System.out.println("Ini Bukan Shape");
        }
    }
    
}
