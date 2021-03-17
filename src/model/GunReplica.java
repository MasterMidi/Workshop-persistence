package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GunReplica extends Product {

	private String calibre;
	private String material;
	
	public GunReplica(String name, String description, String ean, double purchasePrice, String counttryOfOrigin,
			LocalDate boughtDate, String calibre, String material,Supplier supplier, List<SalesPrice> prices) {
		super(name, description, ean, purchasePrice, counttryOfOrigin, boughtDate, supplier, prices);
		this.calibre = calibre;
		this.material = material;
	}
	
	public GunReplica(String name, String description, String ean, double purchasePrice, String counttryOfOrigin,
			LocalDate boughtDate, String calibre, String material,Supplier supplier) {
		this(material, material, material, purchasePrice, material, boughtDate, material, material, supplier, new ArrayList<>());
	}

	public String getCalibre() {
		return calibre;
	}

	public void setCalibre(String calibre) {
		this.calibre = calibre;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
}
