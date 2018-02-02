package com.bitwiseglobal.gpqa.assignment3;

import org.junit.Test;

public class Pattern3fTest {
	
	@Test
	public void checkpatternisprintedforeven(){
		Pattern3f pattern=new Pattern3f();
		pattern.patternPrinter3f(6);
	}
	
	@Test
	public void checkpatternisprintedforodd(){
		Pattern3f pattern=new Pattern3f();
		pattern.patternPrinter3f(5);
	}
	
	

}
