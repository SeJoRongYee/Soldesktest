import java.util.Scanner;
public class Whiletest1 {

	public static void main(String[] args) {
		
		int i=0;
		/*while(i<=10) {
			System.out.println(i);
			i+=1;
		}*/
		

		/*while(i<=10) {
			if(i%2==0) {
				System.out.println(i);
			}
			i+=1;
		}*/
		
		int sum=0,n=100;
		Scanner s=new Scanner(System.in);
		
		while(n!=0) {
			System.out.println("입력해라");
			n=s.nextInt();
			sum+=n;
		}
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
