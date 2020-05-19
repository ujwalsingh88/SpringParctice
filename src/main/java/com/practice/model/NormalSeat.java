package com.practice.model;

import com.practice.abstractModel.Seat;

public class NormalSeat extends Seat {

	public NormalSeat(int id) {

		super(id);
		this.seatId=id;
		this.extraChargePercentage=1;
	}

}
