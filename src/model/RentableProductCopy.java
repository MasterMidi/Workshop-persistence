package model;

public class RentableProductCopy {
	
	private String serialNumber;
	private String availibility;
	private Product product;
	private Shelf shelf;
	
	public RentableProductCopy(Shelf shelf, String serialNumber, String availibility, Product product) {
		super();
		this.shelf = shelf;
		this.serialNumber = serialNumber;
		this.availibility = availibility;
		this.product = product;
	}
	public RentableProductCopy(String serialNumber, String availibility, Product product) {
		this(null, serialNumber, availibility, product);
	}
	
	
	//Returns the price of the original product not the copy
	public double getPrice() {
		return this.product.getPrice();
	}
	
	public Shelf getShelf() {
		return shelf;
	}
	public void setShelf(Shelf shelf) {
		this.shelf = shelf;
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
