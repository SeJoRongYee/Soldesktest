import java.util.Scanner;

public class Arraytest2 {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		/*double ary[]=new double[3];
		//�Ǽ��� 3�� �迭 ����
		for(int i=0;i<=2;i++) {
			ary[i]=s.nextDouble();		//�Ǽ��� 3�� �Է���
			System.out.println(ary[i]);	//�Է��� �迭�� ���� ���
		}*/
		
		
		
		/*double ary[]=new double[5];
		int sum=0;
		
		for(int i=0;i<5;i++) {
			System.out.println("������ �Է��ϼ���");
			ary[i]=s.nextDouble();
			sum+=ary[i];
		}
		System.out.println(sum/5.0);*/
		
		//ū �� ���
		int ary[]=new int[5];
		int max=0;
		
		for(int i=0;i<5;i++) {
			ary[i]=s.nextInt();
			if(ary[i]>max) {
				max=ary[i];
			}
			System.out.println("���� ū ���� "+max);
		}
		
		
		
		
		
		
		
 }
}
