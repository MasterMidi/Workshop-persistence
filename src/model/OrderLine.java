package model;

public class OrderLine {
	private SellableProduct product;
	private int quantity;
	private Double price;
	
	//TODO make the price not hard coded
	public OrderLine(SellableProduct product, int quantity) {
		super();
		this.product = product;
		this.quantity = quantity;
		this.price = product.getPrice();
	}


	public SellableProduct getProduct() {
		return product;
	}


	public void setProduct(SellableProduct product) {
		this.product = product;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public Double getPrice() {
		return price;
	}
	
	public Double getPriceTotal() {
		return price * quantity;
	}


	public void setPrice(Double price) {
		this.price = price;
	}
	
	

}
