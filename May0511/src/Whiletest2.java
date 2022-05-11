import java.util.Scanner;


public class Whiletest2 {

	public static void main(String[] args) {
		
		/*Scanner s=new Scanner(System.in);
		
		while(true) {
			System.out.println("이름 입력");
			String name=s.next();
			//문자열비교는 equals 
			if(name.equals("민훈")) {
				break;	//무한반복문 종료
			}
			System.out.println(name);
		}*/
		
		/*while(true) {
			int n=(int)(Math.random()*6+1);
			
			if(n==6) {
				System.out.println("당첨");
				break;
			}
			else {
				System.out.println("꽝입니다.");
			}
		}*/
		
		/*Scanner s = new Scanner(System.in);
		int n=0;
		
		while(true) {
			if(s.nextInt() == -1) {
				break;
			}
			n++;
		}
		System.out.println(n);
		// -1입력할때까지 계속 더한다*/
		
		int i=1;
		while(i<=99) {
			if(i%2==0 || i%3==0) {
				System.out.print(i+" ");
			}
			i+=1;
		}
		
		

	}

}
