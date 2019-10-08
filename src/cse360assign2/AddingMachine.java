/**  
* AddingMachine.java - Add and subtract a value
* <p>
* 
* !Modified by!
* @author  David Moller 
* 10/5/2019
* Class: CSE360, Friday, 2019
* @version %I%, %G%
*/ 

package cse360assign2;

public class AddingMachine {

	private int total;
	private String history = "0";
	
	public AddingMachine () {
		total = 0;
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		total = total + value;
		history = history + " + " + value;
	}
	
	public void subtract (int value) {
		total = total - value;
		history = history + " - " + value;
	}
		
	public String toString () {
		return history;
	}

	public void clear() {
	
	}
}
