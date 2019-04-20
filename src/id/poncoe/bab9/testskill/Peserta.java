package id.poncoe.bab9.testskill;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yishak
 */
public class Peserta {
    private static int id =1;
    private String idPeserta;
    private String namaPeserta;
    private char jeniskelamin;
    private ArrayList<String> daftarPelajaran;
    private String jadwal;

    public Peserta( String namaPeserta, char jeniskelamin, ArrayList<String> daftarPelajaran, String jadwal) {
        this.namaPeserta = namaPeserta;
        this.jeniskelamin = jeniskelamin;
        this.daftarPelajaran = daftarPelajaran;
        this.jadwal = jadwal;
        idPeserta = "Peserta-"+(id++);
    }

    public static int getId() {
        return id;
    }

    public String getIdPeserta() {
        return idPeserta;
    }
    public String toString(){
        String s = "ID: "+ idPeserta + "\n"
                +"Nama: "+namaPeserta + "\n"
                +"jenis kelamin : "+ jeniskelamin + "\n"
                +"Pelajaran: " + daftarPelajaran;
        return s;
    }
    
}
