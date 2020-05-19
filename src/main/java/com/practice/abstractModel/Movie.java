package com.practice.abstractModel;

import java.util.ArrayList;
import java.util.List;

import com.practice.model.EveningShow;
import com.practice.model.MorningShow;

public abstract class Movie {
  public int movieId;
  public int basePrice;
  public int extraChargePercentage;
  public List<Show> shows;
  public boolean isAvailable;

   public Movie(int movieId, int basePrice) {
		this.basePrice=basePrice;
		this.movieId=movieId;
		this.shows= new ArrayList<Show>();
		Show sh1 = new MorningShow(7);
		Show sh2 = new EveningShow(8);
		this.shows.add(sh1);
		this.shows.add(sh2);
		this.setAvailable(true);
	}

	public boolean isAvailable() {
		return isAvailable;
	}
	
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public List<Show> getShows() {
	return shows;
}

	public int getExtraChargePercentage() {
	return extraChargePercentage;
	}
	
	
	public int getMovieId() {
		return movieId;
	}

	
	public int getBasePrice() {
		return basePrice;
	}

	
  
 
}
