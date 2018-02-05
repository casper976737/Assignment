package com.bitwiseglobal.gpqa.assignment3;

import java.util.Scanner;

public class Pattern3d {
	public void patternPrinter3d(double num){
		int half=(int)Math.round(num/2);
		for(int i=0;i<half;i++){
			for(int j=0;j<i;j++){
				System.out.print(" ");
			}
			if(num%2==0){
				for(int k=0;k<num-2*i;k++){
					System.out.print("*");
					for(int l=0;l<2*i;l++){
						if(k+1==half-i)
						System.out.print(" ");
					}
					if(k==num-2*i-1){
						break;
					}
					System.out.print(" ");
				}
			}
			else{
				for(int k=0;k<(num-2*i)+1;k++){
					if(k==num){
						break;
					}
					System.out.print("*");
					for(int l=0;l<2*i-2;l++){
						if(k+1==half-i)
						System.out.print(" ");
					}
					if(k==num-2*i||k==num-1){
						break;
					}
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

}