package com.techelevator;

import org.junit.*;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class KataFizzBuzzTest {
	KataFizzBuzz kfbt;
	@Before
	public void setUp() {
		KataFizzBuzz kfbt = new KataFizzBuzz();
	}
@Test
public void test_for_fizz() {
	Assert.assertEquals( "Fizz", kfbt.Fizzbuzz(3));
}
@Test
public void test_for_buzz() {
	Assert.assertEquals( "Buzz", kfbt.Fizzbuzz(5));
}
@Test
public void test_for_fizz_buzz() {
	Assert.assertEquals( "FizzBuzz", kfbt.Fizzbuzz(45));
}
@Test
public void test_number_to_string() {
	Assert.assertEquals( "7", kfbt.Fizzbuzz(7));
}
@Test
public void test_greater_than_100() {
	Assert.assertEquals("", kfbt.Fizzbuzz(101));
}
@Test
public void test_less_than_0() {
	Assert.assertEquals( "", kfbt.Fizzbuzz(-1));
}
}
