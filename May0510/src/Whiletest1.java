import java.util.Scanner;

public class Whiletest1 {
	public static void main(String[] args) {
		//while(조건식){  ()
		//	...작업문...
		//}
		//for(초기;조건;증감)
		/*int i=0; //초기식
		 while(i<10) {	//조건식
			 System.out.println(i);; //반복하고 싶은 실행문
			 i++; //증감식
		 }*/
		
		 
		 //1,3,5,7,9만 출력

		int i=1;
		while(i<10) {
			System.out.print(i+",");
			i+=2;
		}
		System.out.println(" ");
		int n=10;
		while(n>=1) {
			System.out.print(n+",");
			n-=1;
		}
		
		
	}
}
