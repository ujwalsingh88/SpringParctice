package com.practice.serviceImpl;

import com.practice.abstractModel.Payment;
import com.practice.service.IPaymentCalculator;

public class PaymentCalculator implements IPaymentCalculator {

	@Override
	public int calculatePayment(Payment p) {
		return p.getTotalPayment()+(p.getTotalPayment()/100*p.getExtrapercentage());
	}

}
