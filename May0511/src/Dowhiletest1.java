import java.util.Scanner;
public class Dowhiletest1 {

	public static void main(String[] args) {
		// do{..�۾���..
		// ..}while(���ǽ�);
		// ������ �ּ� �ѹ��� �����
		
		/*int i=0;	//�ʱ��
		
		do {
			System.out.println(i);
			i+=1;	//������
		}while(i<10);	//���ǽ�*/
		
		
		/*int i=1;
		int sum=0;
		do {
			sum+=i;
			i+=1;
		}while(i<=20);
		System.out.println(sum);*/
		
		String str;
		Scanner s=new Scanner(System.in);
		
		do {
			System.out.println("���ڿ� �Է�");
			str=s.next();
			
			if(str.equals("exit")) {
				System.out.println("���α׷� ����");
			}
			else {
				System.out.println(str);
			}
		}while(!str.equals("exit"));

	}

}
