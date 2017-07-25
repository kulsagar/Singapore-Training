package com.bank.scb.repo;

import java.util.ArrayList;
import java.util.List;

import com.bank.scb.beans.Account;

public class AccountInMemoryRepo implements AccountRepo {

	private List<Account> accounts;
	
	public AccountInMemoryRepo() {
		super();
		accounts=new ArrayList<Account>();
	}

	public boolean save(Account a) {
		accounts.add(a);
		return true;
	}

	public Account find(int id) {
		return null;
	}

}
