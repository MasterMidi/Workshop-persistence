package model;

import java.time.LocalDate;

public class Equipment extends Product {

	private String type;

	public Equipment(String name, String description, String ean, double purchasePrice, String counttryOfOrigin,
			LocalDate boughtDate, String type,Supplier supplier) {
		super(name, description, ean, purchasePrice, counttryOfOrigin, boughtDate, supplier);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	
}
