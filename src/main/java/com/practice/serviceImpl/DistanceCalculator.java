package com.practice.serviceImpl;

import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.practice.abstractModel.AbstractTrainTicket;
import com.practice.service.IDistanceCalculator;

public class DistanceCalculator implements IDistanceCalculator {

	@Override
	public int findStationsDistance(AbstractTrainTicket t) {
		int distance = Stream.generate(new Random()::nextInt).limit(1).collect(Collectors.toList()).get(0)/1000000; 
		return distance;
	}

}
