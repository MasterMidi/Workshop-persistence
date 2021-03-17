package model;

import java.time.LocalDate;

public class SalesPrice {
	private double amount;
	private LocalDate startDate;

	public SalesPrice(double amount, LocalDate startDate) {
		super();
		this.amount = amount;
		this.startDate = startDate;
	}
	
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}


}
