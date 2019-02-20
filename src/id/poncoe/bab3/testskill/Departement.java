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
public class Departement {
    
    private String name;
    private int numOfEmployee;
    private Employee[] employee;
    
    public Departement(String name, int maxEmployee){
        this.name = name;
        employee = new Employee[maxEmployee];
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void addEmployee(Employee e){
        if (numOfEmployee < employee.length){
            employee[numOfEmployee] = e;
            numOfEmployee++;
        } else System.out.println("Maaf, tidak bisa tambah karyawan baru");
    }
    
    public Employee getEmployee(int n){
        return employee[n];
    }
    
    public int getNumOfEmployee(){
    return numOfEmployee;
}
    
}
