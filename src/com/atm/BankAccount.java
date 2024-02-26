package com.atm;

public class BankAccount {
	private double balance;

	public BankAccount(double initialBalance) {
		this.balance = initialBalance;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited: " + amount);
	}

	public boolean withdraw(double amount) {
		if (amount > balance) {
			System.out.println("Insufficient funds");
			return false;
		}
		balance -= amount;
		System.out.println("Withdrawn: " + amount);
		return true;
	}
	
}
