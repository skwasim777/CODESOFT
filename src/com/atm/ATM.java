package com.atm;

import java.util.Scanner;

public class ATM {
	private BankAccount account;
	private Scanner scanner;

	public ATM(BankAccount account) {
		this.account = account;
		this.scanner = new Scanner(System.in);
	}
	
	public void displayMenu() {
		System.out.println("Welcome to the ATM");
		System.out.println("1. Withdraw");
		System.out.println("2. Deposit");
		System.out.println("3. Check Balance");
		System.out.println("4. Exit");
	}

	public void start() {
		int choice;
		do {
			displayMenu();
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				withdraw();
				break;
			case 2:
				deposit();
				break;
			case 3:
				checkBalance();
				break;
			case 4:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
		} while (choice != 4);
	}

	private void withdraw() {
		System.out.print("Enter amount to withdraw: ");
		double amount = scanner.nextDouble();
		if (account.withdraw(amount)) {
			System.out.println("Remaining balance: " + account.getBalance());
		}
	}

	private void deposit() {
		System.out.print("Enter amount to deposit: ");
		double amount = scanner.nextDouble();
		account.deposit(amount);
		System.out.println("Current balance: " + account.getBalance());
	}

	private void checkBalance() {
		System.out.println("Current balance: " + account.getBalance());
	}

	public static void main(String[] args) {
		BankAccount userAccount = new BankAccount(1000); 
		ATM atm = new ATM(userAccount);
		atm.start();
	}
}
