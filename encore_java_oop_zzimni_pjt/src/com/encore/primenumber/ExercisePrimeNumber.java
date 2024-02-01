package com.encore.primenumber;

import java.util.Scanner;

public class ExercisePrimeNumber {
	
	// scanner 이용해서 사용자 값을 입력받아서 전달.
	public static int getUserInput() {

		System.out.println("숫자를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		int number=scan.nextInt();
		
		return number;
	}
}
