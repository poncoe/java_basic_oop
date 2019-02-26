/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.poncoe.bab4.task;

/**
 * @author poncoe
 */
public class Karyawan {
    
    private String nama;
    private double gaji;
    
    public Karyawan (String nama, double gadjie){
        this.nama=nama;
        this.gaji=gadjie;
    }
    
    public void setNama(String nama){
        this.nama=nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void getGaji(double gadjie){
        this.gaji=gadjie;
    }
    
    public double getGaji(){
        return gaji;
    }
}
