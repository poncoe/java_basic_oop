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
    abstract class AnonyInner{
        public abstract void mymethod();
    }

public class OuterClass2 {
    public static void main(String[] args) {
        AnonyInner inner = new AnonyInner(){
            @Override
            public void mymethod(){
                System.out.println("Contoh dari Anony Innerclass");
            }
        };
        inner.mymethod();
    }
}
