import java.util.Scanner;

public class Whiletest2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		/*System.out.println("���� �Է�");
		int n=s.nextInt();
		
		switch(n) {
		case 2:
			System.out.println("2��");
			for(int i=1;i<=9;i++) {
				System.out.printf("%d*%d=%d\n",2,i,2*i);
				}break;
		case 3:
			System.out.println("3��");
			for(int i=1;i<=9;i++) {
				System.out.printf("%d*%d=%d\n",3,i,3*i);
				}break;
		default:
			System.out.println("�߸��Է�");
			break;
			}*/
		
		//1~99���� while������
		
		/*int i=1;
		while(i<=99) {
			if(i%2==0 || i%3==0) {
				System.out.println(i);
			}
			i+=1;
			}*/
		
		
		//for�� ��ø�ϰ��,
		//�ٱ�for���� �������� ����for���� �ݺ��ȴ�.!!
		/*for(int i=2;i<=9;i++) {
			System.out.println("**********"+i+"��************");
			for(int j=1;j<=9;j++) {
				System.out.printf("%d*%d=%d\n",i,j,i*j);
			}
		}*/
		for(int i=1;i<=3;i++) {	//��
			for(int j=1;j<=3;j++) {		//��
				System.out.print("*");
			}
			System.out.println();
		}
	
		for(int i=1;i<=2;i++) {	//��
			for(int j=1;j<=5;j++) {		//��
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
