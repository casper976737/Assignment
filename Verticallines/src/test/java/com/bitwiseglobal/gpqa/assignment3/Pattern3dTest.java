package com.bitwiseglobal.gpqa.assignment3;

import org.junit.Test;

public class Pattern3dTest {
	
	@Test
	public void checkpatternisprintedforeven(){
		Pattern3d pattern=new Pattern3d();
		pattern.patternPrinter3d(6);
	}
	
	@Test
	public void checkpatternisprintedforodd(){
		Pattern3d pattern=new Pattern3d();
		pattern.patternPrinter3d(5);
	}
	
	

}
