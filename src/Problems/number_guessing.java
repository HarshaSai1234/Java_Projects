package Problems;
import java.util.*;
public class number_guessing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = (int)(Math.random()*100)+1;
		int guess=0;
		int g=0;
		while(g!=n) {
			guess++;
			System.out.println("Guess the number(0-100) : ");
			g = sc.nextInt();
			if(g==n) {
				System.out.println("Correct!");
				System.out.println("You guesssed the number in "+guess+" Guesses");
			}
			else if(g>n) {
				System.out.println("Too high");
			}
			else {
				System.out.println("Too low");
			}
		}
		sc.close();
	}
}
