package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SaleOrder extends Order {
	private String deliveryStatus;
	private LocalDate deliveryDate;
	private List<OrderLine> Orderlines;
	
	public SaleOrder(int orderNumber, LocalDate dealDate, String status, double price, String deliveryStatus,
		 LocalDate deliveryDate) {
		super(orderNumber, dealDate, status, price);
		this.deliveryStatus = deliveryStatus;
		this.deliveryDate = deliveryDate;
		this.Orderlines = new ArrayList<>();
	}

	public String getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	
	

}
