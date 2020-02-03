package com.techelevator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
public class NonStartTests {
	@Before
	public void setup() {
		
	}
	@After
	public void teardown() {
	}
	@Test
	public void returns_proper_string_if_gt_one() {
		NonStart testStart = new NonStart();
	Assert.assertEquals("ellohere", testStart.getPartialString("Hello", "There"));
	Assert.assertEquals("i", testStart.getPartialString("hi", "i"));
	Assert.assertEquals("", testStart.getPartialString("i", "i"));
	Assert.assertEquals("i", testStart.getPartialString("", "hi"));
	Assert.assertEquals("i", testStart.getPartialString("hi", ""));
	}
}
