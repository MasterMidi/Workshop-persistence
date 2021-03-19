package db;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalTime;
import java.time.ZoneOffset;

import db.dao.IOrderDB;
import model.Order;
import model.SaleOrder;

public class OrderDB implements IOrderDB {

	private static final String INSERT_ORDER = "insert into [order] values(?, ?, ?, ?, (select id from customer where customer_number = ?))";
	private static final String INSERT_SALE_ORDER = "insert into sale_order values(?, ?, ?)";

	private PreparedStatement insertOrderQ;
	private PreparedStatement insertSaleOrderQ;

	@Override
	public int insertOrder(Order order) {
		int id = -1;

		try {
			insertOrderQ = DBConnection.getInstance().getConnection().prepareStatement(INSERT_ORDER, Statement.RETURN_GENERATED_KEYS);
			insertSaleOrderQ = DBConnection.getInstance().getConnection().prepareStatement(INSERT_SALE_ORDER, Statement.RETURN_GENERATED_KEYS);

			insertOrderQ.setString(1, order.getDealDate().toString());
			insertOrderQ.setString(2, order.getStatus());
			insertOrderQ.setDouble(3, ((SaleOrder) order).getPrice());
			insertOrderQ.setString(4, ((SaleOrder) order).getClass().getName());
			insertOrderQ.setInt(5, order.getCustomer().getCustomerNum());
			
			System.out.println(order.getDealDate().toString());
			System.out.println(order.getStatus());
			System.out.println(((SaleOrder) order).getPrice());
			System.out.println(((SaleOrder) order).getClass().getName());
			System.out.println(order.getCustomer().getCustomerNum());
			
			id = DBConnection.getInstance().executeInsertWithIdentity(insertOrderQ);
			
			insertSaleOrderQ.setInt(1, id);
			insertSaleOrderQ.setString(2, ((SaleOrder) order).getDeliveryStatus());
			insertSaleOrderQ.setString(3, ((SaleOrder) order).getDeliveryDate().toString());
			
			DBConnection.getInstance().executeInsertWithIdentity(insertSaleOrderQ);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return id;
	}

}
