import java.util.Scanner;

public class Arraytest4 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		/*int ary[]=new int[7];
		int floor=ary.length;
		int sum=0;
		
		for(int i=0;i<floor;i++) {
			System.out.println("�ο��� �Է����ּ���");
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
		
		
		 int sum=0;  //���պ��� 
		 int multi=1; //�Ѱ�����
		 int ary[]=new int[4];	
		 int size=ary.length;
		 
		 for(int i=0;i<size;i++) {
			 System.out.println("������ �Է��ϼ���");
			 ary[i]=s.nextInt();
			 sum+=ary[i];
		 }
		 	System.out.println(sum);
		 	System.out.println("������ �Ѿ�ڽ��ϴ�");
		 	
		 	for(int i=0;i<size;i++) {
			 System.out.println("������ �Է��ϼ���");
				ary[i]=s.nextInt();
				multi*=ary[i];
			}
			 System.out.println(multi);
		

}

}
