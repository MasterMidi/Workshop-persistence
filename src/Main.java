import java.util.List;

import Controller.OrderController;
import Enums.OrderType;
import Enviroment.ENV;
import db.DBConnection;
import db.DataAccessException;
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

	OrderController orderCon = new OrderController(OrderType.SaleOrder);
	List<SellableProduct> products = orderCon.searchSellableProducts("shirt");
	for (SellableProduct curr : products) {
	    System.out.println(curr.getProduct().getName());
	}

	orderCon.addSellableProduct(products.get(0).getProduct().getEan(), 10);

	List<OrderLine> Orderlines = orderCon.getOrderlinesSaleOrder();
	for (OrderLine curr : Orderlines) {
	    System.out.println(curr.getProduct().getProduct().getName());
	    System.out.println(curr.getPrice());
	}

	System.out.println("END");
    }

}
