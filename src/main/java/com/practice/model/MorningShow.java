package com.practice.model;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.practice.abstractModel.Seat;
import com.practice.abstractModel.Show;

public class MorningShow extends Show {

	public MorningShow(int showId) {
		super(showId);
		this.extraChargePercentage=2;
	}

}
