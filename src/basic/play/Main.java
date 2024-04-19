package basic.play;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Warrior warrior = new Warrior("주먹펴고 일어서", 100, 1000);
		Gunner gunner = new Gunner("총알 탄 사나이", 120);
		Scanner sc =  new Scanner(System.in);
		
		warrior.showInfo();
		gunner.showInfo();
		System.out.println("--------------");
		gunner.attackWarrior(warrior);
		System.out.println("전사" + warrior.getHp());
		warrior.attackGunner(gunner);
		
	}

}
