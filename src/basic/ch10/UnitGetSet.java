package basic.ch10;

import java.util.Scanner;

public class UnitGetSet {

	public static void main(String[] args) {
		String name;
		int power;
		int hp;
		int speed;
		String local;
		Unit unit1 = new Unit();
		Unit unit2 = new Unit();
		Unit unit3 = new Unit();
		Scanner sc = new Scanner(System.in);

		unit1.setName("짐레이너");
		name = unit1.getName();
		unit1.setHp(100);
		hp = unit1.getHp();
		unit1.setSpeed(10);
		speed = unit1.getSpeed();
		unit1.setPower(50);
		power = unit1.getPower();
		unit1.setLocal("테란");
		local = unit1.getLocal();

		unit2.setName("케리건");
		name = unit2.getName();
		unit2.setHp(50);
		hp = unit2.getHp();
		unit2.setSpeed(15);
		speed = unit2.getSpeed();
		unit2.setPower(60);
		power = unit2.getPower();
		unit2.setLocal("저그");
		local = unit2.getLocal();
		
		unit3.setName("제라툴");
		name = unit3.getName();
		unit3.setHp(150);
		hp = unit3.getHp();
		unit3.setSpeed(20);
		speed = unit3.getSpeed();
		unit3.setPower(200);
		power = unit3.getPower();
		unit3.setLocal("프로토스");
		local = unit3.getLocal();
		
		while(true) {
			System.out.println("영웅을 선택하세요");
			int selectHero = sc.nextInt();
			if (selectHero == 1) {
				unit1.showInfo();
			} else if (selectHero == 2) {
				unit2.showInfo();
			} else if ( selectHero == 3) {
				unit3.showInfo();
			}
			
		}

	}

}
