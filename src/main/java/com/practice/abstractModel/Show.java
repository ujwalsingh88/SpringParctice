package com.practice.abstractModel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.practice.model.NormalSeat;
import com.practice.model.SpecialSeat;

public abstract class Show {

	public int showId;
	public List<Seat> seats;
	public int extraChargePercentage;
	public boolean isAvailable;
	
	public Show(int showId) {
		this.showId = showId;
		this.isAvailable = true;
		this.seats = new ArrayList<Seat>(); 
		seats.addAll(Stream.iterate(1, i->i+1).
				limit(2).map(n->new SpecialSeat(n)).collect(Collectors.toList()));
		seats.addAll(Stream.iterate(3, i->i+1).
				limit(3).map(n->new NormalSeat(n)).collect(Collectors.toList()));
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public List<Seat> getSeats() {
		return seats;
	}

	public int getShowId() {
		return showId;
	}

	public int getExtraChargePercentage() {
	return extraChargePercentage;
	}
	
	
}
