import com.encore.test.StudentVO ; // import 패키지이름.클래스이름 - 자바에서 .은 소유의 의미 -> ~~패키지가 소유하고있는 ~~클래스를 import하겠다

public class ReferenceMain {
	/* 
	 * 기본타입과 참조타입 차이점
	 * 기본타입은 선언과 동시에 값을 할당할 수 있다.
	 * 기본타입은 값을 담는 변수
	 * 
	 * 그러나
	 * 참조타입은 선언과 동시에 값을 할당할 수 없다.
	 * 참조타입은 값을 담는 변수가 아니라 주소값을 담는 변수이다.
	 * 주소값을 담기 위해서는 객체생성이 선행되어야 한다.
	 * 객체 생성시 사용하는 연산자는 new
	 * new 뒤에는 생성자(Constructor) 호출
	 * 
	 * 참조타입: 클래스, 배열, 자료구조, enum, etc...
	 * 
	 */

	public static void main(String[] args) {
		// System.out.println(new StudentVO()); // instance의 주솟값이 함께 출력됨
		
		StudentVO stuObj = new StudentVO();
		
//		System.out.println("인스턴스 소유의 변수 호출 : " + stuObj.name); // StudentVO에서 name의 접근지정자가 private으로 설정돼있기 때문에 에러남 -> public으로 바꿔주고 다시 실행하면 에러 안남
//		stuObj.name="포케";
//		System.out.println("인스턴스 소유의 변수 호출 : " + stuObj.name);
		
		System.out.println("인스턴스 소유의 메서드 호출 : ");
		stuObj.setName("섭섭해"); // 여기 int나 char값 넣어도 에러남
		
		String returnValue = stuObj.getName() ;
		System.out.println(returnValue);
		
		System.out.println(stuObj.getName()) ; // setName으로 넣어준 값을 따로 저장하지 않고 확인(출력)만 하고싶을 때? <-맞나		
		
	}

}
