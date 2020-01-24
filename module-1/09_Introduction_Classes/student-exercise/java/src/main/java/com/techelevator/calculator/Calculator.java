package com.techelevator.calculator;

public class Calculator {

	//
	// Write code here
	//
	int result;

	public int getResult() {
		return result;
	}
	public int add (int addend) {
		
		this.result = addend + result;
		return result;
	}
public int multiply(int multiplier) {
	this.result = result * multiplier;
	return result;
	}
public int power(int exponent) {
	if (exponent > 0) {
	this.result = (int) Math.pow(this.result, exponent);
	}
	{
	this.result = (int) Math.pow(this.result, Math.abs(exponent));
}
	return result;
	
}
public void reset() {
	this.result= 0;
}
public int subtract(int subtrahend) {
	this.result = result - subtrahend;
	return result;
}
}

