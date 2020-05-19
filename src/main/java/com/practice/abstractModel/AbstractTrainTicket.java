package com.practice.abstractModel;

public class AbstractTrainTicket {

	public AbstractStation source;
	public AbstractStation destination;
	public CoachClass cClass;
	public int basePrice;
	public int finalPrice;
	public int distance;
	
	

	public AbstractTrainTicket(AbstractStation source, AbstractStation destination, CoachClass cClass) {
		this.source = source;
		this.destination = destination;
		this.cClass = cClass;
	}
	
	public int getDistance() {
		return distance;
	}


	public void setDistance(int distance) {
		this.distance = distance;
	}


	public int getBasePrice() {
		return basePrice;
	}


	public void setBasePrice(int basePrice) {
		this.basePrice = basePrice;
	}


	public int getFinalPrice() {
		return finalPrice;
	}


	public void setFinalPrice(int finalPrice) {
		this.finalPrice = finalPrice;
	}


	public AbstractStation getSource() {
		return source;
	}


	public AbstractStation getDestination() {
		return destination;
	}


	public CoachClass getcClass() {
		return cClass;
	}

	
}
