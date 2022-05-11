import java.util.Scanner;

public class Todaytest1 {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		/*System.out.println("국어 점수를 입력하세요");
		double kor=s.nextDouble();
		System.out.println("영어 점수를 입력하세요");
		double eng=s.nextDouble();
		
		
		System.out.printf("국어 : %.2f, 영어 : %.2f\n",kor,eng);
		System.out.println("평균 : "+(kor+eng)/2.0);*/
		
		/*int n=100000;
		System.out.println("방문 시간");
		int time=s.nextInt();		
		System.out.println("몇개 사셨나요?");
		int num=s.nextInt();
		
		
		if(time==14 && num<=3) {
				System.out.println(n*num*0.95);
			}
			else if(time==18 && num<=5) {
				System.out.println(n*num*0.9);
			}
			else if(time==20 && num<=10) {
				System.out.println(n*num*0.8);
			}	
	
		else 
			System.out.println(n*num);*/
		
		
		int x,y;
		
		while(true) {
			x=(int)(Math.random()*5+1);
			y=(int)(Math.random()*5+1);
			if(x+y==5) {
				System.out.println("합은 5입니다.");
				break;
			}
			else
				System.out.println(x+"+"+y+"="+(x+y));
			
	}
}
}
