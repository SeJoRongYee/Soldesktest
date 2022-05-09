
public class Iftest3 {

	public static void main(String[] args) {
		
		/*int total=300;
		double avg=(total/3.0);
		
		//평균이 90점 이상이면 A출력
		//80점 이상이고 90점 미만이면 B출력
		//70점 이상이면 C출력
		//그 외 F
		
		
		if(avg>=90){
			System.out.println('A');
		}
		else if(avg>=80 && avg<90) {
			System.out.println('B');
		}
		else if(avg>=70){
			System.out.println('C');
		}
		else {
			System.out.println('F');
		}*/
	
		int a=20,b=10;
		
		if(a>10 ) {		//선행조건 바깥쪽 if문 조건이 참이어야 if-else확인 가능
			if(b>=0) {
				b=1;
			}
			else {
				b=-1;
			}
			System.out.println(a+" "+b);
		}
		else
			System.out.println("확인 할 수 없습니다");
		

	}

}
