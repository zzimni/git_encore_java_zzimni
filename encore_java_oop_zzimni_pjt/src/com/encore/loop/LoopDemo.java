package com.encore.loop;
/*
 * 반복구문 (for, while, do ~ while)
 * for : 반복 횟수가 정의되어 있을 때 사용
 * while, do ~ while : 횟수가 정의되어있는 것이 아니라 어떤 상황이 올 때 까지 반복하겠다 할 때 사용
 * 
 * break, continue
 * for(초기식 ; 조건식 ; 증감식) {
 * }
 */

public class LoopDemo {
	public LoopDemo() {
		
	}
	public void loopMethod01() {
		for(int idx=1 ; idx <= 10 ; idx++){
			System.out.println("idx value = "+idx);
		}
	}
	
	public void sumTenToOne() {
		int sum=0;
		
		for (int idx=10;idx>=1;idx--) { // idx = idx - 1
			System.out.println("idx = "+idx);
			sum+=idx; // sum = sum + idx;
		}
		
		System.out.println("1~10의 합 : "+sum);
	}
	
	public void sumOneToTen() {
		int sum=0;
		
		for (int idx=1;idx<=10;idx++) { // idx = idx + 1
			System.out.println("idx = "+idx);
			sum+=idx; // sum = sum + idx;
		}
		
		System.out.println("1~10의 합 : "+sum);
	}
	
	public void sumStartToEnd(int start, int end) {
		int sum = 0;
		for(int idx=start;idx<=end;idx++) {
			sum+=idx;
		}
		System.out.printf("%d ~ %d 합 = %d",start,end,sum);
	
	}
	
	// 윤년인지 아닌지를 판단하고 싶다.
	// 4의 배수이고 1000의 배수가 아니거나 400의 배수일 때
	
	// Case01.
//	public String leapYear(int year) {
//		String msg=null; // 참조 타입은 null로 초기화. 기본 타입은 0 (boolean은 false)
//		if ((year%4==0&&year%1000!=0)||(year%400==0)) {
//			msg="윤년";
//		}else {
//			msg="평년";
//		}
//		return msg;
//	}
	
	// Case02.
	public String leapYear(int year) {
		String msg=((year%4==0&&year%1000!=0)||(year%400==0) ? "윤년" : "평년");
		return msg;
	}
	
	
	public String leapYearStartToEnd(int startYear, int endYear) {
		int cnt=0;
		for(int year=startYear;year<=endYear;year++) {
			if(leapYear(year).equals("윤년")) {
				cnt++;
				System.out.print(year+"\t"); // 탭 키
				if(cnt%5==0) {
					System.out.println();
				}
			}
		}
		return null;
	}
}
