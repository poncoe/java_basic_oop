/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.poncoe.bab3.testskill;

/**
 *
 * @author poncoe
 */
public class MainEmployee {
    
    public static void main (String[] agrs){
        Employee e = new Employee("Michael",533221, 7500000);
        System.out.println("");
        System.out.println("Employee 1");
        System.out.println("Employee Name: "+e.getName());
        System.out.println("Employee Id: "+e.getId());
        System.out.println("Employee Salary: "+e.getSalary());
        
        System.out.println("");
        
        Employee f = new Employee("Daisy",736721);
        f.setSalary(6700000);
        System.out.println("Employee 2");
        System.out.println("Employee Name: "+f.getName());
        System.out.println("Employee Id: "+f.getId());
        System.out.println("Employee Salary: "+f.getSalary());
    }
    
}
