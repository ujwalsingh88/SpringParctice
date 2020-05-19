package com.practice.abstractModel;

import java.time.LocalDateTime;

public abstract class AbstracParkingTicket {

	public LocalDateTime checkinTime;
	public LocalDateTime checkoutTime;
	public AbstractParkingSpot pakingSpot;
	public Vehicle vehicle;
	public int charge;
	
	public LocalDateTime getCheckinTime() {
		return checkinTime;
	}
	public void setCheckinTime(LocalDateTime checkinTime) {
		this.checkinTime = checkinTime;
	}
	public LocalDateTime getCheckoutTime() {
		return checkoutTime;
	}
	public void setCheckoutTime(LocalDateTime checkoutTime) {
		this.checkoutTime = checkoutTime;
	}
	public AbstractParkingSpot getPakingSpot() {
		return pakingSpot;
	}
	public void setPakingSpot(AbstractParkingSpot pakingSpot) {
		this.pakingSpot = pakingSpot;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public int getCharge() {
		return charge;
	}
	public void setCharge(int charge) {
		this.charge = charge;
	}
}
