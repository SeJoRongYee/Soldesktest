import java.util.Scanner;

public class Remindtest1 {

	public static void main(String[] args) {
		
		
		/*int sum=0;
		for(int i=0;i<=100;i++) {
			if(i%2==0) {
				continue;	//¦���̸� ���� �۾��� �ٽ� ����
			}
			else 
				sum+=i; //1~100���� if���� �������� ���� ���� ����
		}
		System.out.println(sum); */
		
		
		Scanner s=new Scanner(System.in);
		/*int num=0;
		double sum=0;
		int i=0;
		
		while((i=s.nextInt())!=0) {	//i�� ���� 0�� �Էµɶ����� �Ʒ� �۾��� �ݺ�
			sum+=i;
			num++;		//���� �Է��� ������ ����
		}
		System.out.println(num+" "+sum/num);*/	//���� �ݺ� �۾��� �������� ������ ���� ���
		
		/*int i=1;
		do {
			System.out.println(i);
			i+=1;
		}while(i<=20);
		
		
		char a='a';
		do {
			System.out.print(a);
			a=(char)(a+1); // a~z���� �Ʒ� ������ ���� ���� ���
		}while(a<='z');*/
		
		int n=0;
		
		while(true) {
			System.out.println("���� �Է�");
			n=s.nextInt();
			if(n==10) {
				System.out.println("������");
				break;
			}
			else
				System.out.println(n);
		}
		

}

}
