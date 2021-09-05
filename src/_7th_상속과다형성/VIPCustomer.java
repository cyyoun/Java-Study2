package _7th_��Ӱ�������;

public class VIPCustomer extends Customer{ //Customer Ŭ���� ��ӹ���
	private int agentID;
	double saleRatio;
	
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID,customerName); //���� Ŭ�������� ���� Ŭ������ ������ �� ���!
		//super()�� ȣ���ϸ� ���� Ŭ������ ����Ʈ �����ڰ� ȣ���
		//super ������ �Ű������� �ִ� �����ڸ� ȣ���Ϸ���???
		customerGrade = "VIP"; 
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer(int, String, int) ������ ȣ��");
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	/* ���� Ŭ������ ��� ������ �޼��带 �����ϴ� super */
	public String showVIPInfo() {
		return super.showCustomerInfo() + "��� ���� ���̵�� " + agentID +"�Դϴ�.";
	}

	/* �޼��� �������̵� */
	//ctrl shift s ������  Override/Implement Methods... ������ ��
	@Override	//�� �ֳ����̼��� '�� �޼���� �����ǵ� �޼����Դϴ�' ��� �����Ϸ��� ��Ȯ�� �˷��ִ� ����
	public int calcPrice(int price) { 	//�������� ���� ��ȯ��, �޼��� �̸�, �Ű����� ����, �Ű����� �ڷ����� �ݵ�� ���ƾ� ��
//		return super.calcPrice(price);
		return price - (int)(price*saleRatio);
	}
	
	

}
