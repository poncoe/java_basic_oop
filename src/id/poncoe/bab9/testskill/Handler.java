package id.poncoe.bab9.testskill;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yishak
 */
public class Handler extends MouseAdapter implements AncestorListener{
    private  ArrayList<Peserta> daftarPeserta;
    private Jframe1 view;
    
    public Handler(){
        daftarPeserta = new ArrayList();
        view = new Jframe1();
        view.AddActionListener((ActionListener) this);
        view.addMouseAdapter(this);
        view.setId(Peserta.getId());
        view.setVisible(true);
        
    }
    

    @Override
    public void ancestorAdded(AncestorEvent event) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ancestorRemoved(AncestorEvent event) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ancestorMoved(AncestorEvent event) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String[] getDaftarPeserta(){
        String [] daftarID = new String[daftarPeserta.size()];
        for(int i = 0; i< daftarID.length; i++){
            daftarID[i] = daftarPeserta.get(i).getIdPeserta();
            
        }
        return daftarID;
    }
    public void actionPerformed(ActionEvent ae){
        
    }
    
}
