
public class Arraytest1 {

	public static void main(String[] args) {
		//배열(Array)
		//한번에 많은 메모리 공간 선언 가능
		//같은 타입의 데이터들이 순차적으로 저장됨
		//배열 인덱스는 0부터 시작

		//int     ary   []      =  new int[10];
		//자료형    배열명  [인덱스]  =  new 자료형[데이터 개수];     
		
		//int ary[];  배열선언
		//ary=new int[10] 10개의 int생성
		
		
		// 실수 10개를 저장할 배열
		/*double d[]=new double[10];
		int i[]=new int[3];
		char c[]=new char[5];*/
		
		
		/*int a[]; //배열에 대한 레퍼런스 변수a를 선언
		a=new int[5];
		
		int ary[]= {1,2,3};		//배열 초기화
		System.out.println(ary[0]);*/
		
		int b[]= {4,3,2};
		
		for(int i=0;i<=2;i++) {
			System.out.println(b[i]);
		}
		
		/*double f[]= {0.2,0.3,0.4,0.5};
		System.out.println(f[3]);*/
		
}

}
