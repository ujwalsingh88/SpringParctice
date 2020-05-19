package com.practice.main;

import java.util.List;

import com.practice.abstractModel.AbstractParkingSpot;
import com.practice.abstractModel.AbstracParkingTicket;
import com.practice.abstractModel.Vehicle;
import com.practice.model.Car;
import com.practice.model.ParkingSpot;
import com.practice.model.ParkingTicket;
import com.practice.service.IParkingProcessor;
import com.practice.service.IParkingDataGenerator;
import com.practice.serviceImpl.ParkingProcessor;

public class ParkingProblem {

	public void Demonstrate() {
		List<ParkingSpot> prkngSptList =IParkingDataGenerator.GenerateAllParkingSpots(0, 7, 1, 1000);
		System.out.println("Total Space Available in Parking " + prkngSptList.size());
		Vehicle v1 = new Car(3413);
		Vehicle v2 = new Car(5643);
		Vehicle v3 = new Car(6348);
		IParkingProcessor p = new ParkingProcessor();
		AbstracParkingTicket t1 = p.CheckIn(v1, prkngSptList);
		AbstracParkingTicket t2 = p.CheckIn(v2, prkngSptList);
		AbstracParkingTicket t3 = p.CheckIn(v3, prkngSptList);
		p.CheckOut(t1, prkngSptList);
		p.CheckOut(t3, prkngSptList);
		Vehicle v4 = new Car(7867);
		p.CheckIn(v4, prkngSptList);
	}
}
