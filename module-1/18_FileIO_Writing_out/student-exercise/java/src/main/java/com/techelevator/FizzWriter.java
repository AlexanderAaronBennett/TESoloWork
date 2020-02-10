package com.techelevator;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {
	int result;
	String fizzBuzzToString = Integer.toString(result);
	
	public static void main(String[] args) throws IOException {
		
		System.out.print("Enter a name for the new file >>> ");
		Scanner userInput = new Scanner(System.in);
		String path = userInput.nextLine();
		String fileName = userInput.nextLine();
		File newFile = new File( path);
		newFile.createNewFile();
		System.out.println("name: " + newFile.getName());
		try (PrintWriter writer = new PrintWriter(newFile)) {
			for( int i=0; i <= 300 ; i ++) {
				writer.println(fizzBuzz(i));
			}
		}
		System.out.println("size : " + newFile.length());
	}
	public static String fizzBuzz(int result) {
		if (result % 3 == 0 && result % 5 == 0
				|| Integer.toString(result).contains("3") && Integer.toString(result).contains("5")) {
			return "FizzBuzz";
		} else if (result % 5 == 0 || Integer.toString(result).contains("5")) {
			return "Buzz";
		} else if (result % 3 == 0 || Integer.toString(result).contains("3")) {
			return "Fizz";
		} else {

		}
		return Integer.toString(result);
					
	}

}
