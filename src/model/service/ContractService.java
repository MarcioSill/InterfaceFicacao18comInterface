package model.service;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contract;

public class ContractService {
	
	private Integer months;
	private OnlinePaymentService taxService;
	
	

	public ContractService(Integer months, OnlinePaymentService taxService) {
		super();
		this.months = months;
		this.taxService = taxService;
	}

	public void processContract(Contract contract) {
		double basicPayment = contract.getTotalValue() / months;
		
		for(int i = 1; i <= months; i++) {
			int x = i;
			double amount = taxService.tax(basicPayment, x);
			
			Calendar cal = Calendar.getInstance();
			cal.setTime(contract.getDate());
			cal.add(Calendar.MONTH, x);
			Date date = cal.getTime();
			
			contract.addList(date, amount);
		}
				
	}

}
