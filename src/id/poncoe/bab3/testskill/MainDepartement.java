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
public class MainDepartement {
    
    public static void main(String[] agrs){
        Employee e1 = new Employee("Michael", 735443, 750000);
        Employee e2 = new Employee("Daisy", 835443, 580000);
        Departement d = new Departement("Public Relantion",20);
        d.addEmployee(e1);
        d.addEmployee(e2);
        System.out.println("Departement Info");
        System.out.println("");
        System.out.println("Dept Name : "+d.getName());
        System.out.println("Dept Employee");
        d = null;
        System.out.println("Employee Num-1");
        System.out.println("Name : "+e1.getName());
        System.out.println("ID : "+e1.getId());
        System.out.println("Salary : "+e1.getSalary());
        System.out.println("");
        System.out.println("Employee Num-2");
        System.out.println("Name : "+e2.getName());
        System.out.println("ID : "+e2.getId());
        System.out.println("Salary : "+e2.getSalary());
        
//        for (int i = 0; i < d.getNumOfEmployee(); i++) {
//            System.out.println("Employee Name"+(i+1));
//            System.out.println(" Name "+d.getEmployee(i).getName());
//            System.out.println(" ID: "+d.getEmployee(i).getId());
//            System.out.println(" Salary: "+d.getEmployee(i).getSalary());
//            
//        }
    }
    
}
