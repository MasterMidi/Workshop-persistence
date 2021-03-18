<<<<<<< Updated upstream


=======
import java.util.List;

import Controller.OrderController;
import Enums.OrderType;
import Enviroment.ENV;
>>>>>>> Stashed changes
import db.DBConnection;
import db.DataAccessException;
import model.SellableProduct;

public class Main {

<<<<<<< Updated upstream
	public static void main(String[] args) {
		
		
		DBConnection.setServerAddress(ENV.db_host);
		DBConnection.setDBName(ENV.db_name);
		DBConnection.setDBLogin(ENV.db_user, ENV.db_password);
		
		try {
			DBConnection.getInstance();
		} catch (DataAccessException e) {
			System.out.println("sadge");
		}
		System.out.println("Happii");
=======
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
>>>>>>> Stashed changes
	}
	System.out.println("END");
    }

}
