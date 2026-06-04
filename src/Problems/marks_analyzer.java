package Problems;

import java.util.Scanner;

public class marks_analyzer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students : ");
		int n = sc.nextInt();
		int[] stu = new int[n];
		System.out.println("Enter students marks : ");
		for(int i=0;i<n;i++) {
			stu[i]=sc.nextInt();
		}
		int min=stu[0];
		int max=stu[0];
		int sum=0;
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Marks : ");
		for(int i=0;i<n;i++) {
			if(stu[i]>=max) {
				max=stu[i];
			}
			if(stu[i]<=min) {
				min=stu[i];
			}
			sum+=stu[i];
			System.out.print(stu[i]+" ");
		}
		double avg = sum/n;
		int aavg=0;
		int bavg=0;
		for(int i=0;i<n;i++) {
			if(stu[i]>=avg) {
				aavg++;
			}
			if(stu[i]<avg) {
				bavg++;
			}
		}
		System.out.println();
		System.out.println("Highest = "+max);
		System.out.println("Lowest = "+min);
		System.out.println("Average = "+avg);
		System.out.println("No of students scored above average : "+aavg);
		System.out.println("No of students scored below average : "+bavg);
		
		
		sc.close();
	}
}
