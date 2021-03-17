package model;

public class ShelfLine {
	private int quiatity;
	private SellableProduct product;
	private Shelf shelf;
	
	public ShelfLine(int quiatity, SellableProduct product, Shelf shelf) {
		super();
		this.shelf = shelf;
		this.quiatity = quiatity;
		this.product = product;
	}
	

	public Shelf getShelf() {
		return shelf;
	}


	public void setShelf(Shelf shelf) {
		this.shelf = shelf;
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
