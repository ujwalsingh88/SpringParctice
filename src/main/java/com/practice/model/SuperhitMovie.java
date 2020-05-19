package com.practice.model;

import java.util.ArrayList;

import com.practice.abstractModel.Movie;
import com.practice.abstractModel.Show;

public class SuperhitMovie extends Movie {
	
    public SuperhitMovie(int movieId, int basePrice) {
    	super(movieId,basePrice);
		this.extraChargePercentage =2;
	}

}
