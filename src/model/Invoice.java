package model;

public class Invoice {
	private Order order;
	private int invoiceNumber;
	private double totalPrice;
	
	public Invoice(Order order, int invoiceNumber, double totalPrice) {
		super();
		this.order = order;
		this.invoiceNumber = invoiceNumber;
		this.totalPrice = totalPrice;
	}
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public int getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(int invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

}
