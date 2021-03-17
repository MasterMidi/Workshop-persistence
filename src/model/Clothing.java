package model;

import java.time.LocalDate;

public class Clothing extends Product {
	private String size;
	private String color;
	
	
	public Clothing(String name, String description, String ean, double purchasePrice, String counttryOfOrigin,
			LocalDate boughtDate, String size, String color) {
		super(name, description, ean, purchasePrice, counttryOfOrigin, boughtDate);
		this.size = size;
		this.color = color;
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
