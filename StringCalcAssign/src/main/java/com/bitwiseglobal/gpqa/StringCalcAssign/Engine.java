package com.bitwiseglobal.gpqa.StringCalcAssign;

abstract class Engine {
	
	Integer num1,num2;
	public Engine(Integer a,Integer b){
		this.num1=a;
		this.num2=b;
	}
	public Object AddEngine(){
		
		return(num1+num2);
		
	}
	public Object SubtractEngine(){
		
		return(num1-num2);
		
	}

}
