package com.practice.service;

import com.practice.abstractModel.AbstracParkingTicket;

public interface IParkingChargeCalculator {

	public int CalculateCharges(AbstracParkingTicket ticket);
}
