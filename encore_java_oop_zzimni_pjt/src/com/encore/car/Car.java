package com.encore.car;

import com.encore.car.engine.Engine;

public class Car {
	
	// 전역(멤버)변수 스코프는 클래스 전역에서 사용 가능한 변수
	private Engine engine ;
	
	// 기본 생성자 정의해보자
	// 생성자는 like a method로 반환타입이 정의되지 않고 메서드의 이름은 클래스의 이름과 동일
	
	public Car() { // 기본 생성자 (생성자: 객체 생성시 호출되게 돼있음)
		engine = new Engine() ; // 생성자 안에서 객체 생성 -> Car 객체 생성하면 Engine 객체도 자동으로 생성됨
	}
	public Car(String type) { // 오버로딩
		engine=new Engine(type);
	}
	public void engineInfo() {
		String info = engine.showInfo() ;
		System.out.println(">>>> 엔진 정보 <<<<");
		System.out.println(info);
	}
}
