package com.chandara.UnitTesting.Caculator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import com.chandara.UnitTesting.math.Calculator;
public class CalculatorTest {
	
	@Test
	public void addTest() {
		Calculator calculator = new Calculator(); // one way
		int result = calculator.add(2, 4);
		Assert.assertEquals(6,result);
	}
	
	@Test
	public void addTest1() {
		Calculator calculator = new Calculator();
		int expectedResult = 7;
		int result = calculator.add(4, 3); // two way
		Assert.assertEquals("check if sum of two number is equal expectResult",result,expectedResult);
	}
	
	@Test
	public void subtractTest() {
		Calculator calculator = new Calculator();
		int result = calculator.subtract(6, 4);
		Assert.assertEquals(2, result);
	}
	
	@Test
	public void devideIest() {
		Calculator calculator = new Calculator();
		int result = calculator.devide(10, 3);
		Assert.assertEquals(30, result);
	}

}
