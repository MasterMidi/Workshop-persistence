package controller;

import db.DBCustomer;
import db.DataAccessException;
import model.Customer;

public class CustomerController {
	private DBCustomer dbCustomer;
	private Customer customer;

	public CustomerController() {
		this.dbCustomer = new DBCustomer();
	}

	public Customer findCustomer(String phoneNr) throws DataAccessException
	{
		this.customer = dbCustomer.findCustomer(phoneNr);
		return customer;
	}

	public Customer getCustomer() {
		return customer;
	}
}
