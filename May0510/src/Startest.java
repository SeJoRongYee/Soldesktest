
public class Startest {

	public static void main(String[] args) {
		
		for(int i=0;i<9;i++) { //아래 나열된 식을 조건에 맞게 9번 반복한다
			if(i<5) {// 만약 i가 5보다 작은경우
				for(int j=0;j<i+1;j++) { // 차례대로 [0-4까지 공백],[0-3까지 공백],[0-2까지 공백]~[공백 없음]으로 나타난다.
					System.out.print("*");
				}
				System.out.println();  	//
				for(int j=0;j<5-i;j++) {
					System.out.print(" ");
				}
			}
			
			
			
			
			
			
			
		}

	
	
	
	}
}

