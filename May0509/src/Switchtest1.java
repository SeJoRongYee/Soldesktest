import java.util.Scanner;

public class Switchtest1 {

	public static void main(String[] args) {
		/*char grade='C';
		
		switch(grade) {
		case 'A':
		case 'B':
			System.out.println("good");
			break; //Ż��
		case 'C':
			System.out.println("Not bad");
			break;
		case 'F':
			System.out.println("Bad");
			break;
			}*/
		
		
		Scanner s=new Scanner(System.in);
		
		/*System.out.println("���� ��������?");
		
		String day=s.next();
		
		switch(day) {
		case "��":	
			System.out.println("��");
			break;
		case "ȭ":	
			System.out.println("ȭ");
			break;
		default :	
			System.out.println("��,ȭ �ƴ�");
			break;
		
		
		}
		System.out.println("������ �Է��ض�");
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
		
		/*System.out.println("m,s,b�� �ϳ��� �Է��ϼ���");
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
		
		System.out.println("���̸� �Է��ϼ���");
		int age=s.nextInt();
		
		switch(age%20) {
		case 1:
			System.out.println("���̰� Ȧ���Դϴ�");
			break;
		case 0:
			System.out.println("���̰� ¦���Դϴ�");
			break;
		
		}
		
		
		
		
		
		
		
		}
		
		
		
		
	}


