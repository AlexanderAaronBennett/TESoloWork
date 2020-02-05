package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args)  {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter path to input file >>> ");
		String path = userInput.nextLine();
		System.out.print("Please enter the word you're looking for >>> ");
		String word = userInput.nextLine();
		System.out.print("Is the word case sensitive (Y/N)? >>> ");
		String caseSensitive = userInput.nextLine();
		File inputFile = new File(path);
		
	try {	
		Scanner scanner = new Scanner(inputFile);
		
		int counter = 0;

			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				if(
					(caseSensitive.equalsIgnoreCase("Y") && line.contains(word)) ||
					(caseSensitive.equalsIgnoreCase("N") && line.toLowerCase().contains(word.toLowerCase()))
				) {
					System.out.println(counter + ")" + line);
					
					
				}
				counter ++;
			}
	}	
		catch(FileNotFoundException e){	
			System.out.println("Please input valid file name");
			
		}
	}
		
	}
	
//