package com.techelevator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
public class StringBitsTests {

	@Before
	public void setup() {
		
		
	}
	@After
	public void teardown() {
	}
	@Test
	public void returns_proper_string_bits() {
		StringBits bitsTest = new StringBits();
	Assert.assertEquals("Hlo", bitsTest.getBits("Hello"));
	Assert.assertEquals("h", bitsTest.getBits("hi"));
	Assert.assertEquals("", bitsTest.getBits(null));
	
	}
}


