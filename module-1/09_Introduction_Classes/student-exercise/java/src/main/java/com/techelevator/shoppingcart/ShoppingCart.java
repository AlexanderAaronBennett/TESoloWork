package com.techelevator.shoppingcart;

public class ShoppingCart {

	//
	// Write code here
	//
	private int totalNumberOfItems = 0;
	private double totalAmountOwed = 0.00;
	
	public int getTotalNumberOfItems() {
		return totalNumberOfItems;
	}
	public double getTotalAmountOwed() {
		return totalAmountOwed;
	}
	
	public double getAveragePricePerItem() {
		 if( totalNumberOfItems > 0) {
		 
			 return totalAmountOwed / totalNumberOfItems;
		 }
			 
		
		 return 0;
		
	}
	public void addItems(int numberOfItems, double pricePerItem) {
		 this.totalNumberOfItems = totalNumberOfItems + numberOfItems;
		 this.totalAmountOwed = totalAmountOwed + (pricePerItem * numberOfItems);
	}
		
		
		
	
	public void empty() {		
		totalNumberOfItems = 0;
		totalAmountOwed = 0.0;
		
	}
}
	

