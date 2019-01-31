/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.poncoe.task.bab1.testskill;

/**
 *
 * @author PRAKTIKAN
 */
public class No1 {
    
    public static void main(String[] args) {
        
        int[][] matrix1 = {{1,2,3},{4,5,6}};
        int[][] matrix2 = {{1,0,1,1},{0,1,1,1},{0,1,0,0}};
        
        System.out.println("Matrix A :");
        System.out.println();
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j]);
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("Matrix B :");
        System.out.println();
        for (int i2 = 0; i2 < 3; i2++) {
            for (int j2 = 0; j2 < 4; j2++) {
                System.out.print(matrix2[i2][j2]);
                
            }
            System.out.println();
            
        }
    }
}