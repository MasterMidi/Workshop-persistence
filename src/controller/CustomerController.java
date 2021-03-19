package controller;

import db.CustomerDB;
import db.DataAccessException;
import model.Customer;

public class CustomerController {
	private CustomerDB dbCustomer;
	private Customer customer;

	public CustomerController() {
		this.dbCustomer = new CustomerDB();
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
