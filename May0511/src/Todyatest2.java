import java.util.Scanner;

public class Todyatest2 {

	public static void main(String[] args) {
		//3��
		/*for(int i=5;i<=9;i++) {
			System.out.println("********"+i+"��"+"*******");
			for(int j=1;j<=9;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
	
		
		
		int k=0;
		int sum=0;
		
		while(k<=100) {
			if(k%5==0) {
				sum+=k;
				
			}
			k+=1;
			
		}System.out.println(sum);*/
		
		
		Scanner s=new Scanner(System.in);
		
		int ans=18;
		int count=0;
		
		while(true) {
			System.out.println("���� �Է�: ");
			int n=s.nextInt();
			count++;
			
			if(n>ans) {
				System.out.println(n+"���� �۴�");
			}
			else if(n<ans) {
				System.out.println(n+"���� ũ��");
			}
			else if(n==ans) {
				System.out.println("����");
				break;
			}
			
		}
			System.out.println("�õ��� Ƚ���� "+count+"ȸ �̴�");
	
	
	
			
	
	
	
	
	}
}
