import java.util.Scanner;

public class Randomtest2 {

	public static void main(String[] args) {
		//1~100���� ���� �����߻����Ѽ�
		//������ 5�� ����̸� 5�� ������ ���
		//10�� ����̸� 10�� ������ ���
		//�� �ƴϸ� �ƴ϶�� ���
		
		int score=(int)(Math.random()*20+81);
		
		/*if (r%5==0) {
			System.out.println("10�� ���");}
		else if	(r%10==0) {
			System.out.println("5�� ���");}
		else {
			System.out.println("���� �ƴϴ�");
		}
		
		System.out.println(r);*/
		
		String grade; //��������(���ڿ�)
		
		if(score>=90) { 
			if(score>=95) {
				grade="A+";} //95�� �̻��̸� A+
			else {
				grade="B";}// 90�� �̸��ϋ� B
			}
		
		else {
			if(score>=85) 
				grade="B+"; //85<=grade<90 �̸� B+
			else
				grade="B";
		}
		System.out.println(score+" : "+grade);
	
	
	
	}	
		
		

	}


