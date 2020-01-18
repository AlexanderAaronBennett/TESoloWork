package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		Scanner initialInputScanner = new Scanner(System.in);
		System.out.println("Hello! Please input a decimal you would like converted to binary");
		String initialInput = initialInputScanner.nextLine();
		String[] inputSplit = initialInput.split(" ");

		int userInputInt = Integer.parseInt(initialInput);

		for (int i = 0; i < inputSplit.length; i++) {
			int element = Integer.parseInt(inputSplit[i]);
			int q = element;
			int r = 0;
			String digit = " ";
			String binary = " ";
			while (0 < q) {
				r = q % 2;
				q = q / 2;
				digit = String.valueOf(r);
				binary = digit + binary;
			}
			System.out.println(element + " in binary is  " + binary);
		}
	}
}