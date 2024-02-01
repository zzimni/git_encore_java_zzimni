package com.encore.operator;

import java.util.Scanner;

public class OperatorDemo {
	public OperatorDemo() {
		
	}
	
	// example01 반환값 X, 매개변수 X
	public void example01() {
		System.out.println(">>>> 산술연산");
		int x = 100 , y = 100 , result = 0 ; // 지역변수 - 전역변수와 달리 초기화 꼭 해야함
		System.out.println(" + "+(x+y)); // 괄호 없으면 + 100100으로 출력됨 괄호로 우선순위 부여
		System.out.println(" - "+(x-y));
		System.out.println(" * "+(x*y));
		System.out.println(" / "+(x/y));
		System.out.println(" % "+(x%y));
	}
	
	// example02 
	public String example02(String color01, String color02) {
		System.out.println(">>>> 연결연산");
		return "신호등의 색깔은 " + color01 + "과 " + color02 + "입니다." ;
	}
	
	// example03 
	public void example03() {
		System.out.println(">>>> 논리연산");
		boolean isFlag=false;
		System.out.println("논리부정 " + !isFlag);
	}
		
	// example04 : Scanner로부터 입력받은 숫자가 짝수인지 아닌지 판단해보고싶다면?
	public void example04() {
		Scanner scan = new Scanner(System.in) ;
		System.out.println("숫자를 입력하세요 : ");
		int number = scan.nextInt();
//		if(number%2==0) {
//			System.out.println("짝수입니다.");
//		}else {
//			System.out.println("홀수입니다.");
//		}
		// if문 쓰지 않는 방법
		System.out.println("Result >>>> 짝수 "+(number%2==0));
		System.out.println("Result >>>> 홀수 "+(number%2!=0));
		
		// Scanner로부터 입력받은 숫자가 3의 배수인지 아닌지를 판단하고 싶다면?
		System.out.println("Result >>>> 3의 배수 "+(number%3==0));
		
		// Scanner로부터 입력받은 숫자가 양수인지 아닌지를 판단하고 싶다면?
		System.out.println("Result >>>> 양수 "+(number>0));
	}
	
	public void example05() {
		System.out.println(">>>> 증감연산 , ++ , -- ");
		int age = 50 ;
		System.out.println("현재 나이는 = " + age);
		System.out.println(++age) ; // 전위 연산: age = age+1 이후 print // 51 출력
		System.out.println("현재 나이는 = "+ age);
		System.out.println(age++); ; // 후위 연산: 연산 후에 증감한다 -> print 후 age = age + 1 // 51 출력
		System.out.println("현재 나이는 = "+ age); // 52 출력
		
		System.out.println();
		int number = 20 ;
		int result = number++ * 3 ; // result를 20*3=60으로 저장한 이후 number은 21이 됨
		System.out.println("Result >>>> " + result); // 60
		
	}
	
	public void exmaple06() {
		System.out.println(">>>> 일반논리연산");
		/*
		 * &(이면서, 이고), |(이거나), (&&,||) - short, shortcut
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int number = scan.nextInt();
		
		// Scanner로부터 입력받은 숫자가 1~100 사이값인지 판단하고 싶다면?
		System.out.println("1 ~ 100 " + (number >=1 && number <=100)); // &&를 쓰면 앞이 false면 뒤는 확인도 안해봄 <- 효율적!
		
	}
	
	public void example07() {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		char str=scan.next().charAt(0) ; // next: 공백이 없는 문자열 / nextline: 공백이 있는 문자열
		// charAt(n): n번째 문자 하나만 추출하는 함수
		// Scanner로부터 입력받은 문자가 A ~ Z 대문자인지 판단하고 싶다면?
		System.out.println("A ~ Z " + (str >='A' && str <='Z')); // &&를 쓰면 앞이 false면 뒤는 확인도 안해봄 <- 효율적!
		
	}
	
	public void example08() {
		System.out.println(">>>> 삼항연산");
		// (조건식)? 참일 경우 : 거짓일 경우
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int number = scan.nextInt();
		
		// Scanner로부터 입력받은 숫자가 양수인지 음수인지 아니면 0인지 판단하고싶다면?
		// String result=(number>0 ? "양수" : "음수")
		String result=(number>0 ? "양수" : (number==0) ? "0" : "음수") ;
		System.out.println("Result >>>> " + (result));
		
	}
		
		
		
}
