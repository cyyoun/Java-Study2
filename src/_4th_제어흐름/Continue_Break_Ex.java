package _4th_�����帧;

public class Continue_Break_Ex {

	public static void main(String[] args) {
// continue : �ݺ����� �Բ� ���̰� �ݺ��� �ȿ��� continue���� ������ ������ ������ �������� �ʰ� for���� ó������ ���ư� �������� ����.
		
		int i;
		int sum = 0;
		for(i = 1; i <= 100; i++) {
			if(i % 2 == 0)						// �� �� �̻��ϰԵ� �����ݷ��̳� �߰�ȣ�� ������ �ȵ�..!
				continue;
				sum += i;
			
		}
		System.out.println("1���� 100���� Ȧ������ ���� " + sum + "�Դϴ�.");
	
// break : switch-case ������ ����ߵ��� �ݺ���, ���ǹ����� break�� ����ϸ� �� �������� �� �̻� ���๮�� �ݺ����� ����.
		int num;
		int total = 0;
		for(num=1; total<100; num++) {
			total += num;
		}
		System.out.println("num :" + num);
		System.out.println("total :" + total);
		
		int num2;
		int total2 = 0;
		for(num2=1; ; num2++) {
			total2 += num2;
			if(total2 > 100) {
				break;
			}
		}
		System.out.println("num2 :" + num2);
		System.out.println("total2 :" + total2);
	}
}
