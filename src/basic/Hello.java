package basic;

public class Hello {

	public static void main(String[] args) {
		int i = 0;
		while (i < 100) { //i가 100보다 작을경우 
			i++;			// 증감한다
			if (i % 2 == 0) {		// 만약 2로 나눠서 나머지가 0이되면
				continue;			// 건너 뛰어라
			}
			System.out.println(i);	// 돌고보니 홀수만 출력되었다!
		}

	}

}
