package _7th_상속과다형성;

public class CustomerTest {

	public static void main(String[] args) {
		VIPCustomer youn = new VIPCustomer(10010, "윤채영", 1234);
		//상위 클래스 Customer() 생성자가 먼저 호출됨
//		youn.setCustomerID(10010);
//		youn.setCustomerName("윤채영");	//protected 예약어로 선언한 변수는 외부 클래스에서 private처럼 get(), set() 메서드를 쓸 수 있음.
		youn.bonusPoint=10000;
		System.out.println(youn.showCustomerInfo());
		System.out.println(youn.showVIPInfo());
	/* 상위 클래스로 묵시적 클래스 형 변환 */
		//VIPCustomer 클래스로 인스턴스를 생성할 때 이 인스턴스의 자료형을 Customer형으로 클래스 형 변환하여 선언할 수 있음.
		//개념 면에서 상위 클래스인 Customer가 VIPCustomer보다 일반적인 개념이고, 기능 면에선 보면 VIP가 Customer보다 기능이 더 많음.
		Customer vc = new VIPCustomer(10011, "차정두", 12345); //(역은 성립하지 않음)
		//선언된 클래스형(상위클래스형) //생성된 인스턴스의 클래스형(하위클래스형)
		//vc 참조 변수가 가리킬 수 있 는 변수와 메서드는 Customer 클래스의 멤버변수나 메서드 뿐임!
	}
}
 