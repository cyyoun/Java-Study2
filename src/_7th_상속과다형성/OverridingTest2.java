package _7th_��Ӱ�������;

public class OverridingTest2 {

	public static void main(String[] args) {
		Customer youn = new VIPCustomer(10030, "ä��", 2000); //VIP �� ����
		youn.bonusPoint = 1000;
		
		//������ Ŭ�������� �ƴ� ������ �ν��Ͻ��� �޼��带 ȣ���ؼ� 9000���� �Էµ�,.
		//�̷��� �ν��Ͻ��� �޼��尡 ȣ��Ǵ� ����� '����޼���'��� ��.
		
		System.out.println(youn.getCustomerName() + "���� �����ؾ� �ϴ� �ݾ��� " + youn.calcPrice(10000) + " ���Դϴ�.");
		
	}

}
