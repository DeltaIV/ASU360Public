/**
 * Calculator.java - Add and subtract a value

 * @author  David Moller 
 * 10/20/2019
 * Class: 85141
 * @version %I%, %G%
 */ 
package cse360assign3;

/**
 * This method extends the AddingMachine class
 * in to the methods 
 * @param  int value
 * @return string of the operations performed
 */
public class Calculator extends AddingMachine {
	/**
	   * creates a new Calculator.
	   */
	public Calculator() {
		super();
	}
	/**
	  * This multiplies the value
	  * @param int set by user
	  */
	public void mult (int value) {
		total = total * value;
		history = history + " * " + value;
	}
	/**
	  * This divides by the value, if the 
	  * value is 0 then total is 0
	  * @param int set by user
	  */
	public void div (int value) {			
		try {
			total = total / value;
		} catch (ArithmeticException e) {
			total = 0;
		}
		history = history + " / " + value;
	}
	/**
	  * This takes the power of the input
	  * if the input is neg set total to 0
	  * @param int set by user
	  */
	public void power (int value) {
		if (value > 0) {
			for (int i = 0; i < value; i++) {
				total = total * value;
			}
		}
		else {
			total = 0;
		}
		history = history + " ^ " + value;
	}
}
