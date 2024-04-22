package basic.ch14;

import java.util.Iterator;

public class ArrayTest {

	public static void main(String[] args) {
		
		String[] arrayStr = new String[26];
		
		 arrayStr[0] = "A";
		 arrayStr[1] = "B";
		 arrayStr[2] = "C";
		 arrayStr[3] = "D";
		 arrayStr[3] = "E";
		 arrayStr[7] = "G";
		 
		 
		 // 배열안에 요소의 개수를 출력하시오
		 int eCount = 0;
		 int forCount = 0;
		 for(int i=0; i < arrayStr.length; i++ ) {
			 if(arrayStr[i] != null) {
				 System.out.println(arrayStr[i]);
				 eCount++;
			 }
			 forCount++;
		 }
		 System.out.println("작동 횟수 : " + forCount);
		 System.out.println("요소의 갯수 : " + eCount);
		 System.out.println("인덱스 갯수" + (arrayStr.length -1));
		 
		 // 값이 있다면 콘솔창에 출력
		 // 반복문 활용
		
	}

}
