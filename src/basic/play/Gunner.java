package basic.play;

public class Gunner {
	private String name;
	private int power;
	private int hp;
	private int mp;
	private int depense;
	private String skill;

	// 생성자
	public Gunner(String myName, int myPower) {
		this.name = myName;
		this.power = myPower;
		this.hp = 800;
		this.mp = 20;
		this.depense = 10;
	}

	// 기능
	// 스킬 사용
	public void beingSkill() {
		System.out.println("");
	}

	// 워리어 공격하기
	public void attackWarrior(Warrior w) {
		System.out.println(this.name + "가 공격하여 " + this.power + "만큼 피해를 입었습니다.");
		w.beattacked(this.power);
	}

	// 워리어가 날 공격함
	public void beattacked(int power) {
		// 방어적 코드
		if (0 <= hp) {
			System.out.println("죽은자의 온기가 남아있습니다.");
			return;
		}
		hp = hp - power;
	}

	public void showInfo() {
		System.out.println("캐릭터 이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("체력 : " + this.hp);
		System.out.println("마력 : " + this.mp);
		System.out.println("방어력 : " + this.depense);
		System.out.println("보유 스킬 : " + this.skill);
	}
}
