package com.techelevator.farm;

public class OldMacdonald {
	public static void main(String[] args) {

		FarmAnimal[] farmAnimals = new FarmAnimal[] { new Cow(), new Chicken() };

		for (FarmAnimal animal : farmAnimals) {
			
			String name = animal.getName();
			String sound = animal.getSound();
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a " + name + ", ee, ay, ee, ay, oh!");
			System.out.println("With a " + sound + " " + sound + " here");
			System.out.println("And a " + sound + " " + sound + " there");
			System.out.println("Here a " + sound + " there a " + sound + " everywhere a " + sound + " " + sound);
			System.out.println();
		}
		
		Singable[] thingsThatSing = new Singable[] { new Cow(), new Chicken(), new Tractor()};
		
		for (Singable thing : thingsThatSing) {
			
			System.out.println(thing.sing());
			System.out.println(thing.tuneSinger());
			System.out.println();
		}
		
		Flyable[] dreamersAndHopers = new Flyable[3];
		dreamersAndHopers[0] = new Cow();
		dreamersAndHopers[1] = new Tractor();
		dreamersAndHopers[2] = new Cow();
		
		for ( Flyable dreamerAndHoper : dreamersAndHopers ) {
			System.out.println(dreamerAndHoper.getName() + " " + dreamerAndHoper.doYouBelieve(110));
		}
		
		Flyable sampleFlyableIndividual = new Cow();
		Cow sampleCow = new Cow();
		
		Cat penelope = new Cat("Penelope", "Meow");
		penelope.sleep();
	farmAnimals = new FarmAnimal[] { new Cow(), new Chicken(), penelope };

		for (FarmAnimal animal : farmAnimals) {
			
			String name = animal.getName();
			String sound = animal.getSound();
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a " + name + ", ee, ay, ee, ay, oh!");
			System.out.println("With a " + sound + " " + sound + " here");
			System.out.println("And a " + sound + " " + sound + " there");
			System.out.println("Here a " + sound + " there a " + sound + " everywhere a " + sound + " " + sound);
			System.out.println();
		}
	}
}