package com.bitwiseglobal.gpqa.assignment3;

import org.junit.Test;

public class Pattern3aTest {
	
	@Test
	public void checkpatternisprintedforeven(){
		Pattern3a pattern=new Pattern3a();
		pattern.patternPrinter3a(6);
	}
	
	@Test
	public void checkpatternisprintedforodd(){
		Pattern3a pattern=new Pattern3a();
		pattern.patternPrinter3a(7);
	}
	
	

}
