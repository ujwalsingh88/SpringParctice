package com.practice.main;

import java.util.List;

import com.practice.abstractModel.AbstractMovieTicket;
import com.practice.abstractModel.Movie;
import com.practice.service.IMovieChargeCalculator;
import com.practice.service.IMovieDataGenerator;
import com.practice.service.IMovieTicketProcessor;
import com.practice.serviceImpl.MovieChargeCalculator;
import com.practice.serviceImpl.MovieTicketProcessor;

public class MovieProblem {

	public void Demostrate() {
		
		IMovieTicketProcessor mvtP =new MovieTicketProcessor();
		IMovieChargeCalculator mcC =new MovieChargeCalculator();
		
		
		List<Movie> movieList = IMovieDataGenerator.MovieDataGenerator();
		
		AbstractMovieTicket t1 =mvtP.generateMovieTicket(2, 7, 3, movieList);
		AbstractMovieTicket t2 =mvtP.generateMovieTicket(2, 8, 5, movieList);
		AbstractMovieTicket t3 =mvtP.generateMovieTicket(4, 7, 2, movieList);
		AbstractMovieTicket t4 =mvtP.generateMovieTicket(4, 8, 5, movieList);
		System.out.println(mcC.getPrice(t1));
		mvtP.UpadteAvailabilty(t1);
		System.out.println(mcC.getPrice(t2));
		mvtP.UpadteAvailabilty(t2);
		System.out.println(mcC.getPrice(t3));
		mvtP.UpadteAvailabilty(t3);
		System.out.println(mcC.getPrice(t4));
		mvtP.UpadteAvailabilty(t4);
		
		AbstractMovieTicket t5 =mvtP.generateMovieTicket(4, 8, 5, movieList);
		System.out.println(t5.getSeat().isAvailable());
		
	}

}
