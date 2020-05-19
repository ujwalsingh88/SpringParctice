package com.practice.model;

import com.practice.abstractModel.Payment;

public class NetBankingPayment extends Payment {

	public NetBankingPayment(int id, int amount) {
		super(id, amount);
		this.extrapercentage=5;
	}

}
