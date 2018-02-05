package com.bitwiseglobal.gpqa.verticallines2;

public class LinePrinter {
	
	Integer length;
	Integer height;
	LinePrinter(Integer length, Integer height){
		this.length=length;
		this.height=height;
	}
	void printPattern(){
		VerticalPrint[] printObject=new VerticalPrint[length];
		for(Integer i=0;i<length;i++){
			printObject[i]=new VerticalPrint();
			printObject[i].intializeList(height);
		}
		for(Integer i=0;i<height;i++){
			for(Integer j=0;j<length;j++){
				if(printObject[j].getListElement(i)==null){
					System.out.print(" ");
				}
				else
				System.out.print(printObject[j].getListElement(i));
			}
			System.out.println("");
		}
	}

}
