package com.practice.main;

import com.practice.abstractModel.AbstractMovieTicket;
import com.practice.abstractModel.Payment;
import com.practice.model.DebitCardPayment;
import com.practice.model.NetBankingPayment;
import com.practice.model.PaypalPaayment;
import com.practice.service.IPaymentCalculator;
import com.practice.serviceImpl.PaymentCalculator;

public class PaymentProblem {

	public void Demostrate() {
		
		IPaymentCalculator pc =new PaymentCalculator();
		
		
		Payment p1 = new DebitCardPayment(5, 500);
		Payment p2 = new NetBankingPayment(7, 600);
		Payment p3 = new PaypalPaayment(13, 1200);
		
		p1.setFinalPayment(pc.calculatePayment(p1));
		System.out.println("Debit Card payment"+p1.getFinalPayment());
		p2.setFinalPayment(pc.calculatePayment(p2));
		System.out.println("Net Banking payment"+p2.getFinalPayment());
		p3.setFinalPayment(pc.calculatePayment(p3));
		System.out.println("Paypal payment"+p3.getFinalPayment());
		
		
		
	}
}
