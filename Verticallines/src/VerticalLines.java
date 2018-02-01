import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class VerticalLines {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int width=sc.nextInt();
		int hieght=sc.nextInt();
		int sizetocompare=0;
		int actualsize=width*hieght;
		int nextVal = 0;
		int [][]matrix=new int[width][hieght];
		Random r=new Random();
		List <Integer> list=new ArrayList<>();
		while(sizetocompare<actualsize){
			int timesnum=r.nextInt(9);
			int num=r.nextInt(9);
			if(sizetocompare+timesnum>actualsize){
				timesnum=actualsize-sizetocompare;
			}
			for(int i=0;i<timesnum;i++){
				list.add(num);
			}
			int timesspace=r.nextInt(9);
			if(timesspace==0){
				while(timesspace==0){
					timesspace=r.nextInt(9);
				}
			}
			if(sizetocompare+timesspace>actualsize){
				timesspace=actualsize-sizetocompare;
			}
			for(int i=0;i<timesspace;i++){
				list.add(999);
			}
			sizetocompare+=timesnum+timesspace;
		}
		for(int i=0;i<width;i++){
			for(int j=0;j<hieght;j++){
				Object ob=list.get(nextVal++);
					matrix[i][j]=(int)ob;
				
			}
		}
		for(int i=0;i<hieght;i++){
			for(int j=0;j<width;j++){
				if(matrix[j][i]==999){
					System.out.print(" ");
				}
				else
				System.out.print(matrix[j][i]);
			}
			System.out.println("");
		}

	}

}