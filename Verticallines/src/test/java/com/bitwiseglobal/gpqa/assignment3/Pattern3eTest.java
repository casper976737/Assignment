package com.bitwiseglobal.gpqa.assignment3;

import org.junit.Test;

public class Pattern3eTest {
	
	@Test
	public void checkpatternisprintedforeven(){
		Pattern3e pattern=new Pattern3e();
		pattern.patternPrinter3e(6);
	}
	
	@Test
	public void checkpatternisprintedforodd(){
		Pattern3e pattern=new Pattern3e();
		pattern.patternPrinter3e(5);
	}
	
	

}
