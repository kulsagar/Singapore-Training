package com.bank.scb.repo;

import com.bank.scb.beans.Account;

public interface AccountRepo {

	boolean save(Account a);
	Account find(int id);
}
