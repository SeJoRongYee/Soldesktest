import java.util.Scanner;

public class Fortest {

	public static void main(String[] args) {
		
		//for(�ʱ��;���ǽ�;������){
			//...�ݺ��ϰ� ���� ���๮...
								//}

		/*for(int i=0;i<10;i++) {		//0���� �����ؼ� 10�� �ݺ��Ѵ� 1�� �����ϸ鼭
			System.out.println(i);
		}
		
		
		for(int i=0;i<10;++i) {
			System.out.println(i);
		}
		
		
		
		for(int i=5;i<=10;++i) {
			System.out.print(i);
		}
		
		for(int i=0;i<=10;i+=2) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int a=0;a<=10;a+=2) {
			if(a%2==0) {
				System.out.print(a+ " ");
			}
		}*/
		
		
		//1���� 100���� �� �߿��� 
		//5�� ������̰� 6�� ����� �� ���
		
		for(int i=1;i<=100;i+=1) {
			if(i%5==0) {
				System.out.println();
				System.out.print("5�� ���"+" : "+i);
				
			}
				else if (i%6==0) {
					System.out.println();
					System.out.print("6�� ���"+" : "+i);
			}	
		   
		    }	
		
		for (int a=1;a<=100;a+=1) {
			if (a%5==0 && a%6==0) {
				System.out.println();
				System.out.println(a);
			}
		}
		
		
		
		
		
		
	}

}
