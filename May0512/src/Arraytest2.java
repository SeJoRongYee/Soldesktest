import java.util.Scanner;

public class Arraytest2 {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		/*double ary[]=new double[3];
		//실수형 3개 배열 생성
		for(int i=0;i<=2;i++) {
			ary[i]=s.nextDouble();		//실수를 3번 입력함
			System.out.println(ary[i]);	//입력한 배열의 값을 출력
		}*/
		
		
		
		/*double ary[]=new double[5];
		int sum=0;
		
		for(int i=0;i<5;i++) {
			System.out.println("정수를 입력하세요");
			ary[i]=s.nextDouble();
			sum+=ary[i];
		}
		System.out.println(sum/5.0);*/
		
		//큰 값 출력
		int ary[]=new int[5];
		int max=0;
		
		for(int i=0;i<5;i++) {
			ary[i]=s.nextInt();
			if(ary[i]>max) {
				max=ary[i];
			}
			System.out.println("가장 큰 수는 "+max);
		}
		
		
		
		
		
		
		
 }
}
