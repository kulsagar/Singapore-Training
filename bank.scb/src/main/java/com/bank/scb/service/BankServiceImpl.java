package com.bank.scb.service;

import com.bank.scb.beans.Account;
import com.bank.scb.beans.Customer;
import com.bank.scb.exceptions.InsufficientAmountException;
import com.bank.scb.exceptions.InvalidAccountException;
import com.bank.scb.repo.AccountRepo;
import com.bank.scb.utils.AccountNumberGenerator;

public class BankServiceImpl implements BankService{

	private AccountRepo repo;
	
	public BankServiceImpl(AccountRepo repo) {
		super();
		this.repo = repo;
	}

	public Account createAccount(Customer customer, double amount) throws InsufficientAmountException {
		if(customer.getName()==null){
			return null;
		}
		if(amount<100){
			throw new InsufficientAmountException();
		}
		int accountNumber = AccountNumberGenerator.generateAccountNumber();
		Account account = new Account(accountNumber);
		account.setCustomer(customer);
		account.setBalance(amount);
		if(repo.save(account)){
			return account; 
		}
		return null;
	}

	public Account showBalance(int id) throws InvalidAccountException {
		return null;
	}

}
