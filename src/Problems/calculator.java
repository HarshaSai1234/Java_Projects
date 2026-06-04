package Problems;

import java.util.Scanner;

public class calculator {
	
	
	static int add(int a,int b) {
		return a+b;
	}
	static int sub(int a,int b) {
		return a-b;
	}
	static int mul(int a,int b) {
		return a*b;
	}
	static int div(int a,int b) {
		return a/b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean loop = true;
		while(loop==true) {
			System.out.println("Enter 2 numbers : ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("Select your option : ");
			System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit");
			int choice = sc.nextInt();
			switch(choice) {
				case 1 : System.out.println(add(a,b));
					break;
				case 2: System.out.println(sub(a,b));
					break;
				case 3:System.out.println( mul(a,b));
					break;
				case 4: System.out.println(div(a,b));
					break;
				case 5: loop=false;
					break;
				default: System.out.println("Invalid choice");
			}
		}
		sc.close();
		
	}

}
