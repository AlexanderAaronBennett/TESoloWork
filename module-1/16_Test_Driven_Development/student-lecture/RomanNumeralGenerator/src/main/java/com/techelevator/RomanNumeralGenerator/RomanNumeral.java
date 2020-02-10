package com.techelevator.RomanNumeralGenerator;

import java.util.HashMap;
import java.util.Map;


	private int valueToConvert;
	private String romanNumeralResult;
	
	Map <Integer, String> numeralLookup = new HashMap<Integer, String>();
	public class RomanNumeral {
	numeralLookup.put(1, "I");
	numeralLookup.put(4, "IV");
	numeralLookup.put(5, "V");
	numeralLookup.put(9, "IX");
	numeralLookup.put(10, "X");
	numeralLookup.put(40, "XL");
	numeralLookup.put(50, "L");
	numeralLookup.put(90, "XC");
	numeralLookup.put(100, "C");
	numeralLookup.put(400, "CD");
	numeralLookup.put(500, "D");
	numeralLookup.put(900, "CM");
	numeralLookup.put(1000, "M");
	}
	
	public void getValueAndDecrementI(int i) {
		romanNumeralResult = romanNumeralResult + numeralLookup.get(1000);
		i = i - 1000;
		
		return i;
	}
	

	public String generateRomanNumeral(int i) {
		String str = "";
		
	
		
		

			
		
		while (i >= 1000) {
			str = str + numeralLookup.get(1000);
			i = i - 1000;
		}
		while (i >= 900) {
			str = str + numeralLookup.get(9000);
			i = i - 900;
		}
		while (i >= 10) {
			str = str + "X";
			i = i - 10;
		}
		while (i >= 9) {
			str = str + "IX";
			i = i - 9;
		}
		while (i >= 5) {
			str = str + "V";
			i = i - 5;
		}
		while (i >= 4) {
			str = str + "IV";
			i = i - 4;
		}
		while (i >= 1) {
			str = "I" + str;
			i = i - 1;
		}
//		for (int r = 0;r <= 3; r++) {
//			str += "I";
//		}

		return str;

	}

}
