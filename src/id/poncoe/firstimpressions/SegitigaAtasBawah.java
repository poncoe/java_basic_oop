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
public class SegitigaAtasBawah {
    
    public static void main (String[] args) {
        
        for (int i=1;i<=4;i++){
             for(int j=4;j>=i;j--){
                 System.out.print(" ");
             }
             for(int k=1;k<=i;k++){
                 System.out.print("*");
             }
             for (int l=1;l<=i-1;l++){
                 System.out.print("*");
             }
             System.out.println();
         }
   for (int i=1;i<=5;i++){
             for(int j=1;j<=i-1;j++){
                 System.out.print(" ");
             }
             for(int z=5;z>=i;z--){
              System.out.print("*");
              }
             for(int k=4;k>=i;k--){
               System.out.print("*");
               }
             System.out.println("");
         }

  }

}

