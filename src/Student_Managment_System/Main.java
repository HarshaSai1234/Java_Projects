package Student_Managment_System;
import java.util.*;

import static java.lang.System.exit;

//Student details
class Student {
    int id;
    String name;
    int age;
    String branch;
    double cgpa;
    public Student(int id,String name,int age,String branch,double cgpa){
        this.id=id;
        this.name=name;
        this.age=age;
        this.branch=branch;
        this.cgpa=cgpa;
    }
    public String toString() {
        return "ID: " + id +
                ", Name: " + name +
                ", Age: " + age +
                ", Branch: " + branch +
                ", CGPA: " + cgpa;
    }
}

//Functions for main class
class Functions {
    Scanner sc = new Scanner(System.in);
    List<Student> list = new ArrayList<>();
    void addStudents() {
        System.out.println("Enter number of students to add: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++) {
            System.out.println("Enter ID number of student: ");
            int id = sc.nextInt();
            System.out.println("Enter name of student: ");
            String name=sc.nextLine();
            System.out.println("Enter age of student: ");
            int age = sc.nextInt();
            System.out.println("Enter branch of student: ");
            String branch = sc.nextLine();
            System.out.println("Enter cgpa of student: ");
            double cgpa = sc.nextDouble();
            list.add(new Student(id,name,age,branch,cgpa));
            System.out.println("Student added succesfully..."+name);
        }
    }
    void displayAll() {
        if(list.isEmpty()){
            System.out.println("No Students in the database...");
        }
        else{
            for(Student s: list){
                System.out.println(s);
            }
        }
    }

}

//Main Class
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Functions f = new Functions();
        while(true) {
            System.out.println("Enter your choice: ");
            System.out.println("1. Add Students\n2. Display all students\n3. Search Student by ID\n4. Delete Student by ID\n5. Update Student\n6. Exit");
            int choice=sc.nextInt();
            switch(choice) {
                case 1: f.addStudents();
                    break;
                case 2: f.displayAll();
                    break;
                case 3: ;
                    break;
                case 4:
                    break;
                case 5: ;
                    break;
                case 6: System.out.println("Exiting....");
                        System.exit(0);
                    break;
                default: System.out.println("Invalid choice...");
            }
        }
    }
}