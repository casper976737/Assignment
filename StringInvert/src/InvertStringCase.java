import java.util.Scanner;

public class InvertStringCase {
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
		char [] stringarray=string.toCharArray();
		for(int i=0;i<string.length();i++){
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
		  System.out.println(printstring);

	}
}
