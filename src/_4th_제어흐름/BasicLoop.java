package _4th_�����帧;

public class BasicLoop {
// �ݺ��� : while, do-while, for���� ����
	public static void main(String[] args) {
		// while : ���ǹ��� ���� ��� ���๮�� �����ϰ� , �����̸� ��������.
		
		int num = 1;
		int sum = 0;
		
		while(num <= 10) { //(���ǽ�)�� ���̸� {} ���� ���๮�� ����
			sum += num;
			num++;
		}
		System.out.println("1���� 10���� ���� ���� " + sum + "�Դϴ�.");
		
		// do-while : while�� ������ ���� �ƴϸ� ���๮�� �� ���� �������� ����. �׷��� do-while�� �߰�ȣ�� ���๮�� �ݵ�� �� �� �̻� ������.
		
		int num2 = 1;
		int sum2 = 0; 
		
		do {
			sum2 += num2;
			num2++;
		} while(num2 <= 10 );
		
		System.out.println("1���� 10���� ���� ���� " + sum2 + "�Դϴ�.");
		
		// for : for(�ʱ�ȭ��; ���ǽ�; ������) { ���๮; } �� () �ȿ� �ִ� �ʱ�ȭ��, ���ǽ�, ������, ��� ��δ� ������ �� ����.	
		int i;
		int sum3 = 0;
		for(i = 1; i <= 10; i ++) {
			sum3 += i;
		}
		System.out.println("1���� 10���� ���� ���� " + sum3 + "�Դϴ�.");
		
		// ��ø�� �ݺ��� (������ �����)
		
		int dan;
		int times;
		
			for(times = 1; times <= 9; times++) {
				for(dan = 2; dan <= 9; dan++) {
				System.out.print(dan + "x" + times + "=" + (dan*times)+"\t");
				}
				System.out.println();
			}
	}
}
