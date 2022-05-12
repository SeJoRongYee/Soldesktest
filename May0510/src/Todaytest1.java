import java.util.Scanner;

public class Todaytest1 {

	public static void main(String[] args) {
		
		
		// 5/3 한 결과값을 소수점 둘재 자리 까지 출력해라
		System.out.printf("%.2f\n",5/3.0);
		
		
		//키를 하나 입력받아 160보다 작으면 "small", 170보다 작으면 "medium", 
		//180보다 작으면 "large" 출력
		System.out.println("키를 입력 하세요");
		Scanner s=new Scanner(System.in);
		int height=s.nextInt();
		
		if(height<=160) { 
			System.out.println("small");}
		else if(height<=170){ 
			System.out.println("medium");}
		
		else  
			System.out.println("large");
		
		
		
		
		//n1을 50, n2를 100으로 초기화하여 두 수 중 큰 수를 판별하여 출력해라. (삼항 연산자 활용)
		System.out.println("????????");
		int n1=50;
		int n2=100;
		int a=n1>n2?n1:n2;
		System.out.println(a);
		
		
		
		
		
		//나이를 기준으로 중첩if문을 사용하여 출력해라.(나이, 키, 사이즈 각각 변수를 선언)
		System.out.println("나이를 입력하세요");
		int age=s.nextInt();
		System.out.println("키를 입력하세요");
		double h=s.nextDouble();
		char size;
		
		if(age<20) {
			if(h<160) {
				size='S';
			}
			else if(h<170) {
				size='M';}
				else 
					size='L';
			}
		else {
			if(h<165) {
				size='S';
			}
			else if(h<175) {
				size='M';}
				else
					size='L';
			}
		System.out.println(size);
		
		
		
		
		//1부터 50까지의 정수를 출력해라
		System.out.println("1부터 50까지의 정수");
		for(int i=1;i<=50;i++){
			System.out.print(i+" ");}
		System.out.println(" ");
		
		//6의 배수를 출력해라
		System.out.println("1~50까지 6의 배수");
		for(int i=1;i<=50;i++) {	
			if(i%6==0) 
				System.out.print(i+" ");}
		
		System.out.println(" ");
		//1~50까지의 총 합을 구하라
		System.out.println("1부터 50까찌의 총 합");
		int sum=0;
		for(int k=0;k<=50;k++) {
			sum+=k;
		}
			System.out.println(sum);
		
		
			
			
			
		//1~50 정수를 random함수로 범위 설정 한 후 무작위 수 하나(난수)출력해라.	
			System.out.println("1~50 중 랜덤 수");
		int  ran=(int)(Math.random()*50+1);
		System.out.println(ran);
		
		
		
		
		
		//c=10, d=20으로 초기화하고, 연산자(+,-,*,/)중 하나를 입력받는다.
		//+이면 두수의 합, -이면 차, *이면 곱, /이면 몫을 구하여 출력해라.(switch-case문 사용)
		System.out.println("+,-,*,/중 하나 입력");
		int c=10,d=20;
		char f=s.next().charAt(0);
		
		switch(f) {
		case '+':
			System.out.println(d+"+"+c+"="+(d+c));
			break;
		case '-':
			System.out.println(d+"-"+c+"="+(d-c));
			break;
		case '*':
			System.out.println(d+"*"+c+"="+(d*c));
			break;
		case '/':
			System.out.println(d+"/"+c+"="+(d/c));
			break;
		}

	}
}

