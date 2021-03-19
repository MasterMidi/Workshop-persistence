import java.util.List;

import controller.CustomerController;
import controller.OrderController;
import db.DBConnection;
import db.DataAccessException;
import enums.OrderType;
import enviroment.ENV;
import model.Customer;
import model.OrderLine;
import model.SellableProduct;

public class Main {

	public static void main(String[] args) throws DataAccessException {

		DBConnection.setServerAddress(ENV.db_host);
		DBConnection.setDBName(ENV.db_name);
		DBConnection.setDBLogin(ENV.db_user, ENV.db_password);

		try {
			DBConnection.getInstance();
		} catch (DataAccessException e) {
			System.out.println("Connection to DB failed");
		}

		CustomerController customerController = new CustomerController();
		Customer customer = customerController.findCustomer("20202020");

		System.out.println("Found " + customer.getContactInfo().getName() + " with the email "
				+ customer.getContactInfo().getEmail() + " from phone number 20202020");

		OrderController orderCon = new OrderController(OrderType.SaleOrder);
		List<SellableProduct> products = orderCon.searchSellableProducts("genuine leather cowboy hat");

		orderCon.addSellableProduct(products.get(0).getProduct().getEan(), 10);

		List<OrderLine> Orderlines = orderCon.getOrderlinesSaleOrder();
		for (OrderLine curr : Orderlines) {
			System.out.println(curr.getProduct().getProduct().getName());
			System.out.println(curr.getPrice());
		}

		System.out.println("END");
	}

}
