import java.util.Scanner;

public class Randomtest {

	public static void main(String[] args) {
		
		
		/*double a=(Math.random()*10+4); // 0.0<=random<1 ������ ����
		System.out.println((int)a);*/
		
		
		
		int n=(int)(Math.random()*9+4);
		//4~12���� �� �߿��� �������� ���� �̾Ƴ�
		
		switch(n) {
		case 1:
			System.out.println("One");
			break;
		case 5:
			System.out.println("Five");
			break;
		case 6:
			System.out.println("Six");
			break;
		}
		
		System.out.println(n);
		
		

	}

}


