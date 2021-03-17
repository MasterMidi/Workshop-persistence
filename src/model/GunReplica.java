package model;

import java.time.LocalDate;

public class GunReplica extends Product {

	private String calibre;
	private String material;
	
	public GunReplica(String name, String description, String ean, double purchasePrice, String counttryOfOrigin,
			LocalDate boughtDate, String calibre, String material) {
		super(name, description, ean, purchasePrice, counttryOfOrigin, boughtDate);
		this.calibre = calibre;
		this.material = material;
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
