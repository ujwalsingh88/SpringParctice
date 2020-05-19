package com.practice.model;

import com.practice.abstractModel.AbstractParkingSpot;

public class ParkingSpot extends AbstractParkingSpot{

	public ParkingSpot(int floorNo,int position) {
		this.floorNo =floorNo;
		this.position = position;
		this.isAvailable=true;
	}
}
