package com.practice.abstractModel;

public abstract class AbstractMovieTicket {
  public Movie movie;
  public Show show;
  public Seat seat;
	
  public AbstractMovieTicket(Movie movie, Show show, Seat seat) {
		this.movie = movie;
		this.show = show;
		this.seat = seat;
	}
	public Movie getMovie() {
		return movie;
	}
	public Show getShow() {
		return show;
	}
	public Seat getSeat() {
		return seat;
	}
}
