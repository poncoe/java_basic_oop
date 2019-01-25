package id.poncoe.firstimpressions;

import java.util.Scanner;

/**
 *
 * @author poncoe
 */
public class FirstImpressionArray {
    
    public static void main (String[] args) {
        
        // membuat array
        String[] nama = {"Annisa", "Putri", "Ayu", "Shiva", "Meonk"};
        
        //IO
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Annisa, Putri, Ayu, Shiva, Meonk");
        System.out.println("");
//        System.out.println("Masukan Angka yang ingin Anda Pilih : ");
//        System.out.println("");
//        String namain = in.next();
//        System.out.println("Nama Adalah "+nama);
        
        // mengambil data array
        System.out.println(nama[2]);
        System.out.println("Jumlah Array ada "+nama.length);
        
    }
    
}
