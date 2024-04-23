package basic.play;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Warrior warrior = new Warrior("주먹펴고 일어서");
		Gunner gunner = new Gunner("총알 탄 사나이");
		Scanner sc =  new Scanner(System.in);
		
		warrior.showInfo();
		System.out.println("--------------");
		gunner.showInfo();
		System.out.println("--------------");
		gunner.attackWarrior(warrior);
		System.out.println(warrior.hp);
		warrior.doSkill(warrior);
		warrior.showInfo();
		gunner.doSkill(gunner);
		gunner.showInfo();
		for (int i =0; i <= 21; i++) {
		warrior.attackWarrior(gunner);
		}
		
		
		
	}

}
