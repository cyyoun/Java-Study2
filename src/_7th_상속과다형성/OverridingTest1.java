package _7th_상속과다형성;
//오버라이딩 calcPrice() 테스트하기
public class OverridingTest1 {
	public static void main(String[] args) {
		
		Customer customerYoun = new Customer(10010, "윤채영");
		customerYoun.bonusPoint = 1000;
		
		VIPCustomer customerCha = new VIPCustomer(10020, "차정두", 001);
		customerCha.bonusPoint = 10000;
		
		int price = 10000;
		System.out.println(customerYoun.getCustomerName() + " 님이 지불해야 하는 금액은 " + customerYoun.calcPrice(price) + "원이고, 현재 누적 포인트는" + customerYoun.bonusPoint + "점입니다.");
		System.out.println(customerCha.getCustomerName() + " 님이 지불해야 하는 금액은 " + customerCha.calcPrice(price) + "원이고, 현재 누적 포인트는" + customerCha.bonusPoint + "점입니다.");
		}

}
