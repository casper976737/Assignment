import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class VerticalLines {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int X=sc.nextInt();
		int Y=sc.nextInt();
		int size=0;
		int actualSize=Y*X;
		boolean isfirst=true;
		int next=0;
		int mat[][]=new int[X][Y];
		List <Integer> list=new ArrayList<Integer>();
		while(size<actualSize){
			int times=(int)(Math.random()*10);
			int num=(int)(Math.random()*10);
			if(size+times>actualSize){
				times=actualSize-size;
			}
			for(int i=0;i<times;i++){
				list.add(num);
			}
			int times2=(int)(Math.random()*10);
			if(times2==0){
				while(times2==0){
					times2=(int)(Math.random()*10);
				}
			}
			if(size+times2>actualSize){
				times2=actualSize-size;
			}
			for(int i=0;i<times2;i++){
				list.add(999);
			}
			size+=times+times2;
		}
		for(int i=0;i<X;i++){
			for(int j=0;j<Y;j++){
				Object ob=list.get(next++);
					mat[i][j]=(int)ob;
				
			}
		}
		for(int i=0;i<Y;i++){
			for(int j=0;j<X;j++){
				if(mat[j][i]==999){
					System.out.print(" ");
				}
				else
				System.out.print(mat[j][i]);
			}
			System.out.println("");
		}

	}

}