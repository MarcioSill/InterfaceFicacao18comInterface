package model.entities;

import java.util.Date;

public class Installment {
	private Date duedate;
	private Double amount;
	
	public Installment() {
		
	}

	public Installment(Date duedate, Double amount) {
	
		this.duedate = duedate;
		this.amount = amount;
	}

	public Date getDuedate() {
		return duedate;
	}

	public void setDuedate(Date duedate) {
		this.duedate = duedate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
}
