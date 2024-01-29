
public class StringDemoMain {
	public static void main(String[] arg) {
		// 자바에서 유일하게 참조타입이지만 기본타입처럼 사용가능한 변수의 타입은 String
		// String은 인스턴스 생성없이 사용가능하지만 객체로 취급이 된다. -> 인스턴스가 소유하고있는 요소들에 접근 가능(스트링 객체 뒤에 점 찍으면 스트링 클래스 함수 호출 가능(?))
		
//		// Case 1
//		String str01 = "임섭순" ;
//		String str02 = "임섭순" ;
//		
		// Case 2
		String str01 = new String("임섭순") ;
		String str02 = new String("임섭순") ;
		
		if (str01==str02) {
			System.out.println("주소값이 동일합니다.");
		} else {
			System.out.println("주소값이 동일하지 않습니다.");
		}
		
		if (str01.equals(str02)) { // string으로 만들어진 인스턴스의 값이 같은 지 확인할 때는 equals를 사용해야함
			System.out.println("값이 동일합니다.");
		}else {
			System.out.println("값이 동일하지 않습니다.");
		}
	}

}
