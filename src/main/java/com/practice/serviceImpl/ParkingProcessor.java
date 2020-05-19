package com.practice.serviceImpl;

import java.time.LocalDateTime;
import java.util.List;

import com.practice.abstractModel.AbstractParkingSpot;
import com.practice.abstractModel.AbstracParkingTicket;
import com.practice.abstractModel.Vehicle;
import com.practice.model.ParkingSpot;
import com.practice.model.ParkingTicket;
import com.practice.service.IParkingChargeCalculator;
import com.practice.service.IParkingProcessor;
import com.practice.service.IParkingSpotFinder;

public class ParkingProcessor implements IParkingProcessor {

	@Override
	public AbstracParkingTicket CheckIn(Vehicle v, List<ParkingSpot> prkngSptList) {
		IParkingSpotFinder finder = new ParkingSpotFinder();
		ParkingSpot spot = finder.findParkingSpot(prkngSptList);
		spot.setAvailable(false);
		AbstracParkingTicket t= new ParkingTicket(v,LocalDateTime.now(),spot );
		System.out.println("Spot Allocated "+ spot.getFloorNo()+"-"+spot.getPosition());
		return t;
	}

	
	@Override
	public void CheckOut(AbstracParkingTicket t, List<ParkingSpot> prkngSptList) {
		IParkingChargeCalculator c = new ParkingChargeCalculator();
		t.setCheckoutTime(LocalDateTime.now());
		int charge =c.CalculateCharges(t);
		for(ParkingSpot spot:prkngSptList) {
			if(spot.getFloorNo() == t.getPakingSpot().getFloorNo() &&
			   spot.getPosition()==t.getPakingSpot().getPosition()) {
				spot.setAvailable(true);
			}
		}
		
	}

}
