package _5th_Ŭ�����Ͱ�ü_5;

public class Student2 {
	private static int serialNum = 1000;	//private static
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public Student2() {
		serialNum++;
		studentID = serialNum;
	}
	
	// Ŭ���� �޼��� ���ο����� �ν��Ͻ� ������ ����� �� ����!!
	// ���������� Ŭ��������(��������)�� ��� ����~~
	public static int getSerialNum() {	//static
		int i = 10;	//���������� ���� : �޼��尡 ������ ������� ����
//		studentName = "ä��";	//�ν��Ͻ�����(�������)�� �Ұ��� : static�� ��� �Ұ���!
		return serialNum;
	}
	public static void setSerialNum(int serialNum) {	//static
		Student2.serialNum = serialNum;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	

}
