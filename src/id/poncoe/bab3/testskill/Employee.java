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
public class Employee {
    
    private String name;
    private long idEmployee;
    private double salary;
    
    public Employee(String name, long idEmployee, double salary){
        this.name=name;
        this.idEmployee=idEmployee;
        this.salary=salary;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public long getId(){
        return idEmployee;
    }
    
    public void setId (long id){
        this.idEmployee=id;
    }
    
    public double getSalary(){
        return salary;
    }
    
    public void setSalary(double salary){
        this.salary=salary;
    }
    
    // OVERLOADING //
    
    public Employee(String name, long id) {
        this.name = name;
        idEmployee = id;
    }

    public Employee(String name) {
        this.name = name;
    }

    
}
