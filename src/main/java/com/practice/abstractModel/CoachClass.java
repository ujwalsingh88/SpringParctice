package com.practice.abstractModel;

public abstract class CoachClass {

	public  int id;
	public int extraPercentage;
	public int getId() {
		return id;
	}

	public int getExtraPercentage() {
		return extraPercentage;
	}

	
	
	public CoachClass(int id) {
		this.id=id;
	}

}
