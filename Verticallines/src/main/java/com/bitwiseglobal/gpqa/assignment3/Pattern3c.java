package com.bitwiseglobal.gpqa.assignment3;

import java.util.Scanner;

public class Pattern3c {

	public void patternPrinter3c(int num){
		int half=(int) Math.round(num/2);
			for(int k=(int) num;k>=half;k--){
				for(int j=0;j<k;j++){
				System.out.print("*");
				}
				System.out.println("");
			}
		for(int i=half+1;i<=num;i++){
			for(int k=0;k<i;k++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}