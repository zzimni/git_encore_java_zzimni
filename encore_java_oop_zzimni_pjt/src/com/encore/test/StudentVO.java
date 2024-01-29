/*
 * 이렇게 Main 함수가 없는 파일은 실행(interpret)이 안됨. 컴파일만 됨
 * 
 */

package com.encore.test;

/*
 * comment 
 * xxxxVO.java, xxxxDTO.java, xxxxEntity.java
 * -- 업무 로직이 없고 데이터만 관리하는 클래스로 변수 및 Setter, Getter로 이뤄져있음
 * */

public class StudentVO { // Value Object
	/* 변수(Variable)
	 * 구문 형식 : 접근지정자 변수타입 변수명 ;
	 * -- 접근 지정자(public, private)
	 * 변수타입(기본타입, 참조타입)
	 * 변수명(소문자로 시작해야한다~)
	 * 
	 * 변수란 선언 위치가 있는데(전역, 지역)
	 * 지역변수는 접근 지정자가 빠짐
	 */
	
	/*
	// 전역변수(클래스 내에서 접근 가능한 범위를 갖는 것)
	public String name ; // 기본타입 8가지 외의 것들은 모두 참조타입
	public int age ;
	public double height ;
	public boolean isMarriage ;
	*/
	
	// 지역변수 - 외부에서의 접근은 불허하지만 내부에서는 얼마든지 접근 가능
	private String name ;
	private int age ;
	private double height ;
	private boolean isMarriage ;
	
	// 마우스 우클릭 -> Source -> Generate Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public boolean isMarriage() {
		return isMarriage;
	}
	public void setMarriage(boolean isMarriage) {
		this.isMarriage = isMarriage;
	}
	
	/*
	 * <생성자(Constructor)>
	 * 매개변수가 없는 생성자는 기본 생성자
	 * 현재 클래스 안에는 다음과 같은 기본 생성자가 내재돼있는 것?
		public StudentVO() {
			
		}
	 * 매개변수가 있는 생성자는 스페셜 생성자
	 * 명시적으로 생성자가 정의되지 않으면 컴파일 시점에 기본 생성자를 넣어서 컴파일을 진행
	 * 
	 * 구문형식 :
	 * 접근지정자 클래스이름([매개변수]){ // 반환타입이 없고, 이름은 클래스 이름과 동일함 <- 메서드와의 차이점 
	 * 
	 * }
	 * 
	 */
	
	/*
	 * <메서드(함수)>
	 * 만약 반환 타입이 void가 아니라면 문장이 끝나기 전에 return 키워드를 이용해서 값을 반환
	 * 
	 * 구문형식 :
	 * 접근지정자 반환타입 메서드이름([매개변수]) { // 여기서 매개변수는 지역변수인 것임
	 * 	문장 ;
	 * 	return (기본값 | 참조값)
	 * }
	 * */
	
	
	
}
