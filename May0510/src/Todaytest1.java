import java.util.Scanner;

public class Todaytest1 {

	public static void main(String[] args) {
		
		
		// 5/3 �� ������� �Ҽ��� ���� �ڸ� ���� ����ض�
		System.out.printf("%.2f\n",5/3.0);
		
		
		//Ű�� �ϳ� �Է¹޾� 160���� ������ "small", 170���� ������ "medium", 
		//180���� ������ "large" ���
		System.out.println("Ű�� �Է� �ϼ���");
		Scanner s=new Scanner(System.in);
		int height=s.nextInt();
		
		if(height<=160) { 
			System.out.println("small");}
		else if(height<=170){ 
			System.out.println("medium");}
		
		else  
			System.out.println("large");
		
		
		
		
		//n1�� 50, n2�� 100���� �ʱ�ȭ�Ͽ� �� �� �� ū ���� �Ǻ��Ͽ� ����ض�. (���� ������ Ȱ��)
		System.out.println("????????");
		int n1=50;
		int n2=100;
		int a=n1>n2?n1:n2;
		System.out.println(a);
		
		
		
		
		
		//���̸� �������� ��øif���� ����Ͽ� ����ض�.(����, Ű, ������ ���� ������ ����)
		System.out.println("���̸� �Է��ϼ���");
		int age=s.nextInt();
		System.out.println("Ű�� �Է��ϼ���");
		double h=s.nextDouble();
		char size;
		
		if(age<20) {
			if(h<160) {
				size='S';
			}
			else if(h<170) {
				size='M';}
				else 
					size='L';
			}
		else {
			if(h<165) {
				size='S';
			}
			else if(h<175) {
				size='M';}
				else
					size='L';
			}
		System.out.println(size);
		
		
		
		
		//1���� 50������ ������ ����ض�
		System.out.println("1���� 50������ ����");
		for(int i=1;i<=50;i++){
			System.out.print(i+" ");}
		System.out.println(" ");
		
		//6�� ����� ����ض�
		System.out.println("1~50���� 6�� ���");
		for(int i=1;i<=50;i++) {	
			if(i%6==0) 
				System.out.print(i+" ");}
		
		System.out.println(" ");
		//1~50������ �� ���� ���϶�
		System.out.println("1���� 50������ �� ��");
		int sum=0;
		for(int k=0;k<=50;k++) {
			sum+=k;
		}
			System.out.println(sum);
		
		
			
			
			
		//1~50 ������ random�Լ��� ���� ���� �� �� ������ �� �ϳ�(����)����ض�.	
			System.out.println("1~50 �� ���� ��");
		int  ran=(int)(Math.random()*50+1);
		System.out.println(ran);
		
		
		
		
		
		//c=10, d=20���� �ʱ�ȭ�ϰ�, ������(+,-,*,/)�� �ϳ��� �Է¹޴´�.
		//+�̸� �μ��� ��, -�̸� ��, *�̸� ��, /�̸� ���� ���Ͽ� ����ض�.(switch-case�� ���)
		System.out.println("+,-,*,/�� �ϳ� �Է�");
		int c=10,d=20;
		char f=s.next().charAt(0);
		
		switch(f) {
		case '+':
			System.out.println(d+"+"+c+"="+(d+c));
			break;
		case '-':
			System.out.println(d+"-"+c+"="+(d-c));
			break;
		case '*':
			System.out.println(d+"*"+c+"="+(d*c));
			break;
		case '/':
			System.out.println(d+"/"+c+"="+(d/c));
			break;
		}

	}
}

