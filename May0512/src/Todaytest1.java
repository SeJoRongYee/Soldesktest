import java.util.Scanner;

public class Todaytest1 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		//�Ǽ��� 2��3��
		/*double ary[][]=new double[2][3];
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				ary[i][j]=s.nextDouble();
				System.out.println(ary[i][j]);
		}
		}*/
		
		
		//���� 10�� �Է¹޾� 5�� ��� ���
		
		int ary[]=new int[10];
		
		for(int i=0;i<ary.length;i++) {
			ary[i]=s.nextInt();
			if(ary[i]%5==0) {
				System.out.println(ary[i]) ;
			}
		}

		
		
		
	
		
		
		
}

}
