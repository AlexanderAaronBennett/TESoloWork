package com.techelevator.PostageCalculator;

public class SPUTwoDayBusiness extends FexEd {

	public double calculateRate(int distance, double weight) {
		 double rate = (weight * 0.050) * (double) distance;
		 return rate /16;}

	@Override
	public String getName() {

		return "SPU Two Day Business \t \t";
	}
}


