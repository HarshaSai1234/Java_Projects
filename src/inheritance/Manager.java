package inheritance;

public class Manager extends Employee {
	String department;
	Manager(String name, double salary,String department) {
		super(name, salary);
		this.department=department;
	}
	@Override
	void displayInfo() {
		super.displayInfo();
		System.out.println("Department : "+department);
	}

}
