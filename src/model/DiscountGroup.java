package model;

public class DiscountGroup {
	private String type;
	private double discount;
	
	public DiscountGroup(String type, double discount) {
		super();
		this.type = type;
		this.discount = discount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

}
