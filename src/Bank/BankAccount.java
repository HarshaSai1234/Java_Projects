package Bank;

public class BankAccount {
	String accountHolderName;
	int accountNumber;
	double balance=0;
	
	void deposit(int amount){
		balance+=amount;
		System.out.println("Amount succesfully deposited in your account");
	}
	
	void checkBalance() {
		System.out.println("Your account balance is : "+balance+" $");
	}
	void withdraw(int amount) {
		if(balance<0) {
			System.out.println("Withdrawal not allowed balance below 0");
		}
		else if(balance==0) {
			System.out.println("Balance is 0");
		}
		else if(amount>balance) {
			System.out.println("Insufficient balance");
		}
		else {
			balance-=amount;
			System.out.println("Amount withdrawed succesfully");
		}
	}
}
