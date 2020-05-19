package com.practice.service;

import java.util.List;

import com.practice.abstractModel.AbstractMovieTicket;
import com.practice.abstractModel.Movie;

public interface IMovieTicketProcessor {

	
	public AbstractMovieTicket generateMovieTicket(int movieId,int showId,int seatId,List<Movie>mvList);
	public void UpadteAvailabilty(AbstractMovieTicket t);
}
