package _7th_��Ӱ�������;

public class CustomerTest {

	public static void main(String[] args) {
		VIPCustomer youn = new VIPCustomer();
		//���� Ŭ���� Customer() �����ڰ� ���� ȣ���
		youn.setCustomerID(10010);
		youn.setCustomerName("��ä��");
		youn.bonusPoint=10000;
		System.out.println(youn.showCustomerInfo());
	}

}
 