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
public class MyException extends Exception{
    
    @Override
    public String getMessage(){
        return "Ini adalah Exception Buatan Sendiri";
    }
    
    class Employee {
        void showSalary(int x) throws Exception{
            if (x > 5){
                throw new MyException();
            }
        }
    }
    
    public static void main(String[]agrs) throws Exception{
       // new Employee().showSalary(7);
    }
    
}
