package com.practice.serviceImpl;

import java.util.List;

import com.practice.abstractModel.AbstractMovieTicket;
import com.practice.abstractModel.Movie;
import com.practice.abstractModel.Seat;
import com.practice.abstractModel.Show;
import com.practice.model.MovieTicket;
import com.practice.service.IMovieChargeCalculator;
import com.practice.service.IMovieTicketProcessor;

public class MovieTicketProcessor implements IMovieTicketProcessor {

	private IMovieChargeCalculator mc=new MovieChargeCalculator();

	@Override
	public AbstractMovieTicket generateMovieTicket(int movieId, int showId, int seatId ,List<Movie>mvList) {
		Movie movie = mvList.stream().filter(mv->mv.getMovieId()==movieId).findFirst().get();
		Show show = movie.getShows().stream().filter(sh->sh.getShowId()==showId).findFirst().get();
		Seat seat =show.getSeats().stream().filter(st->st.getSeatId()==seatId).findFirst().get();
		return new MovieTicket(movie, show, seat);
	}

	@Override
	public void UpadteAvailabilty(AbstractMovieTicket t) {
		t.getSeat().setAvailable(false);
		if(t.getShow().getSeats().stream().allMatch(m->m.isAvailable()==false)) {
			t.getShow().setAvailable(false);
		}
		if(t.getMovie().getShows().stream().allMatch(m->m.isAvailable()==false)) {
			t.getMovie().setAvailable(false);
		}
		
		
	}

	

}
