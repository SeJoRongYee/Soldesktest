import java.util.Scanner;

public class Twoarrytest4 {

	public static void main(String[] args) {

		String str="������ �����, �����ϰ� Ƽ��!!";
		
		/*String a[]=str.split(","); //2������ ��������
		System.out.println(a[0]);
		
		for(String b:a) {
			System.out.println(b);
		}*/
		
		/*String a=str.substring(4,7); //4~6���� ���
		System.out.println(a);*/
		
		/*String b=str.replace("�����ϰ�", "�� ����");
		System.out.println(b);*/
		
		/*String str1=str.concat("������ �ݿ���");
		System.out.println(str1);*/
		
		
		
		/*Scanner s=new Scanner(System.in);
		
		String a=s.next();
		String b=s.next();
		
		if(a.length() < b.length()) {
			System.out.println(b);
		}
		else
			System.out.println(a);*/
		
		String a="apple";
		String b="banana";
		
		if(a.compareTo(b)>0) {	//a>b
			//a�� b���� ���߿� ����
			System.out.println(a);
		}
		else if(a.compareTo(b)<0) {
			//b�� a���� ���߿� ����
			System.out.println(b);
		}
		else
			System.out.println("���� ���ڿ�!");
		
		

	}

}
