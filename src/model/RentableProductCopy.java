package model;

public class RentableProductCopy {
	
	private String serialNumber;
	private String availibility;
	private Product product;
	
	public RentableProductCopy(String serialNumber, String availibility, Product product) {
		super();
		this.serialNumber = serialNumber;
		this.availibility = availibility;
		this.product = product;
	}

	public double getPrice() {
		return this.product.getPrice();
	}
	
	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getAvailibility() {
		return availibility;
	}

	public void setAvailibility(String availibility) {
		this.availibility = availibility;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
