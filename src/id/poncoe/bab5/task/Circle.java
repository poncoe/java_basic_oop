/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.poncoe.bab5.task;

/**
 *
 * @author Poncoe
 */
public class Circle implements Shape {
   double luas;
   int r;
   public double hitungLuas(){
       luas = phi * r * r;
       return luas;
   }
}