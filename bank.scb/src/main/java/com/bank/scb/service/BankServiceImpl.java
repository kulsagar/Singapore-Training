package com.bank.scb.service;

import com.bank.scb.beans.Account;
import com.bank.scb.beans.Customer;
import com.bank.scb.exceptions.InsufficientAmountException;
import com.bank.scb.exceptions.InvalidAccountException;
import com.bank.scb.repo.AccountRepo;

public class BankServiceImpl implements BankService{

	private AccountRepo repo;
	
	public BankServiceImpl(AccountRepo repo) {
		super();
		this.repo = repo;
	}

	public String createAccount(Customer customer, double amount) throws InsufficientAmountException {
		return null;
	}

	public Account showBalance(int id) throws InvalidAccountException {
		return null;
	}

}
