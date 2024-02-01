package com.encore.staticdemo;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.Setter;

import lombok.NoArgsConstructor;


@Setter
@Getter
// => lombok라이브러리에 의해 setter method와 getter method가 정의된 것
@NoArgsConstructor
// args를 받지 않음(?)
@AllArgsConstructor
// 기본생성자, name이 들어간 스페셜 생성자 모두 생성됨

public class StaticDemo {
	
	// 전역변수 - 인스턴스, 클래스 소유로 나뉨
	// 인스턴스 소유
	private String name ; // 이제 클래스에서 변수는 모두 private으로
	// 클래스 소유
	public static String staticMsg; // static 접근지정자는 대부분 public으로 함 - final이 붙지 않는 static 변수는 쓰지 않는다 -> 이유는 main에 써둠 
	
	public static final String URL = "나는 상수입니다."; // final이 붙은 자바 변수는 '상수'를 의미, 상수는 이름을 풀네임 대문자로
	
	public void nonStatic() {
		System.out.println("나는 인스턴스 소유의 메서드입니다.");
		// 인스턴스 소유의 메서드에서 static 변수 및 메서드 사용이 가능하다.
	}
	public static void staticMethod() { 
		System.out.println("나는 클래스 소유의 메서드입니다.");
		// name = "encore"; // static method에서 non-static 변수에 접근 불가능 <- static이 먼저 메모리에 올라가기 때문에 non-static 객체가 생성되기 전에 그 객체를 호출하는 것은 불가능
		// Cannot make a static reference to the non-static field name : static 영역에서 인스턴스 소유의 변수를 사용할 수 없다.
	}

}
