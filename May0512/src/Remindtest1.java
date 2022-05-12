import java.util.Scanner;

public class Remindtest1 {

	public static void main(String[] args) {
		
		
		/*int sum=0;
		for(int i=0;i<=100;i++) {
			if(i%2==0) {
				continue;	//짝수이면 위의 작업을 다시 실행
			}
			else 
				sum+=i; //1~100까지 if문을 만족하지 못한 값을 더함
		}
		System.out.println(sum); */
		
		
		Scanner s=new Scanner(System.in);
		/*int num=0;
		double sum=0;
		int i=0;
		
		while((i=s.nextInt())!=0) {	//i의 값이 0이 입력될때까지 아래 작업을 반복
			sum+=i;
			num++;		//내가 입력한 정수의 개수
		}
		System.out.println(num+" "+sum/num);*/	//위의 반복 작업이 끝났을때 쓰여진 문장 출력
		
		/*int i=1;
		do {
			System.out.println(i);
			i+=1;
		}while(i<=20);
		
		
		char a='a';
		do {
			System.out.print(a);
			a=(char)(a+1); // a~z까지 아래 정해진 조건 까지 출력
		}while(a<='z');*/
		
		int n=0;
		
		while(true) {
			System.out.println("정수 입력");
			n=s.nextInt();
			if(n==10) {
				System.out.println("ㅅㄱㅇ");
				break;
			}
			else
				System.out.println(n);
		}
		

}

}
