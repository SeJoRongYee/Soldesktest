import java.util.Scanner;

public class Arraytest3 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		
		
		int ary[]=new int[5];
		int sum=0;
		
		int size=ary.length;		//�迭��.length
		System.out.println(size);
		
		for(int i=0;i<5;i++) { //i��� ary.length �̿� ����
			System.out.println("������ �Է��ϼ���");
			ary[i]=s.nextInt();
			sum+=ary[i];
		}
		System.out.println(sum/(double)size);

	}

}
