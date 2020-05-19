package com.practice.serviceImpl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.practice.abstractModel.AbstracParkingTicket;
import com.practice.abstractModel.Vehicle;
import com.practice.model.Car;
import com.practice.model.ParkingSpot;
import com.practice.service.IParkingDataGenerator;
import com.practice.service.IParkingProcessor;

public class ParkingProcessorTest {
	private List<ParkingSpot> prkngSptList;
	private Vehicle v3;
	private IParkingProcessor p;
	private AbstracParkingTicket t1;
	@Before
	public void setUp() throws Exception {
		prkngSptList =IParkingDataGenerator.GenerateAllParkingSpots(0, 7, 1, 1000);
		v3 = new Car(6348);
		p = new ParkingProcessor();
		
	}

	@Test
	public void testCheckIn() {
		t1= p.CheckIn(v3, prkngSptList);
		assertTrue(t1.getPakingSpot().getFloorNo()==0 && t1.getPakingSpot().getPosition()==1);
	}

	@Test
	public void testCheckOut() {
		t1= p.CheckIn(v3, prkngSptList);
		p.CheckOut(t1, prkngSptList);
		System.out.println(t1.getCharge());
		assertEquals(6, t1.getCharge());
	}

}
