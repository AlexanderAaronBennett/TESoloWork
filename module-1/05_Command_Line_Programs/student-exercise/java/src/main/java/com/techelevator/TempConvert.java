package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		
Scanner tempFScanner = new Scanner(System.in);
		
		System.out.println("Hello! Welcome to temperature conversion!");
		
		System.out.println("Please enter the temperature:");
		
		String strF = tempFScanner.nextLine();
		//System.out.println(strTemp);
		
		double doubleF = Double.parseDouble(strF);
				
		System.out.println(doubleF);
		
		System.out.println("Is the temperature in (C)elsius, or (F)ahrenheit? (Please type C or F");
		
		
		Scanner tempUnitScanner = new Scanner(System.in);

		String tempUnitString = tempUnitScanner.nextLine();
		if (tempUnitString.equalsIgnoreCase("c")){
			System.out.println(doubleF + " C is " + (doubleF * 1.8 + 32) + "F ");
		}
		
		if (tempUnitString.equalsIgnoreCase("f"));{
			System.out.println(doubleF + "F is " + ((doubleF - 32) / 1.8) + " C ");
		}
		
		
//		String[] convertTemp = doubleTemp.split(" ");
//		
//		for (int i = 0; i < convertTemp.length; i ++) {
//			
//			double originalPrice = Double.parseDouble(prices[i]);
//			double discountAmount = originalPrice * discountPercent;
//			double convertTemp = originalPrice - discountAmount;
//			System.out.println("Original Price " + originalPrice + " " + "discount Amount" + discountAmount + " " + "Sale Price" + salePrice);
		}
		

	}

//}

//Tc = (Tf - 32) / 1.8 f => c
//Tf = Tc * 1.8 + 32 c => f