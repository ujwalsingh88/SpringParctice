package com.practice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.practice.abstractModel.AbstractParkingSpot;
import com.practice.model.ParkingSpot;

public interface IParkingDataGenerator {

	 public static List<ParkingSpot> GenerateAllParkingSpots(int startFloorNo,
			int endFloorNo, int startPosition, int endPosition) {
		
		List<ParkingSpot> parkingSpotList =new ArrayList<ParkingSpot>();
		List <Integer> floorList = Stream.iterate(startFloorNo, i->i+1).
				limit(endFloorNo).map(n->n).collect(Collectors.toList());
		List <Integer> postionList = Stream.iterate(startPosition, i->i+1).
				limit(endPosition).map(n->n).collect(Collectors.toList());
		
		for(int floorNo:floorList) {
			for(int position:postionList) {
				
				parkingSpotList.add(new ParkingSpot(floorNo, position));
			}
		}
		return parkingSpotList;
	}
}
