package com.practice.model;

import com.practice.abstractModel.AbstractStation;
import com.practice.abstractModel.AbstractTrainTicket;
import com.practice.abstractModel.CoachClass;

public class TrainTicket extends AbstractTrainTicket {

	public TrainTicket(AbstractStation source, AbstractStation destination, CoachClass cClass) {
		super(source, destination, cClass);
		
	}

}
