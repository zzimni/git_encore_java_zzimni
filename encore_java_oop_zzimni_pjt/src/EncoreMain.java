
public class EncoreMain {

	// 묵시적 형변환 : byte -> short -> int -> long -> float -> double
	// 명시적 형변환(캐스팅): byte <- short <- int <- long <- float <- double
	public static void main(String[] args) {
		System.out.println("섭섭님과 함께 하는 즐거운 JAVA"); // sysout+ctrl+spacebar 하면 바로 쳐짐
	
		// 지역변수는 메서드 내에 선언하는 변수
		
		int intValue = 10 ;
		char charValue = 'M' ; // 자바는 '',"" 구분함 - ''는 글자 하나, ""는 문자열
		float doubleValue = 3.14F ; // 실수의 default type은 double이며 float으로 할당하기 위해서는 뒤에 F를 붙여줘야함
		
		String stringValue = "섭섭님" ;
		boolean booleanValue = false ;
		
		System.out.println("정수값: " + intValue); // 변수의 타입이 다를 경우의 연산은 큰 타입으로 흡수돼버림 -> int도 문자열이 됨
		System.out.println("문저값: " + charValue);
		System.out.println("실수값: " + doubleValue);
		System.out.println("문자열값: " + stringValue);
		System.out.println("논리값: " + booleanValue);
	}

}
