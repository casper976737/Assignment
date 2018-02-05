package com.bitwiseglobal.gpqa.StringInvertAssign;

import java.util.Scanner;

public class InvertStringCase {
	
	public static String InvertCase(String inputstring){
		char [] stringarray=inputstring.toCharArray();
		for(int i=0;i<inputstring.length();i++){
			if(Character.isUpperCase(stringarray[i])){
				stringarray[i]=Character.toLowerCase(stringarray[i]);
			}
			else{
				stringarray[i]=Character.toUpperCase(stringarray[i]);
			}
		}
		StringBuilder bld = new StringBuilder();
		  for (int i = 0; i < stringarray.length; ++i) {
		    bld.append(stringarray[i]);
		  }
		  String printstring = bld.toString();
		  return printstring;

	}
}
