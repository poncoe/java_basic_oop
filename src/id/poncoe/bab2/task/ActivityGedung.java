/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.poncoe.bab2.task;

import id.poncoe.bab2.task.Gedung;

/**
 *
 * @author poncoe
 */
public class ActivityGedung {
    
public static void main(String[] args) {
        Gedung g1 = new Gedung("GKU01",3,"Merah");
        Gedung g2 = new Gedung("Bangkit",5,"Biru");
        
        System.out.println("Gedung 1");
        g1.display();
        System.out.println("");
        System.out.println("Gedung 2");
        g2.display();
    }
    
}
