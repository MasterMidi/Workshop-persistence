package db;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import db.dao.IOrderDB;
import model.Order;
import model.OrderLine;
import model.SaleOrder;

public class OrderDB implements IOrderDB {

	private static final String INSERT_ORDER = "insert into [order] values(?, ?, ?, ?, (select id from customer where customer_number = ?))";
	private static final String INSERT_SALE_ORDER = "insert into sale_order values(?, ?, ?)";
	private static final String INSERT_ORDER_LINE = "insert into orderline values(?, ?, ?, (select id from product where ean = ?))";

	private PreparedStatement insertOrderQ;
	private PreparedStatement insertSaleOrderQ;
	private PreparedStatement insertOrderLineQ;

	@Override
	public int insertOrder(Order order) {
		int id = -1;

		try {
			insertOrderQ = DBConnection.getInstance().getConnection().prepareStatement(INSERT_ORDER, Statement.RETURN_GENERATED_KEYS);
			insertSaleOrderQ = DBConnection.getInstance().getConnection().prepareStatement(INSERT_SALE_ORDER, Statement.RETURN_GENERATED_KEYS);
			insertOrderLineQ = DBConnection.getInstance().getConnection().prepareStatement(INSERT_ORDER_LINE, Statement.RETURN_GENERATED_KEYS);
			
			DBConnection.getInstance().startTransaction();

			insertOrderQ.setString(1, order.getDealDate().toString());
			insertOrderQ.setString(2, order.getStatus());
			insertOrderQ.setDouble(3, ((SaleOrder) order).getPrice());
			insertOrderQ.setString(4, ((SaleOrder) order).getClass().getName());
			insertOrderQ.setInt(5, order.getCustomer().getCustomerNum());
			
			id = DBConnection.getInstance().executeInsertWithIdentity(insertOrderQ);
			
			insertSaleOrderQ.setInt(1, id);
			insertSaleOrderQ.setString(2, ((SaleOrder) order).getDeliveryStatus());
			insertSaleOrderQ.setString(3, ((SaleOrder) order).getDeliveryDate().toString());
			
			DBConnection.getInstance().executeInsert(insertSaleOrderQ);
			
			for(OrderLine ol : ((SaleOrder) order).getOrderLines()) {
				insertOrderLineQ.setInt(1, ol.getQuantity());
				insertOrderLineQ.setDouble(2, ol.getPriceTotal());
				insertOrderLineQ.setInt(3, id);
				insertOrderLineQ.setInt(4, ol.getProduct().getProduct().getEan());
				
				DBConnection.getInstance().executeInsert(insertOrderLineQ);
			}
			
			DBConnection.getInstance().commitTransaction();
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
