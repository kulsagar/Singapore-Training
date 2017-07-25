package com.bank.scb.service;

import com.bank.scb.beans.Account;
import com.bank.scb.beans.Customer;
import com.bank.scb.exceptions.InsufficientAmountException;
import com.bank.scb.exceptions.InvalidAccountException;

public interface BankService {

	Account createAccount(Customer customer, double amount) throws InsufficientAmountException;
	
	Account showBalance(int id) throws InvalidAccountException;
}
