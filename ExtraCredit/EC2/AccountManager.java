package hw1;

public class AccountManager {

	private BankAccount[] accounts;
	private int numAccounts;

	public AccountManager(int size) {
		accounts = new BankAccount[size];
		numAccounts = 0;
	}

	public void create(int accountNumber, String name, float balance) {
		if (numAccounts < accounts.length) {
			accounts[numAccounts++] = new BankAccount(accountNumber, name, balance);
		}
	}

	public void deposit(int accountNum, float amt) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getAccountnum() == accountNum) {
				accounts[i].deposit(amt);

			}
		}

	}

	public void withdraw(int accountNum, float amt) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getAccountnum() == accountNum) {
				accounts[i].withdraw(amt);

			}
		}

	}

	public void transfer(int accountNum1, int accountNum2, float amt) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getAccountnum() == accountNum1) {
				for (int j = 0; j < accounts.length; j++) {
					if (accounts[j].getAccountnum() == accountNum2) {
						accounts[i].transfer(accounts[j], amt);

					}
				}

			}
		}

	}

	public void printAllAccounts() {
		for (int i = 0; i < numAccounts; i++) {
			System.out.println(accounts[i]);
		}

	}

}
