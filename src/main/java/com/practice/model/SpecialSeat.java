package com.practice.model;

import com.practice.abstractModel.Seat;

public class SpecialSeat extends Seat {

	public SpecialSeat(int id) {

		super(id);
		this.seatId=id;
		this.extraChargePercentage=4;
		
	}

}
