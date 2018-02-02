package com.bitwiseglobal.gpqa.assignment3;

import java.util.Scanner;

public class Pattern3b {
	public void patternPrinter3b(int num){
		for(int i=0;i<num;i++){
			for(int j=0;j<num-i;j++){
				System.out.print(" ");
			}
			for(int k=0;k<i*2+1;k++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
