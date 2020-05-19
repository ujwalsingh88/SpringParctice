package com.practice.serviceImpl;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.practice.abstractModel.AbstractTrainTicket;
import com.practice.model.TrainTicket;
import com.practice.service.IDistanceCalculator;

public class DistanceCalculatorTest {
	private IDistanceCalculator dc;
	private AbstractTrainTicket t;
	@Before
	public void setUp() throws Exception {
		dc = new DistanceCalculator();
		t = new TrainTicket(null, null, null);
	}

	@Test
	public void testFindStationsDistance() {
		assertNotNull(dc.findStationsDistance(t));
	}

}
