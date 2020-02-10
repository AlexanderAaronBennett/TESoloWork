package com.techelevator.PostageCalculator;

public class PostalServiceFirstClass extends PostalService {

	public double calculateRate(int distance, double weight) {
		 
		 
		 	if(weight <= 2) {return 0.035 * distance;}
		 	else if (weight <= 8 ) {return 0.040 * distance;}
		 	else if (weight <= 15 ) {return 0.047 * distance;}
		 	else if (weight <= 48 ) {return 0.195 * distance;}
		 	else if (weight <= 128 ) {return 0.450 * distance;}
	return .500 * distance;}
//NEED TO ACCOUNT FOR LBS OR O

	@Override
	public String getName() {

		return "PostalServiceFirstClass \t";
	}
}
