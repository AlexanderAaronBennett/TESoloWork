package com.techelevator.farm;

public abstract class Tractor implements Singable, Flyable {
	
	private String name = "Platipi Tractor";
	private String sound = "uh.... what?";
	
	public String sing() {
		return "You should get out the way!";
	}
	
	public String getName() {
		return name;
	}
	
	public boolean tuneSinger() {
		return false;
	}

	public String doYouBelieve(int probabilityOfFlight) {
		if (probabilityOfFlight > 50) {
			return "You might have a shot.";
		}
		return "nice try! You're a tractor... stick to the fields.";
	}

}
