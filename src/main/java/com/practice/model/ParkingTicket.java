package com.practice.model;

import java.time.LocalDateTime;

import com.practice.abstractModel.AbstractParkingSpot;
import com.practice.abstractModel.AbstracParkingTicket;
import com.practice.abstractModel.Vehicle;

public class ParkingTicket extends AbstracParkingTicket {

	public ParkingTicket(Vehicle v , LocalDateTime checkinTime, AbstractParkingSpot parkingSpot) {
		this.checkinTime= checkinTime;
		this.vehicle = v;
		this.pakingSpot = parkingSpot;
	}

}
