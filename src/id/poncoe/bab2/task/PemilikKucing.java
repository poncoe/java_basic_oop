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
public class PemilikKucing {
    
    private String name;
    private int jumlahMeonk;
   // private Kucing kucing;
    private Kucing[] kucing;
    
    public PemilikKucing(String name, int maxKucing){
        this.name = name;
        kucing = new Kucing[maxKucing];
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
//    public void addKucing(Kucing meonk){
//        this.kucing=meonk;
//    }
    
    public void tambahKucink(Kucing meonk){
        if (jumlahMeonk < kucing.length){
            kucing[jumlahMeonk] = meonk;
            jumlahMeonk++;
        } else 
            System.out.println("(ERROR!) Maaf, tidak bisa tambah kuchink baru");
            System.out.println("");
    }
    
    public int getJumlahMeonk(){
    return jumlahMeonk;
}
    
    public Kucing getKucing(int n){
        //return kucing;
        return kucing[n];
    }
    
}
