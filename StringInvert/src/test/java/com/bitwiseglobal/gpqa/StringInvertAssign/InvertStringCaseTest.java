package com.bitwiseglobal.gpqa.StringInvertAssign;

import static org.junit.Assert.*;

import org.junit.Test;


public class InvertStringCaseTest {
	
	@Test
	public void itshouldcheckiflowercasecharacterisuppercased(){
		InvertStringCase invertor=new InvertStringCase();
		assertEquals("A", invertor.InvertCase("a"));
	}
	@Test
	public void itshouldcheckifuppercasecharacterislowercased(){
		InvertStringCase invertor=new InvertStringCase();
		assertEquals("a", invertor.InvertCase("A"));
	}
	@Test
	public void itshouldcheckifmixedcasestringisproperlyinverted(){
		InvertStringCase invertor=new InvertStringCase();
		assertEquals("aABCdef", invertor.InvertCase("AabcDEF"));
	}

}
