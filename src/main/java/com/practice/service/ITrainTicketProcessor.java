package com.practice.service;

import com.practice.abstractModel.AbstractTrainTicket;

public interface ITrainTicketProcessor {

	public int calculateBasePrice(AbstractTrainTicket t);
	public int calculateFinalPrice(AbstractTrainTicket t);
}
