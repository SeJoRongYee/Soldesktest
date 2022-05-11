import java.util.Scanner;

public class Todyatest2 {

	public static void main(String[] args) {
		//3번
		/*for(int i=5;i<=9;i++) {
			System.out.println("********"+i+"단"+"*******");
			for(int j=1;j<=9;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
	
		
		
		int k=0;
		int sum=0;
		
		while(k<=100) {
			if(k%5==0) {
				sum+=k;
				
			}
			k+=1;
			
		}System.out.println(sum);*/
		
		
		Scanner s=new Scanner(System.in);
		
		int ans=18;
		int count=0;
		
		while(true) {
			System.out.println("숫자 입력: ");
			int n=s.nextInt();
			count++;
			
			if(n>ans) {
				System.out.println(n+"보다 작다");
			}
			else if(n<ans) {
				System.out.println(n+"보다 크다");
			}
			else if(n==ans) {
				System.out.println("정답");
				break;
			}
			
		}
			System.out.println("시도한 횟수는 "+count+"회 이다");
	
	
	
			
	
	
	
	
	}
}
