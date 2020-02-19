import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleCalculatorTest {

	@Test
	void testAddition() {
		SimpleCalculator test= new SimpleCalculator();
		assertEquals(2,test.add(1,1));
		assertEquals(-1,test.add(-2,1));
		assertEquals(0,test.add(1,-1));
		assertEquals(4,test.add(0,4));
		assertEquals(-4,test.add(-3,-1));
	}
	
	@Test
	void testDivision() {
		SimpleCalculator test1= new SimpleCalculator();
		assertEquals(2,test1.divide(4,2));
		assertEquals(-0.5,test1.divide(1,-2));
		assertEquals(-3,test1.divide(-6,2));
		assertEquals(1,test1.divide(-2,-2));
		assertEquals(-5,test1.divide(5,-1));
		assertEquals(5,test1.divide(5,1));
		assertEquals(-2,test1.divide(-2,1));
		assertEquals(2.5,test1.divide(5,2));
		assertEquals(0,test1.divide(0,1));
		assertEquals(0,test1.divide(0,-1));
		RuntimeException exception1 = assertThrows(RuntimeException.class, () ->test1.divide(3, 0));
		assertEquals("division by zero not allowed",exception1.getMessage());
	}
}
