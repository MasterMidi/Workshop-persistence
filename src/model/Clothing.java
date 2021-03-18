package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Clothing extends Product {
    private int size;
    private String color;

    public Clothing(String name, String description, int ean, double purchasePrice, String countryOfOrigin,
	    LocalDate boughtDate, int size, String color, Supplier supplier, List<SalesPrice> prices) {
	super(name, description, ean, purchasePrice, countryOfOrigin, boughtDate, supplier, prices);
	this.size = size;
	this.color = color;
    }

    public Clothing(String name, String description, int ean, double purchasePrice, String countryOfOrigin,
	    LocalDate boughtDate, int size, String color, Supplier supplier) {
	this(name, description, ean, purchasePrice, countryOfOrigin, boughtDate, size, color, supplier,
		new ArrayList<>());
    }

    public int getSize() {
	return size;
    }

    public void setSize(int size) {
	this.size = size;
    }

    public String getColor() {
	return color;
    }

    public void setColor(String color) {
	this.color = color;
    }

}
