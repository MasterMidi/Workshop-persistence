package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.dao.ICustomerDB;
import model.ContactInfo;
import model.Customer;
import model.DiscountGroup;

public class DBCustomer implements ICustomerDB {
	private final String FINDCUSTOMER = "SELECT phone_number, name,email,zipcode,city,address, customer_number,discount_id, customer.id as customer_id, type as discount_type, discount FROM customer "
			+ "INNER JOIN contact_info on customer.customer_number = customer.customer_number "
			+ "INNER JOIN discount_group on discount_id = discount_group.id " + "WHERE contact_info.phone_number = ?";

	@Override
	public Customer findCustomer(String phoneNr) throws DataAccessException {

		Customer customer = null;
		try {
			Connection con = DBConnection.getInstance().getConnection();

			PreparedStatement stmt = con.prepareStatement(FINDCUSTOMER);

			stmt.setString(1, phoneNr);

			ResultSet rs = stmt.executeQuery();

			customer = buildCustomer(rs);

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return customer;
	}

	private Customer buildCustomer(ResultSet rs) throws SQLException {

		// rs.getString("country")
		rs.next();

		// Null check?

		try {
			ContactInfo contactInfo = new ContactInfo(rs.getString("name"), rs.getString("address"),
					rs.getString("phone_number"), rs.getString("email"), rs.getInt("zipcode"), rs.getString("city"),
					"COUNTRY");
			DiscountGroup discountGroup = new DiscountGroup(rs.getString("discount_type"), rs.getDouble("discount"));

			Customer customer = new Customer(rs.getInt("customer_number"), contactInfo, discountGroup);

			return customer;
		} catch (SQLException e) {
			return null;
		}

	}

}
