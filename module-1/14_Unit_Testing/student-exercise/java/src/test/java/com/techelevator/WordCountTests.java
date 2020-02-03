package com.techelevator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import java.util.HashMap;
import java.util.Map;

public class WordCountTests {

	WordCount countTest = new WordCount();

	@Test
	public void word_count__key_test() {
		String[] testArray = { "a", "b", "a", "c", "b" };
		Map<String, Integer> testMap = countTest.getCount(testArray);
		String[] keyArray = { "a", "b", "c" };
		String[] outputArray = testMap.keySet().toArray(new String[0]);
		Assert.assertArrayEquals(keyArray, outputArray);
	}

	@Test
	public void word_count_test_2() {
		String[] testArray = { "a", "b", "a", "c", "b" };
		Map<String, Integer> testMap = countTest.getCount(testArray);
		Object[] objectArray = { 2, 2, 1 };
		Object[] outputArray = testMap.values().toArray();
		Assert.assertArrayEquals(objectArray, outputArray);
	}
}
