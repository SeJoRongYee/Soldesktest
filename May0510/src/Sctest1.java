import java.util.Scanner;

public class Sctest1 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		/*System.out.println("이름 입력");
		String name=s.next();		// 개행문자 무시하고 입력받음
		
		System.out.println("주소 입력");
		String ad=s.nextLine();		//한줄단위로 입력받음 (개행문자 포함함) (앤터도 입력으로 침)
		
		System.out.println(name+" : " +ad);*/
		
		
		/*System.out.println("문자열입력");
		String str=s.next();		//문자,문자열을 공백 기준으로 한단어씩 입력받음 (띄어쓰기를 인식하지 못함)
		System.out.println(str);*/
		
		
		System.out.println("문자열입력");
		String str=s.nextLine();		//띄어쓰기 포함 줄 단위로 읽어냄 
		String str1=s.next();
		
		System.out.println(str+" "+str1);
		
		
	}

}
