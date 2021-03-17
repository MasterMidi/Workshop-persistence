package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Equipment extends Product {

	private String type;

	public Equipment(String name, String description, String ean, double purchasePrice, String counttryOfOrigin,
			LocalDate boughtDate, String type,Supplier supplier, List<SalesPrice> prices) {
		super(name, description, ean, purchasePrice, counttryOfOrigin, boughtDate, supplier, prices);
		this.type = type;
	}
	
	public Equipment(String name, String description, String ean, double purchasePrice, String counttryOfOrigin,
			LocalDate boughtDate, String type,Supplier supplier) {
		this(type, type, type, purchasePrice, type, boughtDate, type, supplier, new ArrayList<>());
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	
}
