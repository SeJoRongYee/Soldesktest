import java.util.Scanner;

public class Stest2 {

	public static void main(String[] args) {
		
		/*String name="���";
		int age=27;
		double ki=175.5;
		char blood='o';
		
		System.out.printf("%s %d %.1f %c\n",name,age,ki,blood);
		//����� ���̴� 27���̴�
		System.out.println(name+"�� ���̴� "+age+"���̴�");
		//����� �������� o��
		System.out.println(name+"�� �������� "+blood+"��");
		
		System.out.println((int)(6+2.5));
		System.out.println((int)(8.5+0.5));*/
		
		
		/*char ch='A';
		System.out.printf("%c\n",ch);
		System.out.printf("%d",ch-65);*/
		
		//10/4 �� ������� �Ҽ������� ����ض�
		
		int a=10,b=4;
		System.out.printf("%.2f\n",(double)a/b);
		
		//�ϳ��� ������ �Է¹޾� �� ���� ������ ���ض�
		Scanner s=new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int i=s.nextInt();
		System.out.println(i+"�� ������ :"+i*i);
	
		
		//a�� 4.0, b�� 1.2�� �ʱ�ȭ�Ͽ� 4.0+1.2�� printf�� ����ض�
		double c=4.0,d=1.2;
		double t=c+d;
		System.out.printf("%.2f\n",t);
		System.out.println((int)t);
		
		//ScannerŬ������ �̿��Ͽ� �̸�, ��� ��, ����, ü���� �Է¹ް�, ����ϴ� ���α׷� �ۼ��ض�.
		System.out.println("�̸�, ��� ��, ����, ü���� �Է��ϼ���");
		
		String name=s.next();
		String ad=s.next();
		int age=s.nextInt();
		float weghit=s.nextFloat();
		
		System.out.println("�� �̸���"+name+"�̴�");
		System.out.println("��� ���� "+ad+"�̰�, ���̴� "+age+"���̴�");
		System.out.println("�����Դ�"+weghit+"KG �̴�");
		
		
		
		
		
		
		
	}

}
