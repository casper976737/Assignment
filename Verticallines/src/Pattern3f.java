import java.util.Scanner;

public class Pattern3f {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double num=sc.nextInt();
		int half=(int) Math.round(num/2);
			for(int k=(int) num;k>=half;k--){
				for(int l=0;l<num-k;l++){
					System.out.print(" ");
				}
				for(int j=0;j<k;j++){
				System.out.print("*");
				}
				System.out.println("");
			}
		for(int i=half+1;i<=num;i++){
			for(int l=0;l<num-i;l++){
				System.out.print(" ");
			}
			for(int k=0;k<i;k++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}