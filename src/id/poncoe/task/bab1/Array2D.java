/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.poncoe.task.bab1;

/**
 *
 * @author poncoe
 */
public class Array2D  {

    public static void main (String[] args) {
        
        int[][] bilangan = {{2,4,6}, {1,3,5,7,9}, {0}, {1,2,3,4,5,6,7,8,9,10}};
        for (int i = 0; i < bilangan.length; i++) {
            for (int j = 0; j < bilangan[i].length; j++) {
                System.out.print(bilangan[i][j]);
            }
            System.out.println();
            
        }
        
        
    }
    
}
