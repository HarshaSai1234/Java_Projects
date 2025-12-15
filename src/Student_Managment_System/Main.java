package Student_Managment_System;
import java.util.*;

//Student details
class Student {
    String id;
    String name;
    int age;
    String branch;
    double cgpa;
    public Student(String id,String name,int age,String branch,double cgpa){
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
        sc.nextLine();
        for(int i=0;i<n;i++) {
            System.out.println("Enter ID number of student: ");
            String id = sc.nextLine();
            System.out.println("Enter name of student: ");
            String name=sc.nextLine();
            System.out.println("Enter age of student: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter branch of student: ");
            String branch = sc.nextLine();
            System.out.println("Enter cgpa of student: ");
            double cgpa = sc.nextDouble();
            sc.nextLine();
            list.add(new Student(id,name,age,branch,cgpa));
            System.out.println("Student added successfully..."+name);
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
    void searchById(){
        System.out.println("Enter Id: ");
        String n=sc.nextLine();
        boolean found= false;
        for(Student s : list){
            if(s.id.equals(n)){
                System.out.println(s);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Student not found...");
        }
    }
    void deleteStudentById(){
        String id=sc.nextLine();
        
    }

}

//Main Class
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Functions f = new Functions();
        while(true) {
            System.out.println("Enter your choice: ");
            System.out.println("1. Add Students\n2. Display all students\n3. Search Student by ID\n4. Delete Student by ID\n5. Update Student\n6. Delete all\n7. Exit");
            int choice=sc.nextInt();
            switch(choice) {
                case 1: f.addStudents();
                    break;
                case 2: f.displayAll();
                    break;
                case 3: f.searchById();
                    break;
                case 4: f.deleteStudentById();
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7: System.out.println("Exiting....");
                        System.exit(0);
                    break;
                default: System.out.println("Invalid choice...");
            }
        }
    }
}