package com.techelevator.farm;

public class Tractor implements Singable, Flyable  {
	
	private String  name = "platypi tractor";
	private String sound = "uhhhhh what?";

	public String sing() {

		return "I'm a " + name + "and I sing like this" + sound;
}

	
	public String doYouBelieve(int probabilityOfFlight) {
		if (probabilityOfFlight > 50) {
			return "You might have a shot.";
		}
		return "Nice try you're a tractor";
	}
	public String getName() {
		return name;
	}
	
	public boolean tuneSinger() {
	
		return false;
	}
}
