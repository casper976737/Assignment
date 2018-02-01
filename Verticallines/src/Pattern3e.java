import java.util.Scanner;

public class Pattern3e {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double num=sc.nextInt();
		int half=(int)Math.round(num/2);
		for(int i=half-1;i>=0;i--){
			for(int j=i-1;j>=0;j--){
				System.out.print(" ");
			}
			if(num%2==0){
				for(int k=(int) ((num-2*i)-1);k>=0;k--){
					System.out.print("*");
					for(int l=0;l<2*i;l++){
						if(k==half-i)
						System.out.print(" ");
						
					}
					System.out.print(" ");
				}
			}
			else{
				for(int k=(int) (num-2*i);k>=0;k--){
					if(k==num){
						k--;
					}
					System.out.print("*");
					for(int l=0;l<2*i-2;l++){
						if(k==half-i)
						System.out.print(" ");		
					}
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

}