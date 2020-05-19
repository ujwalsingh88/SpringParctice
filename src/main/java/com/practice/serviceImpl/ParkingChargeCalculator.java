package com.practice.serviceImpl;

import java.time.temporal.ChronoUnit;

import com.practice.abstractModel.AbstracParkingTicket;
import com.practice.service.IParkingChargeCalculator;

public class ParkingChargeCalculator implements IParkingChargeCalculator{

	@Override
	public int CalculateCharges(AbstracParkingTicket ticket) {
		int hours = (int) ticket.getCheckinTime().until(ticket.checkoutTime, ChronoUnit.SECONDS)+6;
		System.out.println("Charge Is " +hours+"GBP");
		ticket.setCharge(hours);
		return hours;
	}

	
}
