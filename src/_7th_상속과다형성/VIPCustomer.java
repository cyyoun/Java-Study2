package _7th_상속과다형성;

public class VIPCustomer extends Customer{ //Customer 클래스 상속받음
	private int agentID;
	double saleRatio;
	
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID,customerName); //하위 클래스에서 상위 클래스로 접근할 때 사용!
		//super()를 호출하면 상위 클래스의 디폴트 생성자가 호출됨
		//super 예약어로 매개변수가 있는 생성자를 호출하려면???
		customerGrade = "VIP"; 
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer(int, String, int) 생성자 호출");
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	/* 상위 클래스의 멤버 변수나 메서드를 참조하는 super */
	public String showVIPInfo() {
		return super.showCustomerInfo() + "담당 상담원 아이디는 " + agentID +"입니다.";
	}

	/* 메서드 오버라이딩 */
	//ctrl shift s 누르고  Override/Implement Methods... 누르면 됨
	@Override	//이 애노테이션은 '이 메서드는 재정의된 메서드입니다' 라고 컴파일러에 명확히 알려주는 역할
	public int calcPrice(int price) { 	//재정의할 때는 반환형, 메서드 이름, 매개변수 개수, 매개변수 자료형이 반드시 같아야 함
//		return super.calcPrice(price);
		return price - (int)(price*saleRatio);
	}
	
	

}
