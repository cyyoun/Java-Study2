package _7th_��Ӱ�������;

public class VIPCustomer extends Customer{ //Customer Ŭ���� ��ӹ���
	private int agentID;
	double saleRatio;
	
	
	public VIPCustomer() {
		customerGrade = "VIP"; 
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer() ������ ȣ��");
	}
	
	public int getAgentID() {
		return agentID;
	}
	

}
