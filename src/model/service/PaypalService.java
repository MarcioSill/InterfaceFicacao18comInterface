package model.service;

public class PaypalService implements OnlinePaymentService{ // implementa��o da interface OnlinePaymentService
	public Double tax(Double amount, int x) {
		Double juro1 = amount* 0.01 * x + amount;
		return juro1* 1.02;
	}

}
