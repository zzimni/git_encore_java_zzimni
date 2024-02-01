package com.encore.vending;

import java.util.Scanner;

//import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@NoArgsConstructor // 기본생성자
@Getter
@RequiredArgsConstructor // "nonnull 걸려있는 변수들만 포함하는 스페셜 생성자를 생성하겠다"?

public class VendingMachine {
	
	// 다음의 값들은 클래스 전역에서 사용되고 변하지 않는 상수들이므로 클래스 초입에 다음과 같이 선언해주어 건들지 못하게(?) 하자
	public static final int COLA=800;
	public static final int WATER=500;
	public static final int VITAWATER=1500;
	
	@NonNull
	private String type ;
	
	private int money , choice ;
	
	public void init() { // initailizer
		// 속도 : 삼항연산자 -> switch-case -> if 순으로 빠르다
		switch(getType()) {
		case "if" : 
			ifVending();
			break;
		case "switch" :
			switchVending();
			break;
		}
	}
		
	public void menu() {
		System.out.println("금액을 입력하세요 : ");
		Scanner scan=new Scanner(System.in);
		money = scan.nextInt();
		
		System.out.println("메뉴를 고르세요. ");
		System.out.println("1. 콜라(800원) 2. 생수(500원) 3. 비타민워터(1500원) ");
		Scanner scan2=new Scanner(System.in);
		choice=scan2.nextInt();
		
	}
		
	private void ifVending() {
//		int remain=0, cheon=0, obaek=0, baek=0;
//		
//		if(choice==1) {
//			if(money>=COLA) {
//				remain=money-COLA;
//			}else {
//				System.out.println("800원 이상 넣어주세요.");
//			}
//		}else if(choice==2) {
//			if(money>=WATER) {
//				remain=money-WATER;
//			}else {
//				System.out.println("500원 이상 넣어주세요.");
//			}
//		}else if(choice==3){
//			if(money>=VITAWATER) {
//				remain=money-VITAWATER;
//			}else {
//				System.out.println("1500원 이상 넣어주세요.");
//			}
//		}else {
//			System.out.println("1,2,3 중에 고르세요.");
//		}
//		cheon=remain/1000;
//		obaek=(remain-1000*cheon)/500;
//		baek=(remain-1000*cheon-500*obaek)/100;
//		
//		System.out.println("잔돈 : "+remain+"원");
//		System.out.println("천원 :"+cheon+"개, "+"오백원 :"+obaek+"개, "+"백원 :"+baek+"개");
		
		// 강사님 코드
		System.out.println(">>>> if 구현");
		menu();
		if(choice==1 && money>=COLA) {
			money -= COLA;
		}else if(choice==2 && money>=WATER){
			money-=WATER;
		}else if(choice==3&&money>=VITAWATER) {
			money-=VITAWATER;
		}else {
			System.out.println("잔액이 부족합니다.");
		}
		System.out.println("잔돈"+money+"원");
		// %d, %f, %s
		System.out.printf("천원 : %d개, 오백원 : %d개, 백원 : %d개",(money/1000),(money%1000)/500,(money%500)/100);
		
		
		
	}
	private void switchVending() {
		System.out.println(">>>> switch 구현");
		menu();
		int price = 0;
		
		switch(choice) {
		case 1 : 
			price = COLA ;
			break;
		case 2 :
			price = WATER ;
			break ;
		case 3 :
			price = VITAWATER ;
			break;
		}
		if (money<price) {
			System.out.println("잔액이 부족합니다.");
		}else {
			money-=price;
		}
		System.out.println("잔돈 : "+money+"원");
		// %d, %f, %s
		System.out.printf("천원 : %d개, 오백원 : %d개, 백원 : %d개",(money/1000),(money%1000)/500,(money%500)/100);
	}
}
