package model;

public class SellableProduct {
	private int minStock;
	private int stock;
	private Product product;
	

	public SellableProduct(int minStock, int stock, Product product) {
		super();
		this.minStock = minStock;
		this.stock = stock;
		this.product = product;
	}

	public int getMinStock() {
		return minStock;
	}

	public void setMinStock(int minStock) {
		this.minStock = minStock;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public double getPrice() {
		return this.product.getPrice();
	}
}
