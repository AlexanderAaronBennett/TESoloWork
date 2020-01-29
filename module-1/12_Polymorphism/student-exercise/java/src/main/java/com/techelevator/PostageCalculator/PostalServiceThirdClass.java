package com.techelevator.PostageCalculator;

public class PostalServiceThirdClass extends PostalService {

	public double calculateRate(int distance, double weight) { 
			 	if(weight <= 2) {
			 	return 0.0020 * distance;}
			 	else if (weight <= 8 ) {return 0.0022 * distance;}
			 	else if (weight <= 15 ) {return 0.0024 * distance;}
			 	else if (weight <= 48 ) {return 0.0150 * distance;}
			 	else if (weight <= 128 ) {return 0.0160 * distance;}
		return .0170 * distance;}
//NEED TO ACCOUNT FOR LBS OR O

	@Override
	public String getName() {

		return "PostalServiceThirdClass \t";
	}
}

