/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.poncoe.bab2.testskill;

/**
 *
 * @author PRAKTIKAN
 */
public class MainEncapsulation03 {
    
    public static void main (String[] agrs){
        MataKuliah mk = new MataKuliah();
        mk.namaMK = "Bahasa Inggris";
        mk.tubes = -70;
        mk.uas = 130;
        mk.uts = 1700;
        
        System.out.println("Nilai "+mk.namaMK);
        System.out.println("UTS "+mk.uts);
        System.out.println("UAS "+mk.uas);
        System.out.println("Nilai Akhir = "+mk.hitungNilai());
        System.out.println("Index Akhir "+mk.hitungIndeks());
        
    }
    
}
