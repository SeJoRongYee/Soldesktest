
public class Forexample2 {

	public static void main(String[] args) {
		
		
		/*for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				System.out.println(i+" "+j);
			}
		}*/
		
		for(int i=0;i<9;i++) {
			if(i<5) {
				for(int j=0;j<4-i;j++) {
					System.out.print(" ");
				}
				for(int j=0;j<i+1;j++) {
					System.out.print("*");
				}
			}
			else {
				for(int j=0;j<i-4;j++) {
					System.out.print(" ");
				}
				for(int j=0;j<9-i;j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
			
		
		
		

	}

}
