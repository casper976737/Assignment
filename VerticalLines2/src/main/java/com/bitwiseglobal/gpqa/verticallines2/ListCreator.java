package com.bitwiseglobal.gpqa.verticallines2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListCreator {

	public List<Integer> getList(Integer height) {
		List<Integer> listtoreturn=new ArrayList<>();
		Random R=new Random();
		Integer currentheight=0;
		Integer numbertoprint;
		Integer numtimes;
		Integer numspace;
		while(listtoreturn.size()<height){
			numbertoprint=R.nextInt(9);
			numtimes=R.nextInt(9);
			numspace=R.nextInt(9);
			while(numtimes>=0){
				if(listtoreturn.size()==height){
					break;
				}
				listtoreturn.add(numbertoprint);
				numtimes--;
			}
			while(numspace>=0){
				if(listtoreturn.size()==height){
					break;
				}
				listtoreturn.add(null);
				numspace--;
				}
		}
		return listtoreturn;
	}

}
