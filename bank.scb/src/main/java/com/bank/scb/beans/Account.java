package com.bank.scb.beans;

public class Account {

	private int id;
	private double balance;
	private Customer customer;
	
	public Account(int id) {
		super();
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public int getId() {
		return id;
	}
}
