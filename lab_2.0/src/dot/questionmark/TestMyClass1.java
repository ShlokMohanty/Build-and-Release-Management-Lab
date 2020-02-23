package dot.questionmark;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMyClass1 {

	@Test
	void testFindMax() {

		assertEquals(4,MyClass1.findMax(new int[] {1,3,4,2}));
		assertEquals(-1,MyClass1.findMax(new int[] {-12,-1,-3,-4,-2}));
	}

}
