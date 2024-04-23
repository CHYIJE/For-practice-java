package basic.play;

public class Character {

	protected String name;
	protected int power;
	protected int hp;
	protected int mp;
	protected int depense;
	protected String skill;

	public Character(String name) {
		this.name = name;
	}

	// getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getDepense() {
		return depense;
	}

	public void setDepense(int depense) {
		this.depense = depense;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	// 인포
	public void showInfo() {
		System.out.println("캐릭터 이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("체력 : " + this.hp);
		System.out.println("마력 : " + this.mp);
		System.out.println("방어력 : " + this.depense);
		System.out.println("보유 스킬 : " + this.skill);
	}

	// 공격 당함
	public void beattacked(int power) {
		// 방어적 코드
		if (0 > hp) {
			System.out.println(this.name + "가 죽었습니다.");
			return;
			
		}
		hp = hp - power;
	}

	// 공격
	// 워리어 공격하기
	public void attackWarrior(Warrior w) {
		System.out.println(w.getName() + "가 공격하여 " + this.power + "만큼 피해를 입었습니다.");
		w.beattacked(this.power);
	}
	
	public void attackWarrior(Gunner g) {
		System.out.println(g.getName() + "가 공격하여 " + this.power + "만큼 피해를 입었습니다.");
		g.beattacked(this.power);
	}
	
	// 스킬 사용 
	public void doSkill(Warrior w) {
		System.out.println(this.name + "가 " + this.skill + "을 사용했습니다.");
		depense += 5;
	}
	
	public void doSkill(Gunner g) {
		System.out.println(this.name + "가 " + this.skill + "을 사용했습니다.");
		power += 5;
	}

}
