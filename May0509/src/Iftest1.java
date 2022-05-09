import java.util.Scanner;


public class Iftest1 {

	public static void main(String[] args) {
		
		//if(조건식) {
			//...실행문장1..
		//}
		//else{..실행문장2..
		//}
		
		//조건식이 true면 실행문장1 실행 후 if - else 에서 벗어남
		//false면 실행문장2를 실행 후 if - else 에서 벗어남
		
		
		
		
		Scanner s=new Scanner(System.in);
		
		/*System.out.println("정수를 입력해주세요");
		
		int score=s.nextInt();
		
		if (score>=80) {
			System.out.println("합격");
			
			}
		else {
			System.out.println("불합격");
		}*/
		
		/*int a=10,b=4;
		if(a==10) {
			System.out.println("A");
		}
		if(a>b) {
			System.out.println("C");
		}*/
		
		System.out.println("정수를 입력해주세요");
		
		int i=s.nextInt();
		//입력한 수가 9의 배수인지 알아보고싶다.
		
		if(i%9==0) {
			System.out.println("9의 배수이다");
		}
		else {
			System.out.println("9의 배수가 아니다.");
		}
		
		
		
		
		
		
		
		
		
		

	}

}
