package com.bitwiseglobal.gpqa.StringCalcAssign;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class CalculatorTest {
	
	Calculator calc=new Calculator();

	@Test
	public void testifadditionisworking() {
		Assert.assertEquals((Object)4, calc.calculate(2,2,'+'));
	}
	@Test
	public void testifadditionisworkingwithmaxvalues() {
		Assert.assertEquals((Object)Integer.MAX_VALUE, calc.calculate(Integer.MAX_VALUE,Integer.MAX_VALUE,'+'));
	}
	@Test
	public void testifsubtractionisworking() {
		Assert.assertEquals((Object)(-2), calc.calculate(4,6,'-'));
	}
	@Test
	public void testifsubtractionisworkingwithminvalues() {
		Assert.assertEquals((Object)Integer.MIN_VALUE, calc.calculate(Integer.MIN_VALUE,5,'-'));
	}
	@Test
	public void testifdivisionisworking() {
		Assert.assertEquals((Object)2, calc.calculate(12,6,'/'));
	}
	@Test
	public void testifdivisionishandlingzero() {
		Assert.assertEquals((Object)0, calc.calculate(12,0,'/'));
	}
	@Test
	public void testifmultiplicationisworking() {
		Assert.assertEquals((Object)24, calc.calculate(4,6,'*'));
	}

}
