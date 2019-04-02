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
public class OuterClass {
    void myMethod(){
        int num = 23;
        class MethodInnerDemo {
            public void print(){
                System.out.println("This is method inner class "+ num);
            }
        }
        MethodInnerDemo inner = new MethodInnerDemo();
        inner.print();
    }
    
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.myMethod();
    }
    
}
