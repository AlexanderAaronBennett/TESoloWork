package com.techelevator.farm;

public class Cow extends FarmAnimal implements Flyable {

	public Cow() {
		super("Cow", "moooooOOOOOOOoo!");
	}


	public String doYouBelieve(int probabilityOfFlight) {
		if ( probabilityOfFlight > 100) {
			return " MooooOOOOve OVER FARM BIRDS!";
		}
		return "You're still a cow and are still really boring.";
	}

}