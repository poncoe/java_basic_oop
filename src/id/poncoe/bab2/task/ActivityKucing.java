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
        
        //Mendefinisikan Pemilk Kucing
        PemilikKucing poncoe = new PemilikKucing("Kucingnya Poncoe");
        poncoe.addKucing(Panda);
        
        System.out.println("Info Pemilik");
        System.out.println("");
        System.out.println("Nama Pemilik : "+poncoe.getName());
        System.out.println("");
        //poncoe = null;
        
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
        
        //Menampilkan Relasi Kucing dan si Pemilik Kuchink
        
        //for (int i = 0; i < poncoe.getNumOfKucing(); i++) {
//            System.out.println("Nama Kucing"+(i+1));
//            System.out.println(" Name "+poncoe.getKucing(i).getName());
//            System.out.println(" ID: "+poncoe.getKucing(i).getId());
//            System.out.println(" Salary: "+poncoe.getKucing(i).getSalary());
//            
//        }
        
   }
}
