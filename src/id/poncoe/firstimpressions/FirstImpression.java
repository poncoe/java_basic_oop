/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.poncoe.firstimpressions;

/**
 *
 * @author poncoe
 */
public class FirstImpression {
    
    public static void main(String[] args) {
        
        //Segitiga Kiri //
    
    //for (int b=1; b<=5; b++){ (Outer Loop)
//            for(int c=1; c<=b; c++){ (Inner Loop)
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Segitiga Kanan //

            for (int b=1;b<=5;b++){
            for(int c=4; c>=b; c--){ //spasi (Outer Loop)
                System.out.print(" ");
            }
            for(int d=1;d<=b;d++){ //bintang (Inner Loop)
                System.out.print("*");
            }
            System.out.println();
        }
    }

}