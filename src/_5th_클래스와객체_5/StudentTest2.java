package _5th_Ŭ�����Ͱ�ü_5;


public class StudentTest2 {

	public static void main(String[] args) {
		Student2 youn = new Student2();
		youn.setStudentName("��ä��");
		System.out.println(Student2.getSerialNum()); 
		//���� �ڵ�� ���� Student2 Ŭ���� ������ ���� ������ ���� ����.
		//static ������ Ŭ���� �̸����� ���� ����!
		System.out.println(youn.studentName + " �й� : " + youn.studentID);
		
		
		Student2 cha = new Student2();
		cha.setStudentName("������");
		System.out.println(cha.getSerialNum()); // �̷��� ����� ���� ������ static �̴� Ŭ���� �̸����� ���� �����϶�� ��
		System.out.println(cha.studentName + " �й� : " + cha.studentID);

		//���� ������ Ŭ���� �޼���� Ŭ���� ������ �ν��Ͻ��� �������� �ʾƵ� ����� �� ����
		System.out.println("�ν��Ͻ� ���� ȣ�� ���� : " + Student2.getSerialNum());
	}

}
