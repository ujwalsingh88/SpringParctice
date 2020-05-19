package com.practice.serviceImpl;

import com.practice.abstractModel.AbstractMovieTicket;
import com.practice.abstractModel.Movie;
import com.practice.abstractModel.Seat;
import com.practice.abstractModel.Show;
import com.practice.service.IMovieChargeCalculator;

public class MovieChargeCalculator implements IMovieChargeCalculator {

	@Override
	public int getPrice(AbstractMovieTicket mt) {
		int price = mt.getMovie().getBasePrice()+(mt.getMovie().getBasePrice()/100*mt.getMovie().getExtraChargePercentage())
				    +(mt.getMovie().getBasePrice()/100*mt.getShow().getExtraChargePercentage()) +
				    (mt.getMovie().getBasePrice()/100*mt.getSeat().getExtraChargePercentage());
		return price;
	}

}
