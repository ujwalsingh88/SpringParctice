package com.practice.model;

import java.util.ArrayList;

import com.practice.abstractModel.Movie;
import com.practice.abstractModel.Show;

public class NormalMovie  extends Movie{

	public NormalMovie(int movieId, int basePrice) {
		super(movieId,basePrice);
		this.extraChargePercentage =0;
	}

}
