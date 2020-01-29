package com.techelevator.PostageCalculator;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class PostageCalculator {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		{

			System.out.println("Enter the weight of the package ");
			String inputWeight = userInput.nextLine();

			System.out.println("(P)ounds or (O)unces? ");
			String inputMeasure = userInput.nextLine();
			double dblInputWeight = Double.parseDouble(inputWeight);
			if (inputMeasure.equalsIgnoreCase("P")) {
				dblInputWeight = dblInputWeight * 16;
			}

			System.out.println("What distance will it be traveling?");
			String inputDistance = userInput.nextLine();
			int intInputDistance = Integer.parseInt(inputDistance);

			List<DeliveryDriver> listOfDrivers = new ArrayList<DeliveryDriver>();
			listOfDrivers.add(new PostalServiceFirstClass());
			listOfDrivers.add(new PostalServiceSecondClass());
			listOfDrivers.add(new PostalServiceThirdClass());
			listOfDrivers.add(new FexEd());
			listOfDrivers.add(new SPUFourDayGround());
			listOfDrivers.add(new SPUTwoDayBusiness());
			listOfDrivers.add(new SPUNextDay());

			System.out.println("Delivery Method              Cost $ ");
			System.out.println("=======================================================");
			for (DeliveryDriver driver : listOfDrivers) {
				System.out.println(driver.getName() + "\t\t" + driver.calculateRate(intInputDistance, dblInputWeight));

			}
		}
	}
}