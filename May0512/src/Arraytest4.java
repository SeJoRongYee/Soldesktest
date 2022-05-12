import java.util.Scanner;

public class Arraytest4 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		/*int ary[]=new int[7];
		int floor=ary.length;
		int sum=0;
		
		for(int i=0;i<floor;i++) {
			System.out.println("인원을 입력해주세요");
			ary[i]=s.nextInt();
			sum+=ary[i];
		}
		System.out.println((double)sum/floor);*/
		
		/*int ary[]=new int[10];
		// 1 2 3 5 8 13 21 34 55 89 
		
		ary[0]=1;
		ary[1]=2;
		
		for(int i=0;i<8;i++) {
			ary[i+2]=ary[i]+ary[i+1];
		}
		for(int i=0;i<10;i++) {
			System.out.print(ary[i]+" ");
		}*/
		
		
		 int sum=0;  //총합변수 
		 int multi=1; //총곱변수
		 int ary[]=new int[4];	
		 int size=ary.length;
		 
		 for(int i=0;i<size;i++) {
			 System.out.println("정수를 입력하세요");
			 ary[i]=s.nextInt();
			 sum+=ary[i];
		 }
		 	System.out.println(sum);
		 	System.out.println("다음을 넘어가겠습니다");
		 	
		 	for(int i=0;i<size;i++) {
			 System.out.println("정수를 입력하세요");
				ary[i]=s.nextInt();
				multi*=ary[i];
			}
			 System.out.println(multi);
		

}

}
