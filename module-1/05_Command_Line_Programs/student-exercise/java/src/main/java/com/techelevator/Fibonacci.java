package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner initialInputScanner = new Scanner(System.in);
		System.out.println("Hello! Please input your Fibonacci number!");
		String strInitialInput = initialInputScanner.nextLine();
		int userInputInt = Integer.parseInt(strInitialInput);
		
			
			int fiboA = 0, fiboB = 1;
		  
		        int i=1;
		        while(fiboA <= userInputInt)
		        {
		            System.out.print(fiboA+" ");
		            int fiboC = fiboA + fiboB;
		            fiboA = fiboC;
		            fiboB = fiboC;
		            i++;
		        }
	 
		}
	 
	}
