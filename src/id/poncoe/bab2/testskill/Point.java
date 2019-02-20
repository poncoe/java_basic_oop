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
public class Point {
        int x,y;
        
        void addKordinat (int x1, int y1, int x2, int y2){
            x1 = x1 + x2;
            y1 = y1 + y2;
        }
        
        void addKoordinat(Point p1, Point p2) {
            p1.x = p1.x + p2.x;
            p1.y = p1.y + p2.y;
    	}

    
    public Point(){
        //int x,y;
    }
    
}
