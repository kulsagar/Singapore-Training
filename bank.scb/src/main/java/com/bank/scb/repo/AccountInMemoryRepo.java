package com.bank.scb.repo;

import com.bank.scb.beans.Account;

public class AccountInMemoryRepo implements AccountRepo {

	public boolean save(Account a) {
		return false;
	}

	public Account find(int id) {
		return null;
	}

}
