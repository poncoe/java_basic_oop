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
public class Video {
    private String resolution = "SD";
    private int bitRate = 3800;
    
    public void Video(int size, int res){
       
    }
    
    public void setBitRate(){
        this.bitRate = 3800;
        switch (bitRate) {
            case 3800:
                System.out.println("SD");
                break;
            case 4500:
                System.out.println("HD");
                break;
            case 6800:
                System.out.println("Full HD");
                break;
            default:
                System.out.println("yailaaa");
                break;
        }
    }
    
    public void setResolution(int res){
        switch (res) {
            case 1:
                System.out.println("SD");
                break;
            case 2:
                System.out.println("HD");
                break;
            case 3:
                System.out.println("Fill HD");
                break;
            default:
                System.out.println("ERROR");
                break;
        }
    }
    
    public String getResolution(){
        return resolution;
    }
    
    public int getBitRate(){
        return bitRate;
    }
    
    public void Open(){
        
    }
    
    public void download(){
        
    }
}
