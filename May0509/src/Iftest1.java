import java.util.Scanner;


public class Iftest1 {

	public static void main(String[] args) {
		
		//if(���ǽ�) {
			//...���๮��1..
		//}
		//else{..���๮��2..
		//}
		
		//���ǽ��� true�� ���๮��1 ���� �� if - else ���� ���
		//false�� ���๮��2�� ���� �� if - else ���� ���
		
		
		
		
		Scanner s=new Scanner(System.in);
		
		/*System.out.println("������ �Է����ּ���");
		
		int score=s.nextInt();
		
		if (score>=80) {
			System.out.println("�հ�");
			
			}
		else {
			System.out.println("���հ�");
		}*/
		
		/*int a=10,b=4;
		if(a==10) {
			System.out.println("A");
		}
		if(a>b) {
			System.out.println("C");
		}*/
		
		System.out.println("������ �Է����ּ���");
		
		int i=s.nextInt();
		//�Է��� ���� 9�� ������� �˾ƺ���ʹ�.
		
		if(i%9==0) {
			System.out.println("9�� ����̴�");
		}
		else {
			System.out.println("9�� ����� �ƴϴ�.");
		}
		
		
		
		
		
		
		
		
		
		

	}

}
