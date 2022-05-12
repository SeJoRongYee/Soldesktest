import java.util.Scanner;

public class Fortest {

	public static void main(String[] args) {
		
		//for(초기식;조건식;증감식){
			//...반복하고 싶은 실행문...
								//}

		/*for(int i=0;i<10;i++) {		//0부터 시작해서 10번 반복한다 1씩 증가하면서
			System.out.println(i);
		}
		
		
		for(int i=0;i<10;++i) {
			System.out.println(i);
		}
		
		
		
		for(int i=5;i<=10;++i) {
			System.out.print(i);
		}
		
		for(int i=0;i<=10;i+=2) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int a=0;a<=10;a+=2) {
			if(a%2==0) {
				System.out.print(a+ " ");
			}
		}*/
		
		
		//1부터 100까지 수 중에서 
		//5의 배ㅐ수이고 6의 배수인 수 출력
		
		for(int i=1;i<=100;i+=1) {
			if(i%5==0) {
				System.out.println();
				System.out.print("5의 배수"+" : "+i);
				
			}
				else if (i%6==0) {
					System.out.println();
					System.out.print("6의 배수"+" : "+i);
			}	
		   
		    }	
		
		for (int a=1;a<=100;a+=1) {
			if (a%5==0 && a%6==0) {
				System.out.println();
				System.out.println(a);
			}
		}
		
		
		
		
		
		
	}

}
