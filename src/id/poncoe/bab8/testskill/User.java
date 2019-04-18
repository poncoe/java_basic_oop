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
public class User {
    private String userId, username, password;
    private int totalSize = 0;
    private static int id = 0;
    
    public void User(String un, String pass){
        this.username = un;
        this.password = pass;
    }
    
    public String getUserId(){
        return username;
    }
    
    public String getUsername(){
        return username;
    }
    
    public void addMediaFile(MediaFile media){
        
    }
    
    public void ShowMedia(){
        
    }
    
}
