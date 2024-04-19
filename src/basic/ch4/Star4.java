package basic.ch4;

public class Star4 {

	public static void main(String[] args) {
		int i;
		int j;
		for (i = 0; i < 4; i++) {
			//  첫번째 outer for - i = 0
			//  두번째 outer for - i = 1
		    //  세번째 outer for - i = 2
			for (j = i; j < 4; j++) {
				// 현재 i = 0 , j = 0; 4 번 
				// 현재 i = 1 , j = 1; 3 번
				// 현재 i = 2 , j = 2; 2 번
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
