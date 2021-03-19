package controller;

import java.util.ArrayList;
import java.util.List;

import db.DataAccessException;
import db.DBProduct;
import model.RentableProductCopy;
import model.SellableProduct;

public class ProductController {
    private List<SellableProduct> products;
    private DBProduct dbProduct;

    public ProductController() {
	this.products = new ArrayList<>();
	this.dbProduct = new DBProduct();
    }

    public List<SellableProduct> searchProductSellable(String name) throws DataAccessException {
	this.products = dbProduct.searchProductSellable(name);
	return products;
    }

    public List<RentableProductCopy> searchProductRentable(String name) throws DataAccessException {
	// TODO: function not implemented yet
	return null;
    }

    public SellableProduct getSellableProduct(int ean) {
	boolean found = false;
	int i = 0;
	SellableProduct res = null;
	SellableProduct currProd = null;
	while (!found && i < products.size()) {
	    currProd = products.get(i);
	    if (currProd.getProduct().getEan() == ean) {
		res = currProd;
		found = true;
	    }
	    i++;
	}
	
	return res;
    }

    public RentableProductCopy getRentableProductCopy() {
	// TODO: function not implemented yet
	return null;
    }
}
