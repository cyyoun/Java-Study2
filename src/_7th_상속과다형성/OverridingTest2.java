package _7th_상속과다형성;

public class OverridingTest2 {

	public static void main(String[] args) {
		Customer youn = new VIPCustomer(10030, "채영", 2000); //VIP 고객 생성
		youn.bonusPoint = 1000;
		
		//선언한 클래스형이 아닌 생성된 인스턴스의 메서드를 호출해서 9000원이 입력됨,.
		//이렇게 인스턴스의 메서드가 호출되는 기술을 '가상메서드'라고 함.
		
		System.out.println(youn.getCustomerName() + "님이 지불해야 하는 금액은 " + youn.calcPrice(10000) + " 원입니다.");
		
	}

}
