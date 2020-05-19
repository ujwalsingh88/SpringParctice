package com.practice.model;

import com.practice.abstractModel.Payment;

public class DebitCardPayment extends Payment {

	public DebitCardPayment(int id, int amount) {
		super(id, amount);
		this.extrapercentage=2;
	}

}
