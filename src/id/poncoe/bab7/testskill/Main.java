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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            int x[] = new int [3];
            System.out.println(7/x[0]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Terjadi Pengaksesan Array Diluar Batas");
        } catch (ArithmeticException e){
            System.out.println("Terjadi Pembagian dengan Nol");
        } catch (Exception e){
            System.out.println("Terjadi Pembagian dengan Nol");
        } finally {
            System.out.println("Blok Ini Pasti Dieksekusi");
        }
    }
    
}
