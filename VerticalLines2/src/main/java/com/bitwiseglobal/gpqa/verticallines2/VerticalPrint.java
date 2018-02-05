package com.bitwiseglobal.gpqa.verticallines2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class VerticalPrint {
	
	List <Integer> list=new ArrayList<>();
	void intializeList(Integer height){
		List<Integer> templist=new ArrayList<>();
		ListCreator creator=new ListCreator();
		templist=creator.getList(height);
		list.addAll(templist);
	}
	List<Integer> getList(){
		return list;
	}
	Integer getListElement(Integer pos){
		return list.get(pos);
	}
}
