import java.util.Scanner;

public class Whiletest3 {
	public static void main(String[] args) {
		
		//continue : �ݺ����� ���������� �ʴ´�.
		
		/*for(int i=0;i<=100;i++) {
			if(i%2==0) {
				continue;	//¦���϶� �ݺ��� ��� ����
			}
			else {
				System.out.println(i);
			}
		}*/
		
		Scanner s=new Scanner(System.in);
		System.out.println("���� 5�� �Է�");
		
		for(int i=0;i<5;i++) {	//Ƚ��
			int n=s.nextInt();	//5�� �Է°���
			if(n<0) {
				continue;	//����(�ö󰡼� �ݺ��� �ٽý���)
			}
			else {
				System.out.println(n);
			}
		}
		
		
		
		
	}
}
