import java.util.Scanner;
public class Dowhiletest1 {

	public static void main(String[] args) {
		// do{..작업문..
		// ..}while(조건식);
		// 무조건 최소 한번은 실행됨
		
		/*int i=0;	//초기식
		
		do {
			System.out.println(i);
			i+=1;	//증감식
		}while(i<10);	//조건식*/
		
		
		/*int i=1;
		int sum=0;
		do {
			sum+=i;
			i+=1;
		}while(i<=20);
		System.out.println(sum);*/
		
		String str;
		Scanner s=new Scanner(System.in);
		
		do {
			System.out.println("문자열 입력");
			str=s.next();
			
			if(str.equals("exit")) {
				System.out.println("프로그램 종료");
			}
			else {
				System.out.println(str);
			}
		}while(!str.equals("exit"));

	}

}
