/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.poncoe.bab2.task;

/**
 *
 * @author poncoe
 */
public class ActivityKucing {
    public static void main(String [] args){
        
        //Mendefinisikan Gembul Kucing
        Kucing Gembul = new Kucing();
        Gembul.Nama = "Gembul";
        Gembul.setKelamin("Jantan");
        Gembul.setWarna("Abu-Abu");
        Gembul.setUmur(4);
        
        //Mendefinisikan Panda Kucing
        Kucing Panda = new Kucing();
        Panda.Nama = "Panda";
        Panda.setKelamin("Jantan");
        Panda.setWarna("Item Putih");
        Panda.setUmur(6);
        
        //Output si Gembul Kucing
        System.out.println("Nama  = "+ Gembul.Nama);
        System.out.println("Kelamin = "+ Gembul.getKelamin());
        System.out.println("Warna = "+ Gembul.getWarna());
        System.out.println("Umur = "+ Gembul.getUmur());
        
        System.out.println("");
        
        //Output si Panda Kucing
        System.out.println("Nama  = "+ Panda.Nama);
        System.out.println("Kelamin   = "+ Panda.getKelamin());
        System.out.println("Warna = "+ Panda.getWarna());
        System.out.println("Umur = "+ Panda.getUmur());
   }
}
