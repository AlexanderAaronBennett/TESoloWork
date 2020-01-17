package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {

Scanner tempScanner = new Scanner(System.in);
		
		System.out.println("Hello! Welcome to linear conversion!");
		
		System.out.println("Please enter the distance:");
		
		String strLength = tempScanner.nextLine();
		//System.out.println(strLength);
		
		double doubleLength = Double.parseDouble(strLength);
				
		System.out.println(doubleLength);
		
		System.out.println("Is the measurement in (m)eter or (f)eet?");
		
		
		Scanner lengthUnitScanner = new Scanner(System.in);

		String lengthUnitString = lengthUnitScanner.nextLine();
		if (lengthUnitString.equalsIgnoreCase("m")){
			System.out.println(doubleLength + " m is " + (doubleLength * 0.3048) + "F ");
		}
		
		else {
		System.out.println(doubleLength + "f is " + (doubleLength * 3.2808399) + " m ");
		}
	}

}
