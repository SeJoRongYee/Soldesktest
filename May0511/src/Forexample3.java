
public class Forexample3 {

	public static void main(String[] args) {
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<4-i;j++) {
				System.out.print(" ");
			}
			int n=1;
			for(int j=0;j<(2*i)+1;j++) {
				System.out.print(n);
				n+=1;
			}
			System.out.println();
		}
		
		

	}

}
