
public class CastingMain {

	public static void main(String[] args) {
		// 자바의 캐스팅 연산자 : (타입) 변수명 ;
		
		byte x,y,sum ; // 선언
		x=10;
		y=10;
		// sum=x+y; // 에러 - 정수의 default 타입은 int임 이걸 byte 변수에 할당할 수 없음
		sum=(byte)(x+y);
		System.out.println("sum = "+sum);
		System.out.println();
		System.out.println();
		
		char charValue='A';
		char charValue2='B';

		System.out.println("char Value = " +charValue);
		System.out.println(charValue+charValue2); // 문자열끼리 합은 자동으로 아스키코드로 반환해서 계산해줌 (A:65+B:66=131)
		System.out.println((char)(charValue+charValue2)); // 실행 안됨
		System.out.println((char)(97)); // a로 출력됨
	}

}
