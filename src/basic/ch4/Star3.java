package basic.ch4;

public class Star3 {

	public static void main(String[] args) {
		int i;
		int j;
		for (i = 0; i <= 8; i++) {
			for (j = 0; j <= i; j++) {
				if (i%2 ==1) {
					continue;
				}
				System.out.print("*");
			}
			if (i%2 ==1) {
				continue;
			}
			System.out.println("");
		}
	}
}
