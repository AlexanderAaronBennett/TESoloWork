package com.techelevator.TollBoothCalculator;

public class Car implements VehicleInterface {

private boolean hasTrailer;

public Car(boolean hasTrailer) {
	this.hasTrailer = hasTrailer;
	
}

	
	public double calculateToll(int distance) {
		double toll = distance * 0.020;
		if(hasTrailer) {
			toll = toll + 1.00;
		}
		return toll;
	}

	public boolean isHasTrailer() {
		return hasTrailer;
	}


	@Override
	public String getType() {
		if (hasTrailer) {
		return "Car with trailer";
	}
		{return "Car                  ";



	}
	}
}
	


