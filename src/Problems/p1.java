package Problems;
import java.util.*;
public class p1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student name : ");
		String name=sc.nextLine();
		int m1,m2,m3;
		System.out.println("Enter marks of 3 subjects(0-100) : ");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		int total = m1+m2+m3;
		double avg = total/3;
		if(avg>100 || avg<0 || m1<0 || m1>100 || m2<0 || m2>100 || m3<0 || m3>100) {
			System.out.println("Invalid marks");
		}
		else {
			System.out.println("Name of student = "+name);
			System.out.println("Total = "+total);
			System.out.println("Average = "+avg);
			if(avg>=90) {
				System.out.println("Grade = A");
			}
			else if(avg>=75 && avg<90) {
				System.out.println("Grade = B");
			}
			else if(avg>=50 && avg<75) {
				System.out.println("Grade = C");
			}
			else {
				System.out.println("Fail");
			}
		}
		sc.close();
	}
}
