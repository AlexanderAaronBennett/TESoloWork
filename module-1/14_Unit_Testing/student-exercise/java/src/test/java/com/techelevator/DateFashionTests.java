package com.techelevator;
import static org.junit.Assert.assertEquals;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
public class DateFashionTests {
	DateFashion testFashion;
	@Before
	public void setup() {
		testFashion = new DateFashion();
		 
		
	}
	@After
	public void teardown() {
	}
	@Test
	public void less_than_two_do_not_get_table() {
		int getATable = testFashion.getATable(2, 3);
		Assert.assertEquals(0, getATable);
		
		int getATable2 = testFashion.getATable(2, 8);
		Assert.assertEquals(0, getATable2);
	}
	@Test
	public void more_than_two_maybe__table() {
		int getATable = testFashion.getATable(4, 5);
		Assert.assertEquals(1, getATable);
	}
	@Test
	public void more_than_8__get_table() {
		int getATable = testFashion.getATable(8, 4);
		Assert.assertEquals(2, getATable);
		
	}
}
