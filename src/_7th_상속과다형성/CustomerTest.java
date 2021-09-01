package _7th_상속과다형성;

public class CustomerTest {

	public static void main(String[] args) {
		VIPCustomer youn = new VIPCustomer();
		//상위 클래스 Customer() 생성자가 먼저 호출됨
		youn.setCustomerID(10010);
		youn.setCustomerName("윤채영");
		youn.bonusPoint=10000;
		System.out.println(youn.showCustomerInfo());
	}

}
 