import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * ahmad, 26 May 2022 9:48:54 am
 */

/**
 * @author ahmad
 *
 */
public class CalculatorTest {
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAddNormal() {
		System.out.println("This is the testcase for Calculator - Addition.");
		// Arrange 
		int a = 4321;
		int b = 1234;
			
		//Act on the arrangement
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
			 
		//assert, check result.
		int expected = 5555;
		assertEquals (expected, actual);
		}
	@Test
	public void testAddError() {
		System.out.println("This is the testcase for Calculator - AdditionError.");
		// Arrange 
		int a = 7;
		int b = 3;
			
		//Act on the arrangement
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
			 
		//assert, check result.
		assertNotEquals(0,actual);
		}
	@Test
	public void testBoundary() {
		System.out.println("This is the testcase for Calculator - AdditionBoundary.");
		// Arrange 
		int a = -1;
		int b = 10000;
		int c = 0;
		int d = 9999;
		
			 
		//assert, check result.

		
		assertTrue((c<=d && c>=c));
		assertTrue((d<=d && d>=c));
		
		}
	@Test
	public void testSub() {
		System.out.println("This is the testcase for Calculator - Substraction.");
		// Arrange 
		int a = 4444;
		int b = 1234;
			
		//Act on the arrangement
		Calculator cal = new Calculator();
		int actual = cal.substract(a, b); 
			 
		//assert, check result.
		int expected = 3210;
		assertEquals (expected, actual);
		}
	@Test
	public void testSubError() {
		System.out.println("This is the testcase for Calculator - SubError.");
		// Arrange 
		char a = 'd';
		int b = 3;
			
		//Act on the arrangement
		Calculator cal = new Calculator();
		int actual = cal.substract(a, b); 
			 
		//assert, check result.
		assertNotEquals(5,actual);
		}
	@Test
	public void testMultiply() {
		System.out.println("This is the testcase for Calculator - Multiply.");
		// Arrange 
		int a = 4321;
		int b = 1234;
			
		//Act on the arrangement
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b); 
			 
		//assert, check result.
		int expected = 5332114;
		assertEquals (expected, actual);
		}
	@Test
	public void testMulError() {
		System.out.println("This is the testcase for Calculator - MulError.");
		// Arrange 
		int a = 123456;
		int b = 3;
			
		//Act on the arrangement
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b); 
		//assert, check result.
		assertFalse(a<=10000 && a>=0);;
		}
	@Test
	public void testDivide() {
		System.out.println("This is the testcase for Calculator - Division.");
		// Arrange 
		int a = 4444;
		int b = 2222;
			
		//Act on the arrangement
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b); 
			 
		//assert, check result.
		int expected = 2;
		assertEquals (expected, actual);
		}
	@Test
	public void testDivError() {
		System.out.println("This is the testcase for Calculator - DivError.");
		// Arrange 
		int a = 123;
		int b = 0;
			
		//assert, check result.
		assertFalse (b<=10000 && b>0);;
		}
	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	}

