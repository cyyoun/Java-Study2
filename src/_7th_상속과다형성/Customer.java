package _7th_상속과다형성;

public class Customer {
	protected int customerID;	//protected는 상속된 하위 클래스를 제외한 나머지 외부 클래스에서는 private와 동일한 역할을 함.
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer() 생성자 호출");
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public String showCustomerInfo() {
		return customerName +" 님의 등급은 " + customerGrade + " 이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}
}
