/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.poncoe.bab2.testskill;

/**
 *
 * @author PRAKTIKAN
 */
public class Student {
    
    String name;
    long studentId;
    Boolean isMale;
    double grade;
    
    public Student(String namee, long studentIdd, boolean isMalee, double gradee){
        this.name=namee;
        this.studentId=studentIdd;
        this.isMale=isMalee;
        this.grade=gradee;
    }
    
    public Student(String nameee, long studentIddd, boolean isMaleee){
        this.name=nameee;
        this.studentId=studentIddd;
        this.isMale=isMaleee;
    }
    
    public Student(String nameeee, long studentIdddd){
        this.name=nameeee;
        this.studentId=studentIdddd;
    }
    
    public void display() {
        System.out.println("Name: "+name);
        System.out.println("StudentID: "+studentId);
        if(isMale) {
            System.out.println("Sex: Male");
        } else {
            System.out.println("Sex: Female");
        }
        System.out.println("Grade: "+grade);
    }
    
    public static void main (String[] agrs){
        Student s1 = new Student("Max",321032,true,3.7);
        Student s2 = new Student("Anny",23331,true);
        Student s3 = new Student("Bobby",22122);
        System.out.println("Student 1");
        s1.display();
        System.out.println("");
        System.out.println("Student 2");
        s2.display();
        System.out.println("");
        System.out.println("Student 3");
        s3.display();
    }
    
}
