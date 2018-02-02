package com.bitwiseglobal.gpqa.assignment3;

import org.junit.Test;

public class Pattern3bTest {
	
	@Test
	public void checkpatternisprintedforeven(){
		Pattern3b pattern=new Pattern3b();
		pattern.patternPrinter3b(6);
	}
	
	@Test
	public void checkpatternisprintedforodd(){
		Pattern3b pattern=new Pattern3b();
		pattern.patternPrinter3b(5);
	}
	
	

}
