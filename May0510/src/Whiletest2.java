import java.util.Scanner;

public class Whiletest2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		/*System.out.println("정수 입력");
		int n=s.nextInt();
		
		switch(n) {
		case 2:
			System.out.println("2단");
			for(int i=1;i<=9;i++) {
				System.out.printf("%d*%d=%d\n",2,i,2*i);
				}break;
		case 3:
			System.out.println("3단");
			for(int i=1;i<=9;i++) {
				System.out.printf("%d*%d=%d\n",3,i,3*i);
				}break;
		default:
			System.out.println("잘못입력");
			break;
			}*/
		
		//1~99까지 while문으로
		
		/*int i=1;
		while(i<=99) {
			if(i%2==0 || i%3==0) {
				System.out.println(i);
			}
			i+=1;
			}*/
		
		
		//for문 중첩일경우,
		//바깥for문을 기준으로 안쪽for문이 반복된다.!!
		/*for(int i=2;i<=9;i++) {
			System.out.println("**********"+i+"단************");
			for(int j=1;j<=9;j++) {
				System.out.printf("%d*%d=%d\n",i,j,i*j);
			}
		}*/
		for(int i=1;i<=3;i++) {	//행
			for(int j=1;j<=3;j++) {		//열
				System.out.print("*");
			}
			System.out.println();
		}
	
		for(int i=1;i<=2;i++) {	//행
			for(int j=1;j<=5;j++) {		//열
				System.out.print("@");
			}
			System.out.println();
		}
		/*for(int i=0;i<=5;i++) {						
			for(int j=0;j<i+1;j++) {		
				System.out.print("*");
			}
			System.out.println();
		}*/
	
		/*for(int i=0;i<5;i++) {		//0,1,2,3,4
			for(int j=0;j>4-i;j++) {	// 4,3,2,1,0
				System.out.println(" ");
			}
			for(int j=0;j<i+1)
		}*/
		
	}	
		
		
		
		
		
//    *			i=4 j=0~4	
//   **			i=3 j=0~3
//  ***			i=2	j=0~2
// ****			i=1	j=0~1
//*****			i=0	j=0
//	
//	
	}
