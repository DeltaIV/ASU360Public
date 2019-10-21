package cse360assign3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	Calculator test = new Calculator();
	
	@Test
	void test() {
		test.add(5);
		test.subtract(3);
		test.add(3);
		test.mult(7);
		assertTrue(test.getTotal() == 35);
		test.div(7);
		assertTrue(test.getTotal() == 5);
		test.div(7);
		assertTrue(test.getTotal() == 0);
		test.div(0);
		test.power(3);
		assertTrue(test.getTotal() == 0);
		test.add(4);
		test.power(-2);
		assertTrue(test.getTotal() == 0);
		test.add(1);
		test.power(3);
		assertTrue(test.getTotal() == 27);
		System.out.println(test.toString());
	}

}
