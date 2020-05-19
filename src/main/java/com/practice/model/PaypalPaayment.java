package com.practice.model;

import com.practice.abstractModel.Payment;

public class PaypalPaayment extends Payment {

	public PaypalPaayment(int id, int amount) {
		super(id, amount);
		this.extrapercentage=5;
	}

}
