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
		
		System.out.println("���� �Է�: ");
		int score=s.nextInt();
		
		System.out.println("�г� �Է�: ");
		int year=s.nextInt();
		
		if(score>=60) {
			if(year!=3) {
				System.out.println("�հ�"); //������ 60�� �̻��̸鼭 3�г��� �ƴϸ� �հ�
			}
			else if(score>=70) {
				System.out.println("�հ�"); //3�г��̸� 70�� �̻��̸� �հ�
			}
			else {
				System.out.println("���а�"); //3�г������� 70�� �̸��̸� ���հ�
			}
		
		}
		else {
			System.out.println("���հ�"); //������ 60�� �̸��̸� ���հ�
	
		
		
		
		/*/switch(��){
			case ��:
			���๮;
			break;
	}
		//case�� ������� �ü��ִ�.
		//(����,���ڿ�,����)*/
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
	}
}
