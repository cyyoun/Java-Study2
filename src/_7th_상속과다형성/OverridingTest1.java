package _7th_��Ӱ�������;
//�������̵� calcPrice() �׽�Ʈ�ϱ�
public class OverridingTest1 {
	public static void main(String[] args) {
		
		Customer customerYoun = new Customer(10010, "��ä��");
		customerYoun.bonusPoint = 1000;
		
		VIPCustomer customerCha = new VIPCustomer(10020, "������", 001);
		customerCha.bonusPoint = 10000;
		
		int price = 10000;
		System.out.println(customerYoun.getCustomerName() + " ���� �����ؾ� �ϴ� �ݾ��� " + customerYoun.calcPrice(price) + "���̰�, ���� ���� ����Ʈ��" + customerYoun.bonusPoint + "���Դϴ�.");
		System.out.println(customerCha.getCustomerName() + " ���� �����ؾ� �ϴ� �ݾ��� " + customerCha.calcPrice(price) + "���̰�, ���� ���� ����Ʈ��" + customerCha.bonusPoint + "���Դϴ�.");
		}

}
