package com.bitwiseglobal.gpqa.StringCalcAssign;

import java.util.Scanner;

public class Calculator
{

    public static void main( String[] args ){
    	Scanner sc= new Scanner(System.in);
    	Integer num1=sc.nextInt();
    	Integer num2=sc.nextInt();
    	char operator=sc.next().charAt(0);
    	System.out.println(calculate(num1,num2,operator));	
    }

	public static Integer calculate(Integer i, Integer j, char operator) {
		Engine engine=new EngineHandler();
		Integer result = 0;
		switch(operator){
		
		case '+' : result=engine.addEngine(i,j);
					break;
		case '-' : result=engine.subtractEngine(i,j);
					break;
		case '/' : return(engine.divEngine(i,j));
					
		case '*' : result=engine.multEngine(i,j);
					break;
			
		}
		return result;
	}
	
	

}

class EngineHandler extends Engine{

	public Integer addEngine(Integer num1,Integer num2) {
		if(num1==Integer.MAX_VALUE || num2==Integer.MAX_VALUE)
		return (Integer.MAX_VALUE);
		else
			return(num1+num2);
	}

	public Integer subtractEngine(Integer num1,Integer num2) {
		if(num1==Integer.MIN_VALUE||num2==Integer.MIN_VALUE){
			return Integer.MIN_VALUE;
		}
		else
			return(num1-num2);
	}

	public Integer divEngine(Integer num1,Integer num2) {
		if(num2==0)
			return (0);
			else
				return (num1/num2);
	}

	public Integer multEngine(Integer num1,Integer num2) {
		if(num1==Integer.MAX_VALUE || num2==Integer.MAX_VALUE)
			return (Integer.MAX_VALUE);
			else
				return(num1*num2);
	}
	
}
