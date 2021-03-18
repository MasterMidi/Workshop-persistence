package model;

import java.time.LocalDate;
import java.util.List;

public abstract class Product {
    private String name;
    private String description;
    private int ean;
    private double purchasePrice;
    private String countryOfOrigin;
    private LocalDate boughtDate;
    private List<SalesPrice> prices;
    private Supplier supplier;

    public Product(String name, String description, int ean, double purchasePrice, String countryOfOrigin,
	    LocalDate boughtDate, Supplier supplier, List<SalesPrice> prices) {
	super();
	this.name = name;
	this.description = description;
	this.ean = ean;
	this.purchasePrice = purchasePrice;
	this.countryOfOrigin = countryOfOrigin;
	this.boughtDate = boughtDate;
	this.supplier = supplier;
	this.prices = prices;
    }

    // returns null if price is less than zero
    public SalesPrice createSalesPrice(double amount, LocalDate startDate) {
	SalesPrice newPrice = null;
	if (amount > 0) {
	    newPrice = new SalesPrice(amount, startDate);
	    prices.add(newPrice);
	}
	return newPrice;

    }

    // TODO return last added price, should return the active price instead
    public double getPrice() {
	Double res = null;
	res = prices.get(prices.size() - 1).getAmount();
	return res;
    }

    // auto generated stuff that way v
    public List<SalesPrice> getPrices() {
	return prices;
    }

    public void setPrices(List<SalesPrice> prices) {
	this.prices = prices;
    }

    public Supplier getSupplier() {
	return supplier;
    }

    public void setSupplier(Supplier supplier) {
	this.supplier = supplier;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public int getEan() {
	return ean;
    }

    public void setEan(int ean) {
	this.ean = ean;
    }

    public double getPurchasePrice() {
	return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
	this.purchasePrice = purchasePrice;
    }

    public String getCounttryOfOrigin() {
	return countryOfOrigin;
    }

    public void setCounttryOfOrigin(String counttryOfOrigin) {
	this.countryOfOrigin = counttryOfOrigin;
    }

    public LocalDate getBoughtDate() {
	return boughtDate;
    }

    public void setBoughtDate(LocalDate boughtDate) {
	this.boughtDate = boughtDate;
    }

}
