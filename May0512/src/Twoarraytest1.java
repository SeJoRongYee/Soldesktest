import java.util.Scanner;

public class Twoarraytest1 {

	public static void main(String[] args) {
		
		//int[][];
		//ary=new int[2][5];
		//int ary[][]=new int[2][5]; //2행 5열
		
		
		//문자 5행5열구조
		
		char str[][]=new char[5][5];
		double db[][]=new double[5][2];
		int c[][]= {{1,2,3},	
					{4,5,6}};
		
		
		/* c[0][0]=1
		 * c[0][1]=2
		 * c[0][2]=3
		 * c[1][0]=4
		  */
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(c[i][j]);
			}
		}
		
		

}

}
