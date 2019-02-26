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
public class MainShape {
    public static void main(String[] args) {
        Shape a;
        Shape b;
        
        a = new Square();
        b = new Circle();
        TryShape x = new TryShape();
        TryShape y = new TryShape();
        x.showShape(a);
        y.showShape(b);
       
    }
}