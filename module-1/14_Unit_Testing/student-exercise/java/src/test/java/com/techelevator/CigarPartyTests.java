package com.techelevator;
import static org.junit.Assert.assertEquals;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class CigarPartyTests {
	CigarParty testParty;
	@Before
	public void setup() {
		testParty = new CigarParty();
		 
		
	}
	@After
	public void teardown() {
	}
	    
@Test
public void squirrel_cigar_party_minimum_cigars_not_weekend() {
	
	boolean haveParty = testParty.haveParty(30, false);
	Assert.assertEquals(false, haveParty);
}
	
	@Test
	public void squirrel_cigar_party_maximum_cigars_not_weekend() {
		
		boolean haveParty = testParty.haveParty(61, false);
		Assert.assertEquals(false, haveParty);

}
	@Test
	public void squirrel_cigar_party_min_cigars_weekend() {
		
		boolean haveParty = testParty.haveParty(30, true);
		Assert.assertEquals(false, haveParty);
}
	@Test
	public void squirrel_cigar_party_maximum_cigars_weekend() {
		
		boolean haveParty = testParty.haveParty(61, true);
		Assert.assertEquals(true, haveParty);
}
	@Test
	public void squirrel_cigar_party_in_range_cigars_not_weekend() {
		
		boolean haveParty = testParty.haveParty(50, false);
		Assert.assertEquals(true, haveParty);
}
	@Test
	public void squirrel_cigar_party_in_range_cigars_weekend() {
		
		boolean haveParty = testParty.haveParty(50, true);
		Assert.assertEquals(true, haveParty);
	}
}