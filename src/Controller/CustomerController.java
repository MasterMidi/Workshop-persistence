package controller;

import db.DBCustomer;
import db.DataAccessException;
import model.Customer;

public class CustomerController {
	private DBCustomer dbCustomer;
	
	public CustomerController()
	{
		this.dbCustomer = new DBCustomer();
	}
	
	public Customer findCustomer(String phoneNr) throws DataAccessException
	{
		return dbCustomer.findCustomer(phoneNr);
	}
}
