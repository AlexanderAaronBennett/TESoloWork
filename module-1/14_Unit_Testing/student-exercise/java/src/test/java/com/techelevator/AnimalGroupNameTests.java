package com.techelevator;
import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class AnimalGroupNameTests {
	AnimalGroupName animals;
	@Before
	public void setup() {
		 animals =  new AnimalGroupName();
		
	}
	@After
	public void teardown() {
	}
	    
@Test
public void animal_group_rhino_returns_crash() {
	
	String rhino = animals.getHerd("rhino");
	Assert.assertEquals("Crash", rhino);
}
@Test
public void animal_group_giraffe_returns_tower() {
	
	String giraffe = animals.getHerd("giraffe");
	Assert.assertEquals("Tower", giraffe);
}
@Test
public void animal_group_elephant_returns_name() {
	
	String elephant = animals.getHerd("elephant");
	Assert.assertEquals("Herd", elephant);

}
public void animal_group_lion_returns_name() {
	
	String lion = animals.getHerd("lion");
	Assert.assertEquals("Herd", lion);

}
public void animal_group_crow_returns_murder() {
	
	String crow = animals.getHerd("crow");
	Assert.assertEquals("Murder", crow);

}
public void animal_group_pigeon_returns_kit() {
	
	String pigeon = animals.getHerd("pigeon");
	Assert.assertEquals("Kit", pigeon);

}
public void animal_group_flamingo_returns_Pat() {
	
	String flamingo = animals.getHerd("flamingo");
	Assert.assertEquals("Pat", flamingo);

}
public void animal_group_deer_returns_herd() {
	
	String deer = animals.getHerd("deer");
	Assert.assertEquals("Herd", deer);

}
public void animal_group_dog_returns_pack() {
	
	String dog = animals.getHerd("dog");
	Assert.assertEquals("Pack", dog);

}
public void animal_group_crocodile_returns_float() {
	
	String crocodile = animals.getHerd("crocodile");
	Assert.assertEquals("Float", crocodile);

}
}
