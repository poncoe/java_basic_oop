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
        Gembul.Kelamin = "Jantan";
        Gembul.Warna = "Abu-Abu";
        Gembul.setUmur(4);
        
        //Mendefinisikan Panda Kucing
        Kucing Panda = new Kucing();
        Panda.Nama = "Gembul";
        Panda.Kelamin = "Jantan";
        Panda.Warna = "Item Putih";
        Panda.setUmur(6);
        
        //Output si Gembul Kucing
        System.out.println("Nama  = "+ Gembul.Nama);
        System.out.println("Kelamin = "+ Gembul.Kelamin);
        System.out.println("Warna = "+ Gembul.Warna);
        System.out.println("Umur = "+ Gembul.getUmur());
        
        System.out.println("");
        
        //Output si Panda Kucing
        System.out.println("Nama  = "+ Panda.Nama);
        System.out.println("Kelamin   = "+ Panda.Kelamin);
        System.out.println("Warna = "+ Panda.Warna);
        System.out.println("Umur = "+ Panda.getUmur());
   }
}
