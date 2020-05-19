package com.practice.abstractModel;

public abstract class Payment {
	
	public int id;
	public int totalPayment;
	public int extrapercentage;
	public int finalPayment;

	public Payment(int id, int amount) {
		this.id = id;
		this.totalPayment=amount;
	}

	public int getFinalPayment() {
		return finalPayment;
	}

	public void setFinalPayment(int finalPayment) {
		this.finalPayment = finalPayment;
	}

	public int getId() {
		return id;
	}

	public int getTotalPayment() {
		return totalPayment;
	}

	public int getExtrapercentage() {
		return extrapercentage;
	}

}
