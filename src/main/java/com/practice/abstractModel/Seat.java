package com.practice.abstractModel;

import java.util.List;

public abstract class Seat {


		public int seatId;
		public int extraChargePercentage;
		public boolean isAvailable;
		
		public Seat(int seatId) {
			this.seatId = seatId;
			this.isAvailable=true;
		}
		
		public boolean isAvailable() {
			return isAvailable;
		}

		public void setAvailable(boolean isAvailable) {
			this.isAvailable = isAvailable;
		}

				
		public int getSeatId() {
			return seatId;
		}
		
		public int getExtraChargePercentage() {
			return extraChargePercentage;
		}
		


}
