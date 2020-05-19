package com.practice.service;

import java.util.ArrayList;
import java.util.List;

import com.practice.abstractModel.Movie;
import com.practice.model.NormalMovie;
import com.practice.model.SuperhitMovie;

public interface IMovieDataGenerator {

	public static List<Movie> MovieDataGenerator() {
		
		List<Movie> mList =new ArrayList<Movie>();
		Movie m1 = new SuperhitMovie(2, 300);
		Movie m2 = new NormalMovie(4, 200);
		mList.add(m1);
		mList.add(m2);
		return mList;
		
	}
}
