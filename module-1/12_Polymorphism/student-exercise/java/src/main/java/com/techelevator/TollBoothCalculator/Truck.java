package com.techelevator.TollBoothCalculator;

public class Truck implements VehicleInterface {
	private int numberOfAxels;

	
	 public Truck(int numberOfAxels) {
		 this.numberOfAxels = numberOfAxels;
		 
	 }
	
	
	public double calculateToll(int distance) {
		
		double toll = distance * 0.040;
		if(numberOfAxels  == 6) {
			toll = distance * 0.045;
		}
		else if (numberOfAxels >= 8) {
			toll = distance * 0.048;
		}
		
		return toll;
	}



	public int getNumberOfAxels() {
		return numberOfAxels;
	}


	@Override
	public String getType() {
		if(numberOfAxels  == 6) {
			return "Truck (6 axels)      ";
		}
		else if (numberOfAxels >= 8) {
			return "Truck(8 axels)        ";
		}
	
		return "Truck                ";
	}
	
	
	}

