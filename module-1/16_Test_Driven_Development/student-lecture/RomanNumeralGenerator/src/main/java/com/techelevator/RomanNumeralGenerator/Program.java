package com.techelevator.RomanNumeralGenerator;

public class Program {

	public static void main(String[] args) {
		
		RomanNumeral myNumeral = new RomanNumeral();
		for (int i = 1 ; i <= 100; i ++) {
		System.out.println(myNumeral.generateRomanNumeral(i));
	

	}

}
}
