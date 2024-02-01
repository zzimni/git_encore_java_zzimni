package com.encore.loop;

import java.util.Scanner;

public class LoopDemo02 {
	
	// default constructor
	public LoopDemo02() {
		
	}
	
	
	public void sumRandom() {
		// 난수 생성
//		double nan = Math.random(); // static 메서드는 클래스의 소유이므로 클래스 이름+. 뒤에 메서드명을 붙여 불러올 수 있다.
//		System.out.println("nan = "+nan);
		
		// 1~난수(100)까지의 합을 구해보고 싶다.
		int nan = (int)(Math.random()*100)+1; // Math.random()은 0 ~ 1 사이의 수이므로
		System.out.println("nan = " + nan);
		
		int sum=0;
		for (int idx=1;idx<=nan;idx++) {
			sum+=idx;
		}
		System.out.println("sum = " + sum);
	}
	
	// 1~100 사이 난수 두 개를 발생시켜서 최솟값부터 최댓값까지의 합을 구하고싶다면?
	public void sumRandomTwo() {
		int min=0, max=0, sum=0;
		int first = (int)(Math.random()*100)+1;
		int second = (int)(Math.random()*100)+1;
		if(first>second) {
			max=first;
			min=second;
		}else {
			max=second;
			min=first;	
		}
		for(int idx=min;idx<=max;idx++) {
			sum+=idx;
		}
		System.out.println("first = "+first+", second = "+second+", sum = "+sum);
	}
	
	// A ~ Z 출력하는 구문을 작성한다면?
	public void charPrint(char start, char end) {
		for(char idx=start;idx<=end;idx++) {
			// %c
			System.out.printf("%c \t", idx);
		}
	}
	
	// 1~100 사이의 홀수의 합을 출력한다면?
	public void sumOdd() {
		int sum=0;
//		for(int idx=1;idx<=100;idx++) {
//			if (idx%2==1) {
//				sum+=idx;
//			}
//		}
//		System.out.println(sum);
		
		// 강사님 방법
		for(int idx=1;idx<=100;idx=idx+2) {
			sum+=idx;
		}
		System.out.println(sum);
	}
	
	// 1~난수(100)를 발생시켜서 짝수의 개수가 몇 개인지 출력한다면?
	public void countEven() {
		int cnt=0;
		int nan=(int)(Math.random()*100)+1;
		for(int idx=1;idx<=nan;idx++) {
			if(idx%2==0) {
				cnt++;
			}
		}
		System.out.printf("생성된 난수는 %d이고 1부터 난수 사이의 짝수 개수는 %d개 입니다.",nan,cnt);
	}
	
	
	// 매개변수로 문자열을 입력받아서 문자 하나씩을 추출하여 출력하고 싶다면?
	public void splitString(String str) {
		System.out.println("args->"+str);
		for (int idx=0;idx<str.length();idx++) { // 배열의 인덱스가 0부터 시작하므로 비교구문에 등호가 붙으면 안됨
			System.out.print(str.charAt(idx)+"\t");
		}
	}
	
	// 스캐너를 이용해서 값을 입력받고 1부터 차례로 누적하여 합을 구하다가 입력한 값을 넘으면 중단하고
	// 마지막으로 더해진 값과 그 때 까지의 합을 출력하고 싶다면?
	// 입력 예시) 100
	// 출력 예시) 14 105
	public void sumBreak() {
		System.out.println("값을 입력하세요 ");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int sum=0;
		
		// 내 방법
//		for(int idx=1;true;idx++) { 
//			sum+=idx;
//			if(sum>num) {
//				System.out.println(idx+"\t"+sum);
//				break;
//			}
//		}
		
		// 강사님 방법
		int idx = 0 ; // 이렇게 해야 for문 밖에서도 idx를 불러올 수 있는듯?
		for(idx=1;;idx++) { // true 안 써도 똑같이 무한루프임
			if(sum>num) {
				break;
			}
			sum+=idx;
		}
		System.out.println(idx-1+"\t"+sum);
	}
	
	public void nestedFor() {
		for(int row=1;row<=10;row++) {
			
			System.out.println("row idx = "+row);
			
			for(int col=1;col<=10;col++) {
//				System.out.print(col + "\t");
				System.out.print("*");
			}
			
			System.out.println();
			
		}
	}
	
	
	public void gugudan() {
		for(int dan=2;dan<=9;dan++) {
			System.out.printf(">>>> %d 단 <<<<",dan);
			System.out.println();
			for(int number=1;number<=9;number++) {
				System.out.println(dan+" * "+number+" = "+(dan*number));
			}
			System.out.println();
			
		}
	}
	
	// 위의 구구단 클래스를 두 단계로 나눠서 보기
	public void gugudanTable() {
		for(int dan=2;dan<=9;dan++) {
			System.out.printf(">>>> %d 단 <<<<",dan);
			System.out.println();
			gugudanTimes(dan);			
		}
	}
	
	public void gugudanTimes(int dan) {
		for(int number=1;number<=9;number++) {
			System.out.println(dan+" * "+number+" = "+(dan*number));
		}
		System.out.println();		
	}
	
	// i, j 변수만 출력 (5 * 5)
	public void printIJ() {
		for(int i=1; i<=5; i++) {
			for(int j=1;j<=5;j++) {
				System.out.println("row = "+i+" , col = "+j);
			}
			System.out.println();
		}
	}
	
	/*
	 * 출력예시)
	 * 23456
	 * 34567
	 * 45678
	 * 56789
	 * 678910
	 */
	
	public void forLine() {
//		for(int i=2;i<=6;i++) {
//			for(int j=i;j<=i+4;j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		// 강사님 방법 - printIJ()에서 힌트를 얻자 <- 한 줄 마다 i + (1~5) 하면 됨
		for(int i=1; i<=5; i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(i+j);
			}
			System.out.println();
		}
	}
	
	// break, continue 키워드
	// break는 가장 가까운 loop 구문을 빠져나가는 것.
	// continue는 조건에 만족할 경우 실행을 하지 않고 다음 차례로 이동
	
	// 구구단 세로로 출력 
	public void gugudan02() {
		for(int number=1;number<=9;number++) {
			for(int dan=2;dan<=9;dan++) {
				// 5단만 빼고 출력해보자
				if(dan==5) {
					continue; // 이 조건에 만족하면 이후의 문장은 수행하지 않고 다음 스텝으로 넘어가겠다는 뜻
				}
				
				System.out.print(dan+" * "+number+" = "+(dan*number)+"\t");
				
				// 5단까지만 출력해보자
//				if(dan==5) {
//					break;
//				}
			}
			System.out.println();
			
		}
	}
	
	public void forLabel() {
		outer : // label 설정
		for(int i=1;i<=5;i++) {
			for(int j =1 ; j<=5; j++) {
				if(j==3) {
					break outer; // 특정 label 빠져나오기 // outer 안쓰고 돌려보고 쓰고 돌려보기
				}
				System.out.println("i, j ="+i+" "+j);
			}
		}
	}
	
	/*
	 * <while문>
	 * 
	 * 초기값 ;
	 * while(조건식) {
	 * 	statement ;
	 * 	[증감식 or 분기문]
	 * }
	 * 
	 * 증감식 값이 없으면 무한루프
	 * 필요에 따라서 while(true)로 무한 반복을 유도
	 * 
	 */
	
	
	// while
	public void whileOneToTen() {
		int idx=1;
		while(idx<=10) {
			System.out.print(idx+"\t");
			idx++;
		}
	}
	
	// 스캐너로부터 문자열을 입력받아서 for, while 구문으로 입력된 문자열의 각 문자의 인덱스와 문자를 쌍으로 출력
	// 입력예시) java
	// 출력예시) 0 : j
	//		  1 : A
	public void printStrIdx() {
		System.out.println("문자열을 입력하세요 : ");
		Scanner scan=new Scanner(System.in);
		String str= scan.nextLine();
		
		System.out.println(">>>> for <<<<");
		for(int idx=0;idx<str.length();idx++) {
			System.out.printf("%d : %s",idx,str.charAt(idx));
			System.out.println();
		}
		
		System.out.println(">>>> while <<<<");
		int idx=0;
		while(idx<str.length()) {
			System.out.printf("%d : %s",idx,str.charAt(idx));
			System.out.println();
			idx++;
		}
	}
	
	/*
	 * <do-while문>
	 * 
	 * 초기값;
	 * do {
	 * 		statement;
	 * 		[증감식 or 분기문]
	 * } while( 조건식 );
	 * 
	 * // while은 statement가 한 번도 수행되지 않을 수 있지만
	 * // do-while문은 한 번은 무조건 실행되게 됨
	 * 
	 * // do ~ while(false) : 한 번 수행하고 끝마친다.
	 */
	
	public void doWhileTest() {
		System.out.println(">>>> do ~ while <<<<");
		do {
			System.out.println("false이지만 한 번은 무조건 수행!");
		} while(false);
	}

}
