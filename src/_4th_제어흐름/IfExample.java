package _4th_�����帧;

public class IfExample {

	public static void main(String[] args) {
		int age = 7;
		if(age >= 8) {
			System.out.println("�б��� �ٴմϴ�.");
		}
		else {
			System.out.println("�б��� �ٴ��� �ʽ��ϴ�.");
		}
		
		int age2 = 9;
		int charge;
		if(age2 < 8) {
			charge =1000;
			System.out.println("���� �� �Ƶ��Դϴ�.");
		}
		else if(age2 < 14) {
			charge = 2000;
			System.out.println("�ʵ��л��Դϴ�.");
		}
		else if(age2 < 20) {
			charge = 2500;
			System.out.println("��, ����л��Դϴ�.");
		}
		else {
			charge = 3000;
			System.out.println("�Ϲ����Դϴ�.");
		}
		
		System.err.println("������ "+charge+" ���Դϴ�.");
	
	}
	
}
