package model;

import java.util.ArrayList;
import java.util.List;

public class SellableProduct {
	private int minStock;
	private int stock;
	private Product product;
	private List<ShelfLine> shelfLines;
	

	public SellableProduct(int minStock, Product product, List<ShelfLine> shelfLines) {
		super();
		this.minStock = minStock;
		this.product = product;
		this.shelfLines = shelfLines;
		this.updateStock();
	}
	
	public SellableProduct(int minStock, Product product) {
		this(minStock, product, new ArrayList<>());
	}
	
	public int updateStock() {
		int res = this.shelfLines.stream()
				.mapToInt(item -> item.getQuiatity())
				.sum();
		this.stock = res;
		return res;
	}

	public List<ShelfLine> getShelfLines() {
		return shelfLines;
	}

	public void setShelfLines(List<ShelfLine> shelfLines) {
		this.shelfLines = shelfLines;
	}

	public int getMinStock() {
		return minStock;
	}

	public void setMinStock(int minStock) {
		this.minStock = minStock;
	}
	
	public int getStock() {
		return this.stock;
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
