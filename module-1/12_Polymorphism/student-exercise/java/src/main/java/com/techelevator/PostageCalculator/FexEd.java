package com.techelevator.PostageCalculator;

public class FexEd implements DeliveryDriver {

	@Override
	public String getName() {
		
		return "FexEd           \t\t";
	}

	@Override
	public double calculateRate(int distance, double weight) {
		 double rate = 20.00;
		if (distance > 500 && weight > 48)
				{rate = 28.00;}
				
		else if (weight > 48) {rate = 23.00;}
		else if(distance > 500) {rate = 25.00;}
				
				
		return rate;
	}

}

