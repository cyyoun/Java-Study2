package _7th_상속과다형성;

public class VIPCustomer extends Customer{ //Customer 클래스 상속받음
	private int agentID;
	double saleRatio;
	
	
	public VIPCustomer() {
		customerGrade = "VIP"; 
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer() 생성자 호출");
	}
	
	public int getAgentID() {
		return agentID;
	}
	

}
