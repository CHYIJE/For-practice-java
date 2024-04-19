package basic.ch10;

public class BankTest {

	public static void main(String[] args) {
		Bank bank1 = new Bank();
		System.out.println(" 입금 중...");
		bank1.desposit(100_000);
		int getMoney =  bank1.withdraw(100_000);
		System.out.println(" >>>>> 출금 중 >>>>>");
		bank1.withdraw(55_000);
		bank1.withdraw(50_000);
		System.out.println("금액" + getMoney);
		
	}

}
