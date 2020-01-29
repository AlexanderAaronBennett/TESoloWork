package com.techelevator.PostageCalculator;

public class PostalServiceSecondClass extends PostalService {

		public double calculateRate(int distance, double weight) {
				 	if(weight <= 2) {
				 	return 0.0035 * distance;}
				 	else if (weight <= 8 ) {return 0.0040 * distance;}
				 	else if (weight <= 15 ) {return 0.0047 * distance;}
				 	else if (weight <= 48 ) {return 0.0195 * distance;}
				 	else if (weight <= 128 ) {return 0.0450 * distance;}
			return .0500 * distance;}
		//NEED TO ACCOUNT FOR LBS OR O



		@Override
		public String getName() {

			return "PostalServiceSecondClass \t";
		}
	}

