package com.practice.main;

import com.practice.abstractModel.AbstractStation;
import com.practice.abstractModel.AbstractTrainTicket;
import com.practice.abstractModel.CoachClass;
import com.practice.model.FirstClass;
import com.practice.model.SecondClass;
import com.practice.model.Station;
import com.practice.model.TrainTicket;
import com.practice.service.IDistanceCalculator;
import com.practice.service.ITrainTicketProcessor;
import com.practice.serviceImpl.DistanceCalculator;
import com.practice.serviceImpl.TrainTicketProcessor;

public class TrainTicketProblem {

public void Demostrate() {
		
		IDistanceCalculator pc =new DistanceCalculator();
		ITrainTicketProcessor tp = new TrainTicketProcessor();
		
		AbstractStation s1 = new Station(5);
		AbstractStation s2 = new Station(6);
		AbstractStation d1 = new Station(7);
		AbstractStation d2 = new Station(8);
		CoachClass c1 = new FirstClass(11);
		CoachClass c2 = new SecondClass(13);
		
		AbstractTrainTicket t1 = new TrainTicket(s1, d1, c1);
		t1.setDistance(pc.findStationsDistance(t1));
		System.out.println("Distance " + t1.getDistance());
		t1.setBasePrice(tp.calculateBasePrice(t1));
		System.out.println("BasePrice " + t1.getBasePrice());
		t1.setFinalPrice(tp.calculateFinalPrice(t1));
		System.out.println("FinalPrice " + t1.getFinalPrice());
		
		
		
		
		AbstractTrainTicket t2 = new TrainTicket(s1, d1, c2);
		t2.setDistance(pc.findStationsDistance(t2));
		System.out.println("Distance " + t2.getDistance());
		t2.setBasePrice(tp.calculateBasePrice(t2));
		System.out.println("BasePrice " + t2.getBasePrice());
		t2.setFinalPrice(tp.calculateFinalPrice(t2));
		System.out.println("FinalPrice " + t2.getFinalPrice());
		
		
		
		
		
		AbstractTrainTicket t3 = new TrainTicket(s2, d2, c2);
		t3.setDistance(pc.findStationsDistance(t3));
		System.out.println("Distance " + t3.getDistance());
		t3.setBasePrice(tp.calculateBasePrice(t3));
		System.out.println("BasePrice " + t3.getBasePrice());
		t3.setFinalPrice(tp.calculateFinalPrice(t3));
		System.out.println("FinalPrice " + t3.getFinalPrice());
		
	}
	
	
}
