/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.poncoe.bab6.testskill;

/**
 *
 * @author Poncoe
 */
public class OuterDemo {
   private int num = 200;
   
   public int getNum(){
       return num;
   }
 
    class InnerDemo{
        public void print(){
            System.out.println("This is an Inner Class");
        }
    }
    
}
