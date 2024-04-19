package basic.ch09;

public class Wizard {
	
	String name;
	int power;
	int hp;
	int depense;
	
	public Wizard(String myName, int myPower, int myDepense) {
		this.name = myName;
		this.power = myPower;
		this.depense = myDepense;
		hp = 50;
	}
	
	// 전사를 공격하다
	public void attackWarrior(Warrior warrior) {
		System.out.println("전사를 공격(" + this.power + ") 합니다.");						
		warrior.beAttacked(this.power); // 호출
	}
	
	// 내가 공격을 받다.
	public void beAttacked(int power) {
		
		// 방어적 코드
		System.out.println(this.depense + "데미지를 방어했습니다.");
		if(hp <= 0) {
			System.out.println("죽은자의 온기가 남아있습니다.");
			return; // 실행에 흐름을 반환
		}
		hp = hp + depense;
		hp = hp - power;
	}
	
}
