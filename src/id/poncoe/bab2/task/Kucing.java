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
public class Kucing {
    
        private String Nama;
        private String Kelamin;
        private String Warna;
        private int umurkucing;
    
    public void setNama (String nama){
        Nama=nama;
    }
    public String getNama(){
        return Nama;
    }
        
    public void setUmur (int umur){
        umurkucing=umur;
    }
    public int getUmur(){
        return umurkucing;
    }
    
    public void setWarna (String warna){
        Warna=warna;
    }
    public String getWarna(){
        return Warna;
    }
    
    public void setKelamin (String kelamin){
        Kelamin=kelamin;
    }
    public String getKelamin(){
        return Kelamin;
    }
}
