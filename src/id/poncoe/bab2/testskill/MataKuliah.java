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
public class MataKuliah {
    String namaMK;
    double uts,uas,tubes;
    
    double hitungNilai(){
        return 0.3 * uts + 0.4 * uas + 0.3 * tubes;
    }
    
    char hitungIndeks(){
        if (hitungNilai() >= 80) return 'A';
        else if (hitungNilai() >= 70) return 'B';
        else if (hitungNilai() >= 55) return 'C';
        else if (hitungNilai() >= 40) return 'D';
        else return 'E';
    }
    
}
