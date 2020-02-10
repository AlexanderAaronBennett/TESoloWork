package com.techelevator.PostageCalculator;

public class SPUFourDayGround extends SPU{

	public double calculateRate(int distance, double weight) {
		 double rate = (weight * 0.0050) * (double) distance;
		 return rate / 16;}

	@Override
	public String getName() {

		return "SPU Four Day Ground \t \t";
	}
}

//If "4-Day Ground" then rate = (weight * 0.0050) * distance.
