package com.bitwiseglobal.gpqa.assignment3;

import org.junit.Test;

public class Pattern3cTest {
	
	@Test
	public void checkpatternisprintedforeven(){
		Pattern3c pattern=new Pattern3c();
		pattern.patternPrinter3c(6);
	}
	
	@Test
	public void checkpatternisprintedforodd(){
		Pattern3c pattern=new Pattern3c();
		pattern.patternPrinter3c(5);
	}
	
	

}
