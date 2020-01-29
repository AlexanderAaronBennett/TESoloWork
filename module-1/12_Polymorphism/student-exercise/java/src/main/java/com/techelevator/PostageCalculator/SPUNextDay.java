package com.techelevator.PostageCalculator;

public class SPUNextDay extends FexEd {
	public double calculateRate(int distance, double weight) {
		 double rate = (weight * 0.075) * (double) distance;
		 return rate /16;}

	@Override
	public String getName() {

		return "SPU Next Day     \t\t ";
}
}
