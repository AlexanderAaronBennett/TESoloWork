package com.techelevator.farm;

public class Chicken extends FarmAnimal  {

	public Chicken() {
		super("Chicken", "cluck!");
	}

	public void layEgg() {
		System.out.println("Chicken laid an egg!");
	}

	@Override
	public String eat(int howMuchFood) {
		// TODO Auto-generated method stub
		return null;
	}

}