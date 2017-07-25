package com.bank.scb.utils;

public class AccountNumberGenerator {
	
	private AccountNumberGenerator(){}

	private static int accountCounter;
	static{
		accountCounter=1;
	}
	public static int generateAccountNumber(){
		return accountCounter++;
	}
}
