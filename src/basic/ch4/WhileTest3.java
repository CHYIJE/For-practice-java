package basic.ch4;

public class WhileTest3 {

	public static void main(String[] args) {
	
		int i = 1;
		int sum = 0;
		
		while(i <= 10) {
			sum = sum + i;
			i++;
			System.out.println("1~10 합 과정 : " + sum);
		}
		System.out.println("총합의 결과 " + sum);
	}
}