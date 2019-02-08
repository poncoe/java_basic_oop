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
public class Gedung {
    
    public String nama;
    public int lantai;
    public String warna;
    
    public Gedung(String namaa, int lantaii, String warnaa){
        nama = namaa;
        lantai = lantaii;
        warna = warnaa;
    }
    
    public void setWarna(String warna) {
        this.warna = "Merah";
        this.warna = "Putih";
        this.warna = "Biru";
        this.warna = "Hijau";
    }
    
    public String getWarna() {
        return warna;
    }
    
    public void setLantai (int lantai) {
        this.lantai = 10;
    }
    
    public int getLantai() {
        return lantai;
    }
    
    public void display() {
        System.out.println("Nama Gedung: "+nama);
        System.out.println("Jumlah Lantai: "+lantai);
        System.out.println("Warna Cat: "+warna);
    }
    
}
