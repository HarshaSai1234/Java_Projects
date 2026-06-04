package SMS;

public class Student {
	String name;
	int rollNumber;
	double marks;
	Student(String name,int rollNumber, double marks) {
		this.name=name;
		this.rollNumber=rollNumber;
		this.marks=marks;
	}
	String isPass() {
		if(marks>=35) {
			return "Pass";
		}
		else {
			return "Fail";
		}
	}
	void displayDetails(){
		System.out.println("Name : "+name);
		System.out.println("Roll Number : "+rollNumber);
		System.out.println("Marks : "+marks);
		System.out.println("Result : "+ isPass());
	}
}
