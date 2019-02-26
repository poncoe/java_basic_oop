/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.poncoe.bab4.task;

/**
 * @author poncoe
 */
public class Manajer {
    private Karyawan [] krywn = new Karyawan[8];
    private int gol;
    private double gadjieM;
    private int jml;
    
    public Manajer(String nama, double gadjie, int gol){
//        super.setNama(nama);
//        super.setGaji(gadjie);
        setGol(gol);
    }
    
    public void setGol(int gol){
        if (gol == 1) {
            this.gol = gol;
        } else if (gol == 2) {
            this.gol = gol;
        } else if (gol == 3){
            this.gol = gol;
        } else {
            this.gol = gol;
        }
    }
    
    public int getGol(){
        return gol;
    }
    
    public double getGajiM(){
        double gadjieT = 0;
        if(gol == 1){
            gadjieT = 1500000;
        } else if (gol == 2){
            gadjieT = 2000000;
        } else if (gol == 3){
            gadjieT = 3000000;
        } else {
            gadjieT = 1500000;
        }
//        return super.getGaji()+gadjieT;
        return 0;
    }
    
    public Karyawan getKrywn(int i){
        return krywn[i];
    }
    
    public void addKrywn(Karyawan k){
        if(jml < 8){
            this.krywn[jml] = k;
            jml++;
        }
    }
    
}
