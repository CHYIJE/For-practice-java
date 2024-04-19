package basic.ch01;

public class Exercise {

	public static void main(String[] args) {
		int a = 10;
		int b = 100;
		int c = 120;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("a + b = " + a + b);
		
		
		int ageBox = 30;
		int telBox = 20;
		
		int tempBox = ageBox;
		
		ageBox = telBox;
		telBox = tempBox;
		
		
		
		System.out.println("ageBox : "  + ageBox );
		System.out.println("telBox : "  + telBox );
		 
	}

}
