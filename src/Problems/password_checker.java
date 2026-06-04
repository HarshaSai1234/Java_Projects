package Problems;

import java.util.Scanner;

public class password_checker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your password : ");
		String pass = sc.nextLine();
		boolean hasLength=false;
		boolean hasUpper = false;
		boolean hasLower = false;
		boolean hasDigit = false;
		boolean hasSpecial = false;
		if(pass.length()>=8) {
			hasLength=true;
		}
		for(int i=0;i<pass.length();i++) {
			char ch = pass.charAt(i);
			
			if(Character.isUpperCase(ch)) {
				hasUpper=true;
			}
			if(Character.isLowerCase(ch)) {
				hasLower=true;
			}
			if(Character.isDigit(ch)) {
				hasDigit=true;
			}
			if(!Character.isLetterOrDigit(ch)) {
				hasSpecial=true;
			}
		}
		
		if(hasLength && hasUpper && hasLower && hasDigit && hasSpecial) {
			System.out.println("Strong Password!");
		}
		else {
			System.out.println("Weak Password!");
		}
		sc.close();
	}
}
