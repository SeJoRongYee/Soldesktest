import java.util.Scanner;

public class Stest2 {

	public static void main(String[] args) {
		
		/*String name="상용";
		int age=27;
		double ki=175.5;
		char blood='o';
		
		System.out.printf("%s %d %.1f %c\n",name,age,ki,blood);
		//상용의 나이는 27살이다
		System.out.println(name+"의 나이는 "+age+"살이다");
		//상용의 혈액형은 o형
		System.out.println(name+"의 혈액형은 "+blood+"형");
		
		System.out.println((int)(6+2.5));
		System.out.println((int)(8.5+0.5));*/
		
		
		/*char ch='A';
		System.out.printf("%c\n",ch);
		System.out.printf("%d",ch-65);*/
		
		//10/4 한 결과값을 소수점까지 출력해라
		
		int a=10,b=4;
		System.out.printf("%.2f\n",(double)a/b);
		
		//하나의 정수를 입력받아 그 수의 제곱을 구해라
		Scanner s=new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int i=s.nextInt();
		System.out.println(i+"의 제곱은 :"+i*i);
	
		
		//a를 4.0, b를 1.2로 초기화하여 4.0+1.2를 printf로 출력해라
		double c=4.0,d=1.2;
		double t=c+d;
		System.out.printf("%.2f\n",t);
		System.out.println((int)t);
		
		//Scanner클래스를 이용하여 이름, 사는 곳, 나이, 체중을 입력받고, 출력하는 프로그램 작성해라.
		System.out.println("이름, 사는 곳, 나이, 체중을 입력하세요");
		
		String name=s.next();
		String ad=s.next();
		int age=s.nextInt();
		float weghit=s.nextFloat();
		
		System.out.println("내 이름은"+name+"이다");
		System.out.println("사는 곳은 "+ad+"이고, 나이는 "+age+"살이다");
		System.out.println("몸무게는"+weghit+"KG 이다");
		
		
		
		
		
		
		
	}

}
