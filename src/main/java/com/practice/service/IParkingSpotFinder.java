package com.practice.service;
import java.util.List;
import com.practice.abstractModel.AbstractParkingSpot;
import com.practice.model.ParkingSpot;

public interface IParkingSpotFinder {
 
	public ParkingSpot findParkingSpot(List<ParkingSpot> prkngSptList);
}
