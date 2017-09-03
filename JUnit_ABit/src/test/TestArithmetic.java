package test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import calculator.Arithmetic;

public class TestArithmetic {
	
	private static Arithmetic ar;
	
	/* 
	 * @Before - perform before each @Test;
	 * @BeforeClass - perform once before all @Test;
	 * @After - perform after each @Test;
	 * @AfterClass - perform once after all @Test;
	 * */
	
	@BeforeClass
	public static void runT(){
		ar = new Arithmetic();
	}
	
	@Test
	public void testAdd(){
		double result = ar.add(9, 3);
		Assert.assertTrue(result == 12);
	}
	
	@Ignore  //The method marked with annotation @Ignore will not be tested.
	@Test
	public void testDeduction(){
		double result = ar.deduction(9, 3);
		Assert.assertFalse(result != 6);
	}
	
	@Test
	public void testMultiply(){
		double result = ar.multiply(9, 3);
		Assert.assertEquals(27, result, 0);
	}
	
	@Test
	public void testDivision(){
		double result = ar.division(9, 3);
		if(result != 3) Assert.fail();
	}
	
	@Test
	public void testObject(){
		Assert.assertNotNull(ar);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDivException(){
		ar.division(9, 0);
	}
	
	@Test(timeout = 1000)
	public void testTime(){
		System.out.println("Hello");
	}

}
