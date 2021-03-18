package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GunReplica extends Product {

    private int calibre;
    private String material;

    public GunReplica(String name, String description, int ean, double purchasePrice, String countryOfOrigin,
	    LocalDate boughtDate, int calibre, String material, Supplier supplier, List<SalesPrice> prices) {
	super(name, description, ean, purchasePrice, countryOfOrigin, boughtDate, supplier, prices);
	this.calibre = calibre;
	this.material = material;
    }

    public GunReplica(String name, String description, int ean, double purchasePrice, String countryOfOrigin,
	    LocalDate boughtDate, int calibre, String material, Supplier supplier) {
	this(name, description, ean, purchasePrice, countryOfOrigin, boughtDate, calibre, material, supplier,
		new ArrayList<>());
    }

    public int getCalibre() {
	return calibre;
    }

    public void setCalibre(int calibre) {
	this.calibre = calibre;
    }

    public String getMaterial() {
	return material;
    }

    public void setMaterial(String material) {
	this.material = material;
    }

}
