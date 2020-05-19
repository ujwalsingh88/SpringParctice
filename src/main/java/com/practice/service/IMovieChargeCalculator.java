package com.practice.service;

import com.practice.abstractModel.AbstractMovieTicket;

public interface IMovieChargeCalculator {

	public int getPrice(AbstractMovieTicket mt);
}
