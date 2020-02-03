package com.techelevator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
public class MaxEnd3Tests {
	
	@Before
	public void setup() {
		
	}
	@After
	public void teardown() {
	}
	@Test
	public void if_last_max_three() {
		MaxEnd3 testArray = new MaxEnd3();
		int[]testEndList1 = {1, 2, 3};
		int[]expectedArray = {3, 3, 3};
	Assert.assertArrayEquals(expectedArray, testArray.makeArray(testEndList1));
	}
	@Test
	public void if_first_max_three() {
		MaxEnd3 testArray = new MaxEnd3();
		int[]testEndList2 = {3, 2, 1};
		int[]expectedArray = {3, 3, 3};
	Assert.assertArrayEquals(expectedArray, testArray.makeArray(testEndList2));
	}
	@Test
	public void if_middle_max_three() {
		MaxEnd3 testArray = new MaxEnd3();
		int[]testEndList2 = {1, 3, 2};
		int[]expectedArray = {2, 2, 2};
	Assert.assertArrayEquals(expectedArray, testArray.makeArray(testEndList2));
	}
}
