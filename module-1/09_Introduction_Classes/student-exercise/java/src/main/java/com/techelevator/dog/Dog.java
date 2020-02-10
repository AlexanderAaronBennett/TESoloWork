package com.techelevator.dog;

public class Dog {

	private boolean isSleeping = false;
	
	public boolean isSleeping() {
		return this.isSleeping;
	}
	public String makeSound() {
		if (!isSleeping) {
		return "Woof!";
	} 
		
		return "Zzzzz...";
	
		
		}
	
	public void sleep() {
		isSleeping = true;
	}
	public void wakeUp() {
		isSleeping = false;
	}
}

