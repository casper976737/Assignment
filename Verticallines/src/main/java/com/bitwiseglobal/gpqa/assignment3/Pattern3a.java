package com.bitwiseglobal.gpqa.assignment3;

import java.util.Scanner;

public class Pattern3a {
	public void patternPrinter3a(int num){
		for(int i=1;i<=num;i++){
			for(int j=0;j<num-i;j++){
				System.out.print(" ");
			}
			for(int k=0;k<i;k++){
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println("");
		}
	}

}