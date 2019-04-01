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
public class Circle implements GeometricObject {
   protected double radius = 1.0;
   protected double luas;
   int r;

   public void Circle(double radius){
       this.radius = radius;
   }
   
   public double getParameter(){
       radius = 2 * pi * r;
       return radius;
   }
   
   public double getArea(){
       luas = pi * r * r;
       return luas;
   }
   
}
