/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Task1;

/**
 *
 * @author Mochamad Brilian Bani Adam
 * 22104410048
 */
public class Student {

    // Properties
    private String name;
    private int age;
    private String major;
    
    // Constructor
    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }
    // Getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    // Main method
    public static void main(String[] args) {
        Student student1 = new Student("Rehan", 20, "Computer Science");
        Student student2 = new Student("Lutfi", 22, "Math");
        
        System.out.println("Student 1:");
        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());
        System.out.println("Major: " + student1.getMajor());
        
        System.out.println("Student 2:");
        System.out.println("Name: " + student2.getName());
        System.out.println("Age: " + student2.getAge());
        System.out.println("Major: " + student2.getMajor());
    }
}

