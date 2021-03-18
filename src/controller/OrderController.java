package controller;

import java.util.List;

import db.DataAccessException;
import enums.OrderType;
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
    CustomerController customerController;

    public OrderController(OrderType orderType) {
	createOrder(orderType);
	this.prodCtrl = new ProductController();
	this.customerController = new CustomerController();

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

    public void addSellableProduct(int ean, int quantity) {
	SellableProduct product = prodCtrl.getSellableProduct(ean);
	((SaleOrder) this.order).addNewOrderline(product, quantity);
    }

    public List<OrderLine> getOrderlinesSaleOrder() {
	List<OrderLine> res = null;
	res = ((SaleOrder) this.order).getOrderLines();
	return res;
    }
    
    public Customer findCustomer(String phoneNr) throws DataAccessException
    {
    	
    	return customerController.findCustomer(phoneNr);
    }

}
