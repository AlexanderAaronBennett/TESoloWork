package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.techelevator.farm.Cat;
import org.junit.Assert;
public class CatTest {

	@Before
	public void setup() {
		System.out.println("before each test :setup");
	}
	@After
	public void teardown() {
		System.out.println("before each test: teardown");
	}
	@Test
	public void cat_eat_method_returns_correct_string_when_fed_less_than_500() {
		Cat myTestCat = new Cat("Sylvester", "sufferin succotash!");
		String resultOfEat = myTestCat.eat(0);
		Assert.assertEquals("thanks, I'll wake you up at 4:30 AM for more food.");
		
	}
}
