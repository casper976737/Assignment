package com.bitwiseglobal.gpqa.verticallines2;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
public class VerticalPrintTest {
	
	@Test
	public void checkifsinglelistisofpropersize(){
		VerticalPrint print=new VerticalPrint();
		print.intializeList(10);
		List<Integer> list=new ArrayList<>();
		list=print.getList();
		assertEquals(10, list.size());
	}
	@Test
	public void checkifsinglelistisproper(){
		VerticalPrint print=new VerticalPrint();
		print.intializeList(5);
		List<Integer> list=new ArrayList<>();
		list=print.getList();
		for(Integer e: list){
			System.out.println(e);
		}
	}
	

}
