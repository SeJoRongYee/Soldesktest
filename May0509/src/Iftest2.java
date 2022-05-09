import java.util.Scanner;


public class Iftest2 {

	public static void main(String[] args) {
		
		/*int a=10,b=4;
		
		if(a!=10) {
			System.out.println("A");
		}
		else if (a<b) {
			System.out.println("B");
		}
		else {
			System.out.println("C");
		}*/
		
		/*Scanner s=new Scanner(System.in);
		char grade; //한글자 변수
		
		System.out.println("점수 입력");
		int score=s.nextInt();
		
		if(score>=90) {
			grade='A';
		}
		else if(score>=80)
			grade='b';
		else if(score>=70)
			grade='c';
		else
			grade='f';
		System.out.println("학점 : "+grade);*/
		
		
		/*i= a>b? a-b: b-a;
		if(a>b) {
			i=a-b;
		}
		else
			i=b-a;*/
		
		int s=85;
		char grade=s>90? 'A':'B';
		System.out.println(grade);
		
		
		
		

	}

}
