
public class Arraytest5 {

	public static void main(String[] args) {
		
		/*int num[]= {1,2,3,4,5};
		
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		
		//for-each��
		//�迭�� �� ��Ҹ� ���������� �����Ѵ�.
		//for(int i:num)
		for(int i:num) {
			System.out.println(i);
		}*/
		
		
		String fruit[]= {"�ٳ���","����","���"};
		//for each�� ���
		
		for(String i:fruit) {
			System.out.println(i);
		}
		
		int sum=0;
		int ary[]= {1,2,3,4,5};
		
		for(int i:ary) {
			sum+=i;
		}System.out.println(sum);

	}

}
