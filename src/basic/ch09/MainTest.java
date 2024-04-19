package basic.ch09;

import java.util.Scanner;

public class MainTest {
	//코드의 시작점  -> 실행의 흐름을 만들 수 있다.
	public static void main(String[] args) {
		
		Warrior warrior1 = new Warrior("바바", 10, 1);
		Warrior warrior2 = new Warrior("고뇌바바", 30, 2);
		Wizard wizard1 = new Wizard("소서", 20, 1);
		
		System.out.println("전사가 마법사를 5번 공격합니다.");
		System.out.println("전사가 마법사를 몇번 공격하시겠습니까");
		Scanner sc = new Scanner(System.in);
		
		int inputData = sc.nextInt();
		for(int i = 0; i < inputData; i++) {
		warrior1.attackWizard(wizard1);
		}
		
		System.out.println("마법사의 hp 확인 :"  + wizard1.hp);
		
	} // end of main

} // end of class
