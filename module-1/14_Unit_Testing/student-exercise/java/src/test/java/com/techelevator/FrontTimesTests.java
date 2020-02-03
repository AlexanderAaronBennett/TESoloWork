package com.techelevator;
import static org.junit.Assert.assertEquals;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class FrontTimesTests {
	FrontTimes testTimes;
	@Before
	public void setup() {
		testTimes = new FrontTimes();
	}
	@After
	public void teardown() {
	}
		
		@Test
		public void null_and_gte_three() {
		String test = testTimes.generateString(null, 4);
		Assert.assertEquals("", test);
		

		}
		@Test
		public void null_and_lte_three() {
		String test = testTimes.generateString(null, 2);
		Assert.assertEquals("", test);
		

		}
		@Test
		public void not_null_and_gte_three() {
		String test = testTimes.generateString("Cho", 4);
		Assert.assertEquals("ChoChoChoCho", test);
		}
		@Test
		public void not_null_and_lte_three() {
		String test = testTimes.generateString("Cho", 2);
		Assert.assertEquals("ChoCho", test);
		


		}
		
	}
