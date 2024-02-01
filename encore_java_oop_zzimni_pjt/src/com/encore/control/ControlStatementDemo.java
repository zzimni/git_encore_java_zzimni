package com.encore.control;

import java.util.Scanner;

import lombok.NoArgsConstructor;

@NoArgsConstructor

public class ControlStatementDemo {
	/*
	 * <if 조건식>
	 * A 또는 B라는 값을 기대할 수 있다.
	 * 조건식에 대한 값이 true이면 if문 안의 내용을 실행하고 false이면 else문 안의 내용을 수행
	 */
	
	// 메뉴 구성(1. 금도끼, 2. 은도끼, 3. 쇠도끼)
	// 조건 1) 입력 숫자는 1~3 사이
	// 조건 2) 1번 선택시 '거짓말을 하는구나. 아무 도끼도 줄 수 없다.'
	// 조건 3) 2번 선택시 '또 거짓말을 하는구나. 아무 도끼도 줄 수 없다.'
	// 조건 4) 3번 선택시 '정직하구나. 너에게 모든 도끼를 주겠다.'
	// 조건 5) 조건 판단이 끝나면 산신령은 연못으로 사라진다.
	public String woodMan() {
		String msg = null ; // 지역변수 선언 - 지역변수는 선언과 동시에 초기화시켜줘야한다.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int number=scan.nextInt();
		
		if(number>=1 && number<=3) {
			// msg를 여기서 선언하면 이 block 밖에서 return을 할 수 없음
			if (number==1) {
				// return "거짓말을 하는구나. 아무 도끼도 줄 수 없다.";
				msg = "거짓말을 하는구나. 아무 도끼도 줄 수 없다.";
			}else if(number==2){
				// return "또 거짓말을 하는구나. 아무 도끼도 줄 수 없다.";
				msg = "또 거짓말을 하는구나. 아무 도끼도 줄 수 없다.";
			}else {
				// return "정직하구나. 너에게 모든 도끼를 주겠다.";
				msg = "정직하구나. 너에게 모든 도끼를 주겠다.";
			}
		}else {
			System.out.println("정해진 숫자만 입력하세요~");
		}
		System.out.println("산신령은 연못으로 사라진다.");
		
		// return null;
		return msg;
	}
	
	
	
	/*
	실행용 클래스는 패키지 없음
	실행용 클래스명 : PracticeMain.java
	패키지명 : com.encore.practice
	기능 제공용 클래스명 : PracticeService.java
	[실습1]
	메소드명 : public void example01(){}
	구현 내용 :
	            국어(정수), 영어(정수), 수학(정수), 총점(정수), 평균(실수) 변수 선언하고,
	            각 점수를 키보드로 입력받고,
	            합계(국어+영어+수학)와 평균(합계/3.0)을 계산하고,
	            세 과목의 점수와 평균을 가지고 합격 여부 처리함
	<합격의 조건 >
	세 과목의 점수가 각각 40점이상이면서,
	평균이 60점 이상이면 합격,
	아니면 불합격 처리함 
	*/

	public void example01(){
		Scanner scan=new Scanner(System.in);
		String msg=null;
		int korean=0, english=0, math=0, total=0;
		double avg=0.0;
		System.out.println("국어 점수를 입력하세요 : ");
		korean=scan.nextInt(); // 여기서 변수 선언 & 초기화 해도 됨 // int korean = scan.nextInt(); 이로케
		System.out.println("영어 점수를 입력하세요 : ");
		english=scan.nextInt();
		System.out.println("수학 점수를 입력하세요 : ");
		math=scan.nextInt();
		total=korean+english+math;
		avg=total/3.0;
		if(korean>=40 && english>=40 && math>=40 && avg>=60) {
			System.out.println("합격");
		}else {
			// System.out.println("불합격");
			if(korean<40) {
				System.out.println("국어점수 미달로 불합격");
			}
			if(english<40) {
				System.out.println("영어점수 미달로 불합격");
			}
			if(math<40) {
				System.out.println("수학점수 미달로 불합격");
			}
			if(avg<60) {
				System.out.println("평균점수 미달로 불합격");
			}
		}
		
	}
	
	public double calc(int x, char oper, int y) {
		// if, 삼항연산자, switch-case 구문으로 구현해보자
		double value=0.0;
		
		switch(oper) { // switch는 if문처럼 확인하면서 진행되는 게 아니라 맞는 부분으로 건너뛰는 것
			case '+' :
				value = x + y;
				System.out.println("+");
				break;
			case '-' :
				value = x - y;
				System.out.println("-");
				break;
			case '*' :
				value = x * y;
				System.out.println("*");
				break;
			case '/' :
				value = x / y;
				System.out.println("/");
				break;
			default :
				System.out.println("사칙 연산자만 허용합니다.");
			
		}
		
		return value;
	}

}

