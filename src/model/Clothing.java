package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Clothing extends Product {
	private String size;
	private String color;
	
	
	public Clothing(String name, String description, String ean, double purchasePrice, String counttryOfOrigin,
			LocalDate boughtDate, String size, String color,Supplier supplier, List<SalesPrice> prices) {
		super(name, description, ean, purchasePrice, counttryOfOrigin, boughtDate, supplier, prices);
		this.size = size;
		this.color = color;
	}

	public Clothing(String name, String description, String ean, double purchasePrice, String counttryOfOrigin,
			LocalDate boughtDate, String size, String color,Supplier supplier) {
		this(color, color, color, purchasePrice, color, boughtDate, color, color, supplier, new ArrayList<>());
	}

	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
	

}
