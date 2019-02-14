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
    private Kucing[] kucing;
    
    public PemilikKucing(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public Kucing getKucing(int n){
        return kucing[n];
    }
    
}
