package com.practice.serviceImpl;

import com.practice.abstractModel.AbstractTrainTicket;
import com.practice.service.ITrainTicketProcessor;

public class TrainTicketProcessor implements ITrainTicketProcessor {

	@Override
	public int calculateBasePrice(AbstractTrainTicket t) {
		int basePrice = t.getDistance()/5 *2;
		return basePrice;
	}

	@Override
	public int calculateFinalPrice(AbstractTrainTicket t) {
		int finalPrice = t.getBasePrice()+ (t.getBasePrice()/100*t.getcClass().getExtraPercentage());
		return finalPrice;
	
	}

}
