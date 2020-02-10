package com.techelevator;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
public class Less20Tests {
	Less20 test20;
	@Before
	public void setup() {
		test20 = new Less20();
	}
	@After
	public void teardown() {
	}
	@Test
	public void one_less_than_multiple_twenty() {
	boolean test = test20.isLessThanMultipleOf20(39);
	Assert.assertEquals(true, test);
	}
	@Test
	public void two_less_than_multiple_twenty() {
	boolean test = test20.isLessThanMultipleOf20(38);
	Assert.assertEquals(true, test);
	}
	@Test
	public void three_less_than_multiple_twenty() {
	boolean test = test20.isLessThanMultipleOf20(37);
	Assert.assertEquals(false, test);
	}
	@Test
	public void one_more_than_multiple_twenty() {
	boolean test = test20.isLessThanMultipleOf20(41);
	Assert.assertEquals(false, test);
	}

}
