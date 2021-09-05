package _7th_상속과다형성;

public class Customer {
	protected int customerID;	//protected는 상속된 하위 클래스를 제외한 나머지 외부 클래스에서는 private와 동일한 역할을 함.
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
//	public Customer() {
//		customerGrade = "SILVER";
//		bonusRatio = 0.01;
//		System.out.println("Customer() 생성자 호출");
//	}
	
	
	/* super 예약어로 매개변수가 있는 생성자 호출하기 */
	public Customer(int customerID, String customerName	) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer(int, String) 생성자 호출");
	}
	//그런데 이렇게 Customer 클래스의 디폴트 생성자를 없애고 새로운 생성자를 작성하면, 
	//상속받은 VIPCustomer 클래스에서 오류가 발생됨.
	//오류 메시지는 묵시적으로 호출될 디폴트 생성자 Customer()가 정의되지 않았기 때문에, 반드시 명시적으로 다른 생성자를 호출해야 한다는 뜻,.
	
	
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
