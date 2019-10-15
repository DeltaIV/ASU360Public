/**
 * AddingMachine.java - Add and subtract a value

 * @author  David Moller 
 * 10/5/2019
 * Class: 85141
 * @version %I%, %G%
 */ 

package cse360assign2;

/**
 * This method performs math operations on the total based on numbers passed
 * in to the methods 
 * @param  int value
 * @return string of the operations performed
 */
public class AddingMachine {

	/**
	 * This is the total
	 */
	private int total;
	/**
	 * This is the string to return
	 */
	private String history = "0";
	/**
	   * creates a new Adding Machine.
	   */
	public AddingMachine () {
		total = 0;
	}
	/**
	  * This returns the total
	  */
	public int getTotal () {
		return total;
	}
	/**
	  * This adds to the total
	  * @param int set by user
	  */
	public void add (int value) {
		total = total + value;
		history = history + " + " + value;
	}
	/**
	  * This subtracts from the total
	  * @param int set by user
	  */
	public void subtract (int value) {
		total = total - value;
		history = history + " - " + value;
	}
	/**
	  * This returns the ooerations to the total
	  */
	public String toString () {
		return history;
	}

	/**
	  * This clears
	  */
	public void clear() {
	
	}
}