package com.bitwiseglobal.gpqa.StringCalcAssign;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	
	Calculator calc=new Calculator();

	@Test
	public void testifadditionisworking() {
		assertEquals(4, calc.calculate(2,2));
	}
	@Test
	public void testifsubtractionisworking() {
		assertEquals(-2, calc.calculate(4,6));
	}

}
