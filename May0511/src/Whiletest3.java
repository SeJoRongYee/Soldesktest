import java.util.Scanner;

public class Whiletest3 {
	public static void main(String[] args) {
		
		//continue : 반복문을 빠져나가지 않는다.
		
		/*for(int i=0;i<=100;i++) {
			if(i%2==0) {
				continue;	//짝수일때 반복문 계속 실행
			}
			else {
				System.out.println(i);
			}
		}*/
		
		Scanner s=new Scanner(System.in);
		System.out.println("정수 5개 입력");
		
		for(int i=0;i<5;i++) {	//횟수
			int n=s.nextInt();	//5번 입력가능
			if(n<0) {
				continue;	//제외(올라가서 반복문 다시실행)
			}
			else {
				System.out.println(n);
			}
		}
		
		
		
		
	}
}
