package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Product {
	private String name;
	private String description;
	private String ean;
	private double purchasePrice;
	private String counttryOfOrigin;
	private LocalDate boughtDate;
	private List<SalesPrice> prices;
	private Supplier supplier;

	
	public Product(String name, String description, String ean, double purchasePrice, String counttryOfOrigin,
			LocalDate boughtDate, Supplier supplier) {
		super();
		this.name = name;
		this.description = description;
		this.ean = ean;
		this.purchasePrice = purchasePrice;
		this.counttryOfOrigin = counttryOfOrigin;
		this.boughtDate = boughtDate;
		this.supplier = supplier;
		this.prices = new ArrayList<>();
	}
	

	//returns null if price is less than zero
	public SalesPrice createSalesPrice(double amount, LocalDate startDate) { 
		SalesPrice newPrice = null;
		if(amount > 0) {
			newPrice = new SalesPrice(amount, startDate);
			prices.add(newPrice);
		}
		return newPrice;
		
	}
	//TODO return last added price, should return the active price instead
	public double getPrice() {
		Double res = null;
		res = prices.get(prices.size()-1).getAmount();
		return res;
	}
	
	//auto generated stuff that way v 
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
	public String getEan() {
		return ean;
	}
	public void setEan(String ean) {
		this.ean = ean;
	}
	public double getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	public String getCounttryOfOrigin() {
		return counttryOfOrigin;
	}
	public void setCounttryOfOrigin(String counttryOfOrigin) {
		this.counttryOfOrigin = counttryOfOrigin;
	}
	public LocalDate getBoughtDate() {
		return boughtDate;
	}
	public void setBoughtDate(LocalDate boughtDate) {
		this.boughtDate = boughtDate;
	}
	
}

