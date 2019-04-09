/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.poncoe.bab7.testskill;

/**
 *
 * @author poncoe
 */
public class MainPinjamDuit {

    /**
     * @param args the command line arguments
     */
    
    class TolakException extends Exception{
        @Override
        public String getMessage(){
            return "Pelit Gamau Kasi Pinjem Duit";
        }
    }
    
    class Orang {
        protected String nama;
        public String pesan;
        
        public void Orang(String vnama){
            this.nama = vnama;
        }
        
        public String getNama(){
            return nama;
        }
        
        public void ngomong(String pesan){
            this.pesan = pesan;
        }
   
    }
    
    class OrangMiskin implements Kreditur {
        private int utang;
        public String nama;
        
        public void OrangMiskin(String nama, int utang){
            this.nama = nama;
            this.utang = utang;
        }
        
        public void pinjamDuit(Kreditur kreditur, int pinjaman){
            
        }

        @Override
        public void beriPinjaman(int duit) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    class OrangKaya {
        private int duit, pinjaman;
        public String nama;
        
        public void OrangKaya(String nama,int duit){
            this.nama = nama;
            this.duit = duit;
        }
        
        public void beriPinjaman(int pinjaman){
            this.pinjaman = pinjaman;
        }
    }
    
    class Bank {
        private Orang manager;
        private int asset, pinjaman;
        
        public void Bank(String vmanager, int asset){
            this.manager = vmanager;
            this.asset = asset;
        }
        
        public void beriPinjaman(int pinjaman){
            this.pinjaman = pinjaman;
        }
    
    public static void main(String[] args) {
        Bank bank1 = new Bank("ManagerBank 1",5000000);
    	OrangKaya amir = new OrangKaya("Amir",2000000);
    	OrangMiskin badu = new OrangMiskin("Badu",0);
    	badu.pinjamDuit((Kreditur) amir, 1000000);
    	badu.pinjamDuit((Kreditur) bank1, 800000);
    	badu.pinjamDuit((Kreditur) amir, 600000);
    }
  }
}
