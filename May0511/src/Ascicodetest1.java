import java.util.Scanner;

public class Ascicodetest1 {

	public static void main(String[] args) {
		/*System.out.println("한 문자 입력");
		/*Scanner s=new Scanner(System.in);
		
		char c=s.next().charAt(0);
		int n=(int)c;
		
		for(int i=97;i<=n;i++) {
			for(int j=i;j<n;j++) {
				char ch=(char)j;
				System.out.print(ch);
			}
			System.out.println();
		}

		int a=1;
		int sum=0;
		while(a<=10) {
			sum+=a;
			if(sum>=30) {
				break;	
			}
			a++;
		}
		System.out.println(sum);*/
	
		/*for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				if(i%2!=0) {
					continue;
				}
			else {
				System.out.printf("%d*%d=%d",i,j,i*j);
				System.out.println();
			}
		}
	
	}*/

		int a=0;
		while(a<=9) {
			a++;
			if(a%2==0) {
				continue;
			}
			else {
				System.out.println(a);
			}
		}
		
		
		
		
}
}