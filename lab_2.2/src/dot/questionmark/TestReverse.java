package dot.questionmark;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestReverse {

	@Test
	void testReverse() {

		Reverse obj1 = new Reverse();
		assertEquals(123,obj1.reversing_a_number(321));
		assertEquals(127893,obj1.reversing_a_number(398721));
	}

}
