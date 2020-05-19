package com.practice.serviceImpl;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.practice.abstractModel.AbstractParkingSpot;
import com.practice.model.ParkingSpot;
import com.practice.service.IParkingSpotFinder;

public class ParkingSpotFinder implements IParkingSpotFinder {

	@Override
	public ParkingSpot findParkingSpot(List<ParkingSpot> prkngSptList) {
	
	List<ParkingSpot> availableList = prkngSptList.stream().filter(p->p.isAvailable==true)
			  .map(m->m).collect(Collectors.toList());
	 Collections.sort(availableList, (p1,p2)->{
							 return p1.getFloorNo()>p2.getFloorNo()?1:
								     p1.getFloorNo()<p2.getFloorNo()?-1:
								     p1.getPosition()>p2.getPosition()?1:-1;
								  });
	 return  availableList.get(0);
	}

}
