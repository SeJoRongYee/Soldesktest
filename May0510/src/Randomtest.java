import java.util.Scanner;

public class Randomtest {

	public static void main(String[] args) {
		
		
		/*double a=(Math.random()*10+4); // 0.0<=random<1 사이의 숫자
		System.out.println((int)a);*/
		
		
		
		int n=(int)(Math.random()*9+4);
		//4~12까지 수 중에서 랜덤으로 값을 뽑아냄
		
		switch(n) {
		case 1:
			System.out.println("One");
			break;
		case 5:
			System.out.println("Five");
			break;
		case 6:
			System.out.println("Six");
			break;
		}
		
		System.out.println(n);
		
		

	}

}


