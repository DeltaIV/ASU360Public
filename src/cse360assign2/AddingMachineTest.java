package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddingMachineTest {

	AddingMachine test = new AddingMachine();
	
	@Test
	void testAddingMachine1() {
		test.add(5);
		test.subtract(3);
		test.add(3);
		assertTrue(test.getTotal() == 5);
	}

}
