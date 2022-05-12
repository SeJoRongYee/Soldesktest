import java.util.Scanner;

public class Randomtest2 {

	public static void main(String[] args) {
		//1~100까지 수를 난수발생시켜서
		//정수가 5의 배수이면 5의 배수라고 출력
		//10의 배수이면 10의 배수라고 출력
		//다 아니면 아니라고 출력
		
		int score=(int)(Math.random()*20+81);
		
		/*if (r%5==0) {
			System.out.println("10의 배수");}
		else if	(r%10==0) {
			System.out.println("5의 배수");}
		else {
			System.out.println("전부 아니다");
		}
		
		System.out.println(r);*/
		
		String grade; //변수선언(문자열)
		
		if(score>=90) { 
			if(score>=95) {
				grade="A+";} //95점 이상이면 A+
			else {
				grade="B";}// 90점 미만일떄 B
			}
		
		else {
			if(score>=85) 
				grade="B+"; //85<=grade<90 이면 B+
			else
				grade="B";
		}
		System.out.println(score+" : "+grade);
	
	
	
	}	
		
		

	}


