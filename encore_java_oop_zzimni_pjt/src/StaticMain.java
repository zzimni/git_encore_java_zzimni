import com.encore.staticdemo.StaticDemo;


public class StaticMain {
	
	public static void main(String[] args) {
		// lombok annotaion을 활용한 호출
		StaticDemo demo01 = new StaticDemo("jslim");
		System.out.println(demo01.getName());
		demo01.staticMsg="demo01 msg";
		
		StaticDemo demo02 = new StaticDemo("encore");
		System.out.println(demo02.getName());
		demo02.staticMsg="demo02 msg";
		
		System.out.println(demo01.staticMsg); // 나는 demo01 msg를 assign했지만 demo02 msg가 뜸 -> instance 소유가 아닌 class 소유임을 알 수 있음 -> 멤버변수를 static으로 쓰지 않는 이유
		
		// StaticDemo.nonStatic(); // nonStatic 메서드는 인스턴스소유이므로 이렇게 호출 안됨
		StaticDemo.staticMethod(); // staticMethod()는 인스턴스 소유가 아닌 클래스 소유이므로 클래스 이름으로 접근 가능 // static은 끼리끼리 (static에서 static은 호출 가능)
		
	}
}
