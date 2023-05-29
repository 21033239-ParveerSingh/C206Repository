import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		int a = 4321;
		int b = 1234;

		Calculator cal = new Calculator();
		int actual = cal.add(a, b);

		int expected = 5555;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSubtract() {
		int a = 4321;
		int b = 1234;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected1 = 3087;
		//int expected2 = -3087;
		
		assertEquals(expected1, actual);
		//assertEquals(expected2, actual);
	}
	
	@Test
	public void testMultiply() {
		int a = 4321;
		int b = 1234;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		
		int expected = 5332114;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testDivide() {
		int a = 4321;
		int b = 1234;
		
		Calculator cal = new Calculator();
		double actual = cal.divide(a, b);
		
		double expected = 3.50162074554;
		
		double delta = 0.0001;
		
		assertEquals(expected, actual, delta);
	}
}
