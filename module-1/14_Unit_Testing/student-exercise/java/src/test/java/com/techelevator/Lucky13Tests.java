package com.techelevator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
public class Lucky13Tests {
	Lucky13 testLucky;
	@Before
	public void setup() {
		testLucky = new Lucky13();
	}
	@After
	public void teardown() {
	}
	@Test
	public void if_not_one_and_not_three() {
		int[]luckyArray1 = {0, 2, 4};
	Assert.assertEquals(true, testLucky.getLucky(luckyArray1));
	}
	@Test
	public void if_one_and_not_three() {
		int[]luckyArray2 = {0, 1, 4};
	Assert.assertEquals(false, testLucky.getLucky(luckyArray2));
	}
	@Test
	public void if_not_one_but_three() {
		int[]luckyArray3 = {0, 2, 3};
	Assert.assertEquals(false, testLucky.getLucky(luckyArray3));
	}
	@Test
	public void if_one_and_three() {
		int[]luckyArray4 = {1, 2, 3};
	Assert.assertEquals(false, testLucky.getLucky(luckyArray4));
	}
	@Test
	public void if_null_array() {
		int[]luckyArray5 = null;
	Assert.assertEquals(true, testLucky.getLucky(luckyArray5));
	}
	
}
