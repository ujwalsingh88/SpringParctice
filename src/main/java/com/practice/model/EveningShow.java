package com.practice.model;

import com.practice.abstractModel.Show;

public class EveningShow extends Show {

	public EveningShow(int showId) {
		super(showId);
		this.extraChargePercentage=4;
	}

}
