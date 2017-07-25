package com.bank.scb;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.bank.scb.beans.Customer;
import com.bank.scb.exceptions.InsufficientAmountException;
import com.bank.scb.repo.AccountInMemoryRepo;
import com.bank.scb.service.BankService;
import com.bank.scb.service.BankServiceImpl;


public class BankTest{

	private BankService service;
	
	@Before
	public void init(){
		
		service = new BankServiceImpl(new AccountInMemoryRepo());
	}
	@Test
	public void user_creates_account_with_valid_name_and_amount(){
		
		try {
			assertEquals(300, service.createAccount(new Customer("Sagar Kulkarni"), 300).getBalance(),0);
		} catch (InsufficientAmountException e) {
			e.printStackTrace();
		}
	}
	
	@Test(expected=InsufficientAmountException.class)
	public void user_creates_account_with_insufficient_amount() throws InsufficientAmountException{
		
		service.createAccount(new Customer("Sagar Kulkarni") , 50);
	}
	
	@Test
	public void user_creates_account_with_invalid_name(){
		
		try {
			assertEquals(null, service.createAccount(new Customer(null), 300));
		} catch (InsufficientAmountException e) {
			e.printStackTrace();
		}
	}
	
}
