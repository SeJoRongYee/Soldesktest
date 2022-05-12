import java.util.Scanner;

public class Twoarrytest4 {

	public static void main(String[] args) {

		String str="오늘은 목요일, 공부하고 티비봄!!";
		
		/*String a[]=str.split(","); //2행으로 나뉘어짐
		System.out.println(a[0]);
		
		for(String b:a) {
			System.out.println(b);
		}*/
		
		/*String a=str.substring(4,7); //4~6까지 출력
		System.out.println(a);*/
		
		/*String b=str.replace("공부하고", "좀 쉬고");
		System.out.println(b);*/
		
		/*String str1=str.concat("내일은 금요일");
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
			//a가 b보다 나중에 나옴
			System.out.println(a);
		}
		else if(a.compareTo(b)<0) {
			//b가 a보다 나중에 나옴
			System.out.println(b);
		}
		else
			System.out.println("같은 문자열!");
		
		

	}

}
