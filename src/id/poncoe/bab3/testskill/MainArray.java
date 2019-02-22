/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.poncoe.bab3.testskill;

/**
 *
 * @author poncoe
 */
public class MainArray {
    
    public static void main(String[]agrs){
        int matriks1[][] = new int [3][2];
        matriks1[0][0] = 7;
        matriks1[0][1] = -3;
        matriks1[1][0] = 4;
        matriks1[1][1] = -9;
        matriks1[2][0] = 12;
        matriks1[2][1] = 11;
        System.out.println("Isi Matriks ke-1: ");
        for (int i = 0; i < matriks1.length; i++) {
            for (int j = 0; j < matriks1[i].length; j++) {
                System.out.println(matriks1[i][j]+"\t");
            }
            System.out.println("");
        }
        int matriks2[][] = new int [2][];
        matriks2[0] = new int[2];
        matriks2[0][0] = 6;
        matriks2[0][1] = -7;
        matriks2[1] = new int[] {2,3,7,8};
        System.out.println("Isi Matriks ke-2:");
        for (int i = 0; i < matriks2.length; i++) {
            for (int j = 0; j < matriks2[i].length; j++) {
                System.out.println(matriks2[i][j]+"\t");
            }
            System.out.println();
            
        }
    }
    
}
