package com.practice.service;

import java.util.List;

import com.practice.abstractModel.AbstracParkingTicket;
import com.practice.abstractModel.Vehicle;
import com.practice.model.ParkingSpot;
import com.practice.model.ParkingTicket;

public interface IParkingProcessor {

	public AbstracParkingTicket CheckIn(Vehicle v,List<ParkingSpot> prkngSptList);
	public void CheckOut(AbstracParkingTicket t,List<ParkingSpot> prkngSptList);
}
