package com.techelevator;


/*FruitTree

Data Members

Attribute	Data Type	Get	Set	Description
typeOfFruit	string	X		The type of fruit on the tree.
piecesOfFruitLeft	int	X		The number of remaining fruit pieces on the tree.
Methods

`public bool pickFruit(int numberOfPiecesToRemove)`
Notes

pickFruit(int numberOfPiecesToRemove) is a method
If there are enough pieces on the tree, "picks" the fruit and updates piecesOfFruitLeft by subtracting numberOfPiecesToRemove from it.
Returns true if successful (there were enough pieces to pick) or false if no fruit was picked (piecesOfFruitLeft was less than numberOfPiecesToRemove).
Constructor

The FruitTree class has a single constructor. It accepts two arguments: typeOfFruit and startingPiecesOfFruit.

`public FruitTree(string typeOfFruit, int startingPiecesOfFruit)`
*/
public class FruitTree {
	
	private String typeOfFruit;
	private int piecesOfFruitLeft;
	
	public FruitTree(String typeOfFruit, int startingPiecesOfFruit) {
		
		this.typeOfFruit = typeOfFruit;
		this.piecesOfFruitLeft = startingPiecesOfFruit;
		
		
	}
	

	public boolean pickFruit(int numberOfPiecesToRemove) {	
		
		if (piecesOfFruitLeft < numberOfPiecesToRemove) {
			return false;
		}
		else {this.piecesOfFruitLeft = piecesOfFruitLeft - numberOfPiecesToRemove;
				return true;
		}
		
		
		
		}


	public String getTypeOfFruit() {
		return typeOfFruit;
	}


	public int getPiecesOfFruitLeft() {
		return piecesOfFruitLeft;
	}
	
	
		
	}
	


