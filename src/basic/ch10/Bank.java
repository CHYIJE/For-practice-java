package basic.ch10;

public class Bank {

	String name;
	int balance;
	
	// 입금
	public void desposit(int money) {
		balance = balance + money;
		showInfo();
	}
	
	// 출금 
	public int withdraw(int money) {
		// 방어적 코드 작성
		if (balance < money) {
			System.out.println("도둑놈 심보 멈춰!");
			return 0;
		}
		balance = balance - money;
		showInfo();
		return money;
		
	}

	// 내역공개
	public void showInfo() {
		System.out.println("현재 잔액은 : " + this.balance + "입니다.");
	}
	
}
