/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.poncoe.bab2.testskill;

/**
 *
 * @author poncoe
 */
public class MainEncapsulation01 {
    
    public static void main(String[] agrs) {
        
        Point p1 = new Point();
        p1.x = 25;
        p1.y = 7;
        
        Point p2 = new Point();
        p2.x = 32;
        p2.y = -17;
        
        Point p3 = p2;
        
        p3 = p1;
        
        System.out.println("Isi p 1 = "+p1.x+","+p1.y);
        System.out.println("");
        System.out.println("Isi p 2 = "+p2.x+","+p2.y);
        System.out.println("");
        System.out.println("Isi p 3 = "+p3.x+","+p3.y);
        System.out.println("");
        System.out.println("Isi p 3 = "+p3.x+","+p3.y);
        
        
    }
    
}
