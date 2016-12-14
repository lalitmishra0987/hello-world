package com.lalit.threads;

public class Account {
	private int balance = 50;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void withdraw(int amount){
		this.balance -= amount; 
	}
}
