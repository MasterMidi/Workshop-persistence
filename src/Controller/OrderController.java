package Controller;

import java.util.List;

import Enums.OrderType;
import db.DataAccessException;
import model.Customer;
import model.Order;
import model.OrderLine;
import model.RentableProductCopy;
import model.RentalOrder;
import model.SaleOrder;
import model.SellableProduct;

public class OrderController {
    private Order order;
    private ProductController prodCtrl;

    public OrderController(OrderType orderType) {
	createOrder(orderType);
	this.prodCtrl = new ProductController();

    }

    public void createOrder(OrderType orderType) {
	if (orderType == OrderType.SaleOrder) {
	    this.order = new SaleOrder();
	} else {
	    this.order = new RentalOrder();
	}
    }

    public List<SellableProduct> searchSellableProducts(String name) throws DataAccessException {
	return prodCtrl.searchProductSellable(name);
    }

    public List<RentableProductCopy> searchRentalProducts(String name) throws DataAccessException {
	// TODO: Function not implemented.
	return null;
    }

    public void addSellableProduct(int id, int quantity) {
	SellableProduct product = prodCtrl.getSellableProduct(id);
	((SaleOrder) this.order).addNewOrderline(product, quantity);
    }

    public List<OrderLine> getOrderlinesSaleOrder() {
	List<OrderLine> res = null;
	res = ((SaleOrder) this.order).getOrderLines();
	return res;
    }
    
    public Customer findCustomer(String phoneNr)
    {
    	CustomerController customerController = new CustomerController();
    	return customerController.findCustomer(phoneNr);
    }

}
