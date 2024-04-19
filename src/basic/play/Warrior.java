package basic.play;

public class Warrior {
	private String name;
	private int power;
	private int hp;
	private int mp;
	private int depense;
	private String skill;
	
	//getter
	public String getName() {
		return this.name; 
	}
	
	public int getHp() {
		return this.hp;
	}
	
	
	public Warrior (String myName, int myPower, int myHp) {
		this.name = myName;
		this.power = myPower;
		this.hp = myHp;
		this.mp = 20;
		this.depense = 10;
		this.skill = "단단해지기";
	}
	
	// 거너를 공격한다
	public void attackGunner(Gunner g) {
		System.out.println(this.name + "가 공격하여 " + this.power + "만큼 피해를 입었습니다." );
	}
	
	// 거너가 공격한다
	public void beattacked(int power) {
		//방어적 코드
		if (0 >= hp) {
			System.out.println("죽은자의 온기가 남아있습니다.");
			return;
		}
		hp = this.hp - power;
//		System.out.println(name + "의 남은 체력 : " + hp);
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
