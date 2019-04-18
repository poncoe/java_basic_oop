/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.poncoe.bab8.testskill;

/**
 *
 * @author poncoe
 */
public class MediaFile {
    private static int id = 0;
    private String name;
    private int size = 0;
    
    public void MediaFile(int size){
        this.size = size;
    }
    
    public void setSize(int size){
        this.size = size;
    }
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public int getSize(){
        return size;
    }
    
    public void open(){
        
    }
    
    public void download(){
        
    }
    
}
