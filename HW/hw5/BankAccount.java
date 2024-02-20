package hw1;

public class BankAccount {
	private int accountNumber;
	private String name;
	private float balance;

	public BankAccount(int a, String n, float b) {
		accountNumber = a;
		name = n;
		balance = b;

	}

	public float getBalance() {
		return balance;

	}

	public int getAccountnum() {
		return accountNumber;
	}

	public void deposit(float amt) {
		if (amt < 0) {
			System.out.println("Cannot depost negative amount");
			return;
		} else {
			balance += amt;
		}

	}

	public void withdraw(float amt) {
		if (balance <= 0) {
			System.out.println("You got no money to take out");
		} else {
			balance -= amt;
		}

	}

	public void transfer(BankAccount account, float amt) {
		if ((this.balance - amt) <= 0) {
			System.out.println("Not enough money");
			return;

		}

		else {
			this.withdraw(amt);
			account.deposit(amt);
		}

	}

	public String toString() {
		return "Account Number: " + accountNumber + ", Name: " + name + ", Balance: " + balance;
	}

}
