/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.poncoe.task.bab1;

import java.util.Scanner;

/**
 *
 * @author poncoe
 */
public class ArrayMatriks {
    
    public static void main (String[] args){
        
         int x[][]=new int[3][3];
  
  for(int i=0;i<x.length;i++){
   for(int j=0;j<x.length;j++){
    System.out.println("Masukan Nilai ke ["+i+"]["+j+"] : ");
    x[i][j]=readData();
   }
  }
  System.out.println("Data Didalam Array");
  for(int i=0;i<x.length;i++){
   for(int j=0;j<x.length;j++){
    System.out.print(x[i][j]+" ");
   } 
   System.out.println();
  }
  }
  
  static int readData(){
   Scanner masuk=new Scanner(System.in);
   return masuk.nextInt();
  }
}