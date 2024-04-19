package basic.ch10;

public class Unit {
	private String name;
	private int power;
	private int hp;
	private int speed;
	private String local;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String inputName) {
		this.name = inputName;
	}
	
	public int getPower() {
		return this.power;
	}
	
	public void setPower(int inputPower) {
		this.power = inputPower;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public void setHp(int inputHp) {
		this.hp = inputHp;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public void setSpeed(int inputSpeed) {
		this.speed = inputSpeed;
	}
	
	public String getLocal() {
		return this.local;
	}
	
	public void setLocal(String inputLocal) {
		this.local = inputLocal;
	}
	
	public void showInfo() {
		System.out.println("영웅의 이름 : " + name);
		System.out.println("공격력 : " + power);
		System.out.println("체력 : " + hp);
		System.out.println("이동속도 : " + speed);
		System.out.println("진영 : " + local);
		System.out.println("---------------------");
		
	}

}
