package basic.ch09;

public class Warrior {
	String name;
	int power;
	int hp;
	int depense;
	
	// 생성자
	public Warrior (String myName, int myPower, int myDepense) {
		name = myName;
		power = myPower;
		hp = 100;
		depense = myDepense;
	}
	
	// Warrior 공격을 하다
	// Wizard 공격을 하다
	public void attackWizard(Wizard wizard) {
		System.out.println("마법사를 공격(" + this.power + ") 합니다.");
		wizard.beAttacked(this.power);
	}
	
	public void beAttacked(int power) {
		// 방어적 코드
		if(hp <= 0) {
			System.out.println("죽은자의 온기가 남아있습니다.");
			return; // 실행에 흐름을 반환
		}
		hp = hp - power;
		hp = hp + depense;
	}

}
