package com.techelevator;

public class KataFizzBuzz {
	public static String Fizzbuzz(int result) {
		if (result < 0 || result > 100) {
			return "";
		}

		if (result % 3 == 0 && result % 5 == 0||Integer.toString(result).contains("3") && Integer.toString(result).contains("5")) {
			return "FizzBuzz";
		} else if (result % 5 == 0||Integer.toString(result).contains("5")) {
			return "Buzz";
		} else if (result % 3 == 0||Integer.toString(result).contains("3")) {
			return "Fizz";
		}else {
			return Integer.toString(result);
		}
	}

}
