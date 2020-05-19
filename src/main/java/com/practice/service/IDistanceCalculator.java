package com.practice.service;

import com.practice.abstractModel.AbstractTrainTicket;

public interface IDistanceCalculator {

	//Method to find distance between source and destination Station
	//within Ticket object
	
	public int findStationsDistance(AbstractTrainTicket t);
	
}
