import java.util.Scanner;

public class Sumtest1 {

	public static void main(String[] args) {
		
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum+=1;
			System.out.print(i);
			
			if(i==10) {
				System.out.print("=");
				System.out.print(sum);
			}
		else
			System.out.print("+");
		}
		
		

	}

}
