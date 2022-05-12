import java.util.Scanner;

public class Fortest2 {
	public static void main(String[] args) {
	
		//**********누적합 구하기************
		/*int sum=0;
		
		for(int i=0;i<=100;i++) {			// sum=sum+i
			sum+=i;							// 0=0+0
			
		}									// 1=0+1
			System.out.println(sum);*/		// 3=1+2
		
	
	
		/*int sum=0;
		
		for (int i=0;i<=100;i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
			System.out.println(sum);*/
			
			
		
			
		/*for(int i=1;i<=15;i++) {
			System.out.print("*");
			if (i%5==0) {
				System.out.println();
			}
		
		}*/
		
	
		/*Scanner s=new Scanner(System.in);
		System.out.println("몇단?");
		
		int dan=s.nextInt();
		
		for(int i=1;i<=9;i++) {
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
		}*/
		
		
		int sum=0;
		
		for (int i=0;true;i++) {
			sum+=i;
			if(i<6000 && i>5000) {
				System.out.println(i);
				System.out.println("작동을 멈추겠습니다");
				break;
			}
		}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
			
	
	
}
	
	
	

