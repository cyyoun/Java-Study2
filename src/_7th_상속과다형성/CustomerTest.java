package _7th_��Ӱ�������;

public class CustomerTest {

	public static void main(String[] args) {
		VIPCustomer youn = new VIPCustomer(10010, "��ä��", 1234);
		//���� Ŭ���� Customer() �����ڰ� ���� ȣ���
//		youn.setCustomerID(10010);
//		youn.setCustomerName("��ä��");	//protected ������ ������ ������ �ܺ� Ŭ�������� privateó�� get(), set() �޼��带 �� �� ����.
		youn.bonusPoint=10000;
		System.out.println(youn.showCustomerInfo());
		System.out.println(youn.showVIPInfo());
	/* ���� Ŭ������ ������ Ŭ���� �� ��ȯ */
		//VIPCustomer Ŭ������ �ν��Ͻ��� ������ �� �� �ν��Ͻ��� �ڷ����� Customer������ Ŭ���� �� ��ȯ�Ͽ� ������ �� ����.
		//���� �鿡�� ���� Ŭ������ Customer�� VIPCustomer���� �Ϲ����� �����̰�, ��� �鿡�� ���� VIP�� Customer���� ����� �� ����.
		Customer vc = new VIPCustomer(10011, "������", 12345); //(���� �������� ����)
		//����� Ŭ������(����Ŭ������) //������ �ν��Ͻ��� Ŭ������(����Ŭ������)
		//vc ���� ������ ����ų �� �� �� ������ �޼���� Customer Ŭ������ ��������� �޼��� ����!
	}
}
 