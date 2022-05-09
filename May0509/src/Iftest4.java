import java.util.Scanner;

public class Iftest4 {

	public static void main(String[] args) {
		/*int age=25,kg=60;
		char size;
		
		if(age<20) {
			if(kg<50)
				size='S';
			else if(kg<60)
				size='M';
			else
				size='L';
		}
		else {		//age>20
			if(kg<60)
				size='S';
			else if(kg<70)
				size='M';
			else
				size='L';
		}
		System.out.println(size);*/
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("점수 입력: ");
		int score=s.nextInt();
		
		System.out.println("학년 입력: ");
		int year=s.nextInt();
		
		if(score>=60) {
			if(year!=3) {
				System.out.println("합격"); //점수가 60점 이상이면서 3학년이 아니면 합격
			}
			else if(score>=70) {
				System.out.println("합격"); //3학년이면 70점 이상이면 합격
			}
			else {
				System.out.println("불학격"); //3학년이지만 70점 미만이면 불합격
			}
		
		}
		else {
			System.out.println("불합격"); //점수가 60점 미만이면 불합격
	
		
		
		
		/*/switch(식){
			case 값:
			실행문;
			break;
	}
		//case에 상수값만 올수있다.
		//(문자,문자열,정수)*/
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
	}
}
