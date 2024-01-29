package com.encore.car.engine;

public class Engine {
	
	private String engineType ;
	
	// 생성자 또는 메서드는 매개변수의 타입과 개수를 달리해서 재정의 할 수 있다. - 내가 원하는 형식의 객체 생성 위해
	// 생성자 오버로딩, 메서드 오버로딩
	// 생성자는 매개변수로 받은 값을 전역(멤버)변수에 할당하는 역할을 한다.
	
	public Engine() {
		
	}
	
	public Engine(String engineType) { // 지역변수
		// engineType=engineType; // 왼: 전역변수 / 오: 지역변수 <- 근데 이렇게하면 전역변수에 할당이 안 됨. 지역변수에게 우선권?이 있기 때문
		this.engineType=engineType; // this를 통해 왼쪽이 전역(멤버)변수임을 명시함
	}
	
	public String showInfo() {
		return "엔진의 타입은 " + engineType + "입니다." ;
	}
}
