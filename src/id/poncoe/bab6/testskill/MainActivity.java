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
public class MainActivity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Animal burunk = new Bird();
        burunk.showName();
        burunk.move();
        System.out.println("");
        
        Animal meonk = new Cat();
        meonk.showName();
        meonk.move();
        System.out.println("");
        
        Animal ikan = new Fish();
        ikan.showName();
        ikan.move();
        System.out.println("");
    }
    
}
