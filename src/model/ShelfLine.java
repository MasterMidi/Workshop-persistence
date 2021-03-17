package model;

public class ShelfLine {
	private int quiatity;
	private SellableProduct product;
	
	public ShelfLine(int quiatity, SellableProduct product) {
		super();
		this.quiatity = quiatity;
		this.product = product;
	}

	public int getQuiatity() {
		return quiatity;
	}

	public void setQuiatity(int quiatity) {
		this.quiatity = quiatity;
	}

	public SellableProduct getProduct() {
		return product;
	}

	public void setProduct(SellableProduct product) {
		this.product = product;
	}
	
}
