package oops.banking;

import java.util.ArrayList;

public class Test_banking {

	public static void main(String[] args) {

		Bank bank = new Bank();
		Account account1 = new Account("Jawad", "C0011", 5000);
		Account account2 = new Account("Karim", "C0121", 4500);
		Account account3 = new Account("Ali Baba", "C0222", 20000);

		bank.addAccount(account1);
		bank.addAccount(account2);
		bank.addAccount(account3);

		ArrayList < Account > accounts = bank.getAccounts();

		for (Account account: accounts) {
			System.out.println(account.getAccountInfo());
			System.out.println();
		}
		System.out.println("\nAfter depositing 1000 into account1");
		bank.depositMoney(account1, 1000);
		System.out.println(account1.getAccountInfo());
		System.out.println("\nNo transaction in account2");
		System.out.println(account2.getAccountInfo());
		System.out.println("\nAfter withdrawing 5000 from account3");
		bank.withdrawMoney(account3, 5000);
		System.out.println(account3.getAccountInfo());
	}
}
