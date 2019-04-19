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
public class Photo {
    private String resolution = "Standard";
    private Watermark watermark;
    private int size;
    
    public class Watermark {
        private String text;
        
        public void Watermark(String text){
            this.text = text;
        }
        
        public String getText(){
            return text;
        }
    }
    
    public void Photo(int size, int res){
        this.size = size;
        //this.resolution = res;
    }
    
    public void setResolution(int res){
        switch (res) {
            case 1:
                System.out.println("Standard");
                break;
            case 2:
                System.out.println("Medium");
                break;
            case 3:
                System.out.println("High");
                break;
            default:
                System.out.println("ERROR");
                break;
        }
    }
    
    public String getResolution(){
        return resolution;
    }
    
    public void Open(){
        
    }
    
    public void download(){
        
    }
    
    public void createWatermark(String text){
        
    }
    
    public Watermark getWatermark(){
        return watermark;
    }
    
}
