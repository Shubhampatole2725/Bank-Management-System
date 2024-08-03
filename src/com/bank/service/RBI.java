package com.bank.service;

public interface RBI {
	
	void createAccount();
	void viewAccountDetails();
	void depositMoney(int dAmount);
	void withdrawMoney(int wAmount);
	void showBalance();

}
