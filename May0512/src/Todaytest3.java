import java.util.Scanner;

public class Todaytest3 {

	public static void main(String[] args) {
		//1~100 까지 정수의 합 5의 배수이고 10의 배수(while do while for)
		

		int sum=0;
		for(int i=0;i<=100;i++) {
			if(i%5==0 && i%10==0) {
				sum+=i;
			}
		}System.out.println(sum);
		
		
		
		int a=1;
		int sum1=0;
		while(a<=100) {
			if(a%5==0 && a%10==0) {
				sum1+=a;
			}
			a++;
		}
		
		int c=0;
		int sum2=0;
		do {
			c++;
			if(c%5==0 && c%10==0) {
				sum2+=c;
			}
			
		}while(c<=100);
		

	}

}
