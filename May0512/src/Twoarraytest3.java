
public class Twoarraytest3 {

	public static void main(String[] args) {
		
		
		/*String s[][]= {{"java"},					//0		(0,0)
						{"c","c++"},				//01	(1,0)(1,1)
						{"html","css","python"}};	//012	(2,0)(2,1)(2,2)
		//비정방형 배열
		for(int i=0;i<s.length;i++) {
			for(int j=0;j<s[i].length;j++) {
				System.out.print(s[i][j]);
			}
			System.out.println();
		}*/
		
		int ary[][] = 	{{90, 90, 110, 110}, 
						{120, 110, 100, 110}, 
		                {120, 140, 130, 150}};
		
		double sum=0;
		double a=ary.length;
		double b=ary[0].length;
		
		for(int i=0;i<ary.length;i++) {
			for(int j=0;j<ary[i].length;j++) {
				sum+=ary[i][j];
				
			}
		}System.out.println(sum/(a*b));
		
		
		
		
		
		

	}

}
