import java.util.Scanner;

public class Switchtest1 {

	public static void main(String[] args) {
		/*char grade='C';
		
		switch(grade) {
		case 'A':
		case 'B':
			System.out.println("good");
			break; //탈출
		case 'C':
			System.out.println("Not bad");
			break;
		case 'F':
			System.out.println("Bad");
			break;
			}*/
		
		
		Scanner s=new Scanner(System.in);
		
		/*System.out.println("무슨 요일이죠?");
		
		String day=s.next();
		
		switch(day) {
		case "월":	
			System.out.println("월");
			break;
		case "화":	
			System.out.println("화");
			break;
		default :	
			System.out.println("월,화 아님");
			break;
		
		
		}
		System.out.println("학점을 입력해라");
		String ch=s.next();
		
		switch(ch) {
		case "A":
		case "B":
			System.out.println("Excellent");
			break;
		case "C":
		case "D":
			System.out.println("Good");
			break;
		case "f":
			System.out.println("Bad");
			break;
		default :
			System.out.println("False");
			break;
		}*/
		
		/*System.out.println("m,s,b중 하나를 입력하세요");
		String c=s.next();
		
		switch(c) {
		case "m" :
			System.out.println("Movie");
			break;
		case "s" :
			System.out.println("Sing");
			break;
		case "b" :
			System.out.println("book");
			break;
		default :
			System.out.println("ETC");
			break;
			}*/
		
		System.out.println("나이를 입력하세요");
		int age=s.nextInt();
		
		switch(age%20) {
		case 1:
			System.out.println("나이가 홀수입니다");
			break;
		case 0:
			System.out.println("나이가 짝수입니다");
			break;
		
		}
		
		
		
		
		
		
		
		}
		
		
		
		
	}


