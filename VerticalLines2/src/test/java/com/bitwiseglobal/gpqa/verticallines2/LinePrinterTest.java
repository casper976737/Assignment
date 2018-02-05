package com.bitwiseglobal.gpqa.verticallines2;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class LinePrinterTest {
	
	@Test
	public void checkifsinglelistisproper(){
		LinePrinter printer=new LinePrinter(12,12);
		printer.printPattern();
	}

}
