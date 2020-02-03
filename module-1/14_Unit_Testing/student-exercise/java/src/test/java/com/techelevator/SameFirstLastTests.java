package com.techelevator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
public class SameFirstLastTests {
	SameFirstLast testSame;
	@Before
	public void setup() {
		testSame = new SameFirstLast();
		
	}
	@After
	public void teardown() {
	}
	@Test
	public void one_at_first_and_last_return_true() {
			int[]sameArray1 = {1, 2, 1};
		Assert.assertEquals(true, testSame.isItTheSame(sameArray1));
		}
	@Test
	public void one_at_first_not_last_return_false() {
			int[]sameArray2 = {1, 2, 2};
		Assert.assertEquals(false, testSame.isItTheSame(sameArray2));
		}
	@Test
	public void null_return_false() {
			int[]sameArray3 = null;
		Assert.assertEquals(false, testSame.isItTheSame(sameArray3));
		}
	@Test
	public void returns_0() {
			int[]sameArray4 = {1,1};
		Assert.assertEquals(true, testSame.isItTheSame(sameArray4));
		}
	}
