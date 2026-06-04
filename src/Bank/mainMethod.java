package Bank;

import java.util.Scanner;

public class mainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean loop=true;
		BankAccount b = new BankAccount();
		while(loop) {
			System.out.println("Enter your choice : ");
			System.out.println("1. Deposit amount\n2. Withdraw Amount\n3. Check Balance\n4. Exit");
			int ch = sc.nextInt();
			switch(ch) {
				case 1: int amount;
						System.out.println("Enter amount to deposit : ");
						amount = sc.nextInt();
						b.deposit(amount);
						break;
				case 2: System.out.println("Enter amount to withdraw : ");
						amount = sc.nextInt();
						b.withdraw(amount);
						break;
				case 3: b.checkBalance();
						break;
				case 4 : loop=false;
						break;
				default : System.out.println("Invalid choice");
							break;
			
			}
			
		}
		sc.close();
	}

}
