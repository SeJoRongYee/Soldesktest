import java.util.Scanner;


public class Whiletest2 {

	public static void main(String[] args) {
		
		/*Scanner s=new Scanner(System.in);
		
		while(true) {
			System.out.println("�̸� �Է�");
			String name=s.next();
			//���ڿ��񱳴� equals 
			if(name.equals("����")) {
				break;	//���ѹݺ��� ����
			}
			System.out.println(name);
		}*/
		
		/*while(true) {
			int n=(int)(Math.random()*6+1);
			
			if(n==6) {
				System.out.println("��÷");
				break;
			}
			else {
				System.out.println("���Դϴ�.");
			}
		}*/
		
		/*Scanner s = new Scanner(System.in);
		int n=0;
		
		while(true) {
			if(s.nextInt() == -1) {
				break;
			}
			n++;
		}
		System.out.println(n);
		// -1�Է��Ҷ����� ��� ���Ѵ�*/
		
		int i=1;
		while(i<=99) {
			if(i%2==0 || i%3==0) {
				System.out.print(i+" ");
			}
			i+=1;
		}
		
		

	}

}
