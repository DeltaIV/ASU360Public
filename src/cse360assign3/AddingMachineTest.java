package cse360assign3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddingMachineTest {

	AddingMachine test = new AddingMachine();
	AddingMachine test2 = new AddingMachine();
	
	@Test
	void testAddingMachine1() {
		test.add(5);
		test.subtract(3);
		test.add(3);
		assertTrue(test.getTotal() == 5);
	}
	
	@Test
	void testAddingMachine2() {
		test.add(6);
		test.subtract(2);
		test.add(9);
		test.subtract(4);
		System.out.println(test.toString());
	}

}
