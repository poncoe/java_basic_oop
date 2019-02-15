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
        Gembul.setNama("Gembul");
        Gembul.setKelamin("Jantan");
        Gembul.setWarna("Abu-Abu");
        Gembul.setUmur(4);
        
        //Mendefinisikan Panda Kucing
        Kucing Panda = new Kucing();
        Panda.setNama("Panda");
        Panda.setKelamin("Jantan");
        Panda.setWarna("Item Putih");
        Panda.setUmur(6);
        
        //Mendefinisikan Pemilk Kucing
        PemilikKucing poncoe = new PemilikKucing("Poncoe",2);
        poncoe.addKucing(Panda);
        poncoe.addKucing(Gembul);
        
        System.out.println("=======================");
        System.out.println("Informasi Pemilik");
        System.out.println("=======================");
        System.out.println("");
        System.out.println("Nama Pemilik : \n"+poncoe.getName());
        System.out.println("");
        //poncoe = null;
        
//        //Output si Gembul Kucing
//        System.out.println("Nama  = "+ Gembul.Nama);
//        System.out.println("Kelamin = "+ Gembul.getKelamin());
//        System.out.println("Warna = "+ Gembul.getWarna());
//        System.out.println("Umur = "+ Gembul.getUmur());
//        
//        System.out.println("");
//        
//        //Output si Panda Kucing
//        System.out.println("Nama  = "+ Panda.Nama);
//        System.out.println("Kelamin   = "+ Panda.getKelamin());
//        System.out.println("Warna = "+ Panda.getWarna());
//        System.out.println("Umur = "+ Panda.getUmur());
        
        //Menampilkan Relasi Kucing dan si Pemilik Kuchink
        
        for (int i = 0; i < poncoe.getNumOfKucing(); i++) {
            System.out.println("Nama Kucingnya si "+poncoe.getName()+" Yang Ke-"+(i+1));
            System.out.println("");
            System.out.println(" Name "+poncoe.getKucing(i).getNama());
            System.out.println(" Kelamin: "+poncoe.getKucing(i).getKelamin());
            System.out.println(" Warna: "+poncoe.getKucing(i).getWarna());
            System.out.println(" Umur: "+poncoe.getKucing(i).getUmur());
            System.out.println("");
            
        }
        
   }
}
