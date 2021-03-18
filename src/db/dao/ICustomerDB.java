package db.dao;



import db.DataAccessException;
import model.Customer;

public interface ICustomerDB {

    public Customer findCustomer(String phoneNr) throws DataAccessException;
}
