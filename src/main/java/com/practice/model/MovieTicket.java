package com.practice.model;

import com.practice.abstractModel.AbstractMovieTicket;
import com.practice.abstractModel.Movie;
import com.practice.abstractModel.Seat;
import com.practice.abstractModel.Show;

public class MovieTicket extends AbstractMovieTicket {

	public MovieTicket(Movie movie, Show show, Seat seat) {
		super(movie, show, seat);
		
	}

}
