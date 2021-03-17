package model;

import java.time.LocalDate;

public class RentalOrder extends Order {
	private LocalDate startDate;
	private LocalDate endDate;
	private RentableProductCopy rentableProductCopy;
	
	public RentalOrder(RentableProductCopy rentableProductCopy ,int orderNumber, LocalDate dealDate, String status, double price, LocalDate startDate,
			LocalDate endDate) {
		super(orderNumber, dealDate, status, price);
		this.startDate = startDate;
		this.rentableProductCopy = rentableProductCopy;
		this.endDate = endDate;
	}

	public RentableProductCopy getRentableProductCopy() {
		return rentableProductCopy;
	}

	public void setRentableProductCopy(RentableProductCopy rentableProductCopy) {
		this.rentableProductCopy = rentableProductCopy;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

}
