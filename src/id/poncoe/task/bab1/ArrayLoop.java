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

// Membuat Array Looping melalui inputan

public class ArrayLoop {
    
    public static void main (String[] args) {
        
        // membuat array buah-buahan
        String[] arr = new String[5];

        // membuat scanner
        Scanner scan = new Scanner(System.in);

        // mengisi data ke array
        for( int i = 0; i < arr.length; i++ ){
            System.out.print("Isi Array [" + i + "] : ");
            arr[i] = scan.nextLine();
        }

        System.out.println("---------------------------");

        // menampilkan semua isi array
        for( String b : arr ){
            System.out.println(b);
        }  

        
    }
    
}
