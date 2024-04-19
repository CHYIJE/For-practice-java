package basic.ch4;

import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		int start = 0;
		int end = sc.nextInt();
		
		while(flag) {
			if (start == end) {
				System.out.println("if");
				flag = false;
				
			}
			System.out.println("sum : " + (start));
			start++;
		}
	}

}
