package com.techelevator.TollBoothCalculator;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class TollCalculator {

	public static void main(String[] args) {
		 Random r = new Random();
		List<VehicleInterface> listOfVehicles = new ArrayList<VehicleInterface>();
		listOfVehicles.add(new Car(false));
		listOfVehicles.add(new Car(true));
		listOfVehicles.add(new Truck(4));
		listOfVehicles.add(new Truck (6));
		listOfVehicles.add(new Truck(8));
		listOfVehicles.add(new Tank());
		
		
		
		System.out.println("Vehicle                 Distance Traveled      Toll $ ");
		System.out.println("=======================================================");
		 for (VehicleInterface vehicle: listOfVehicles) {
			 int distanceTraveled = r.nextInt((240 - 10)+1) + 10;
			 
			 System.out.println(vehicle.getType() + "\t\t" + distanceTraveled + "\t\t" + "$" + vehicle.calculateToll(distanceTraveled));
//				System.out.println(distanceTraveled);
//				System.out.println(vehicle.calculateToll(distanceTraveled));

			 
		 }
	}
	
}
