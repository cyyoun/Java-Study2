package _5th_Ŭ�����Ͱ�ü;
/////////////////////////////////////Ŭ����, ��ü, �ν��Ͻ� ����_2
/* Ŭ���� ���ο� main() �Լ� �����ϱ�.
�� Ŭ���� ���ο� main() �Լ��� ����� �� Ŭ������ ���α׷��� ���� Ŭ������ ��.
*/
public class Student {
		int studentID;
		String studentName;
		int grade;
		String address;
		
	public String getStudentName() { //�޼��� = ��� �Լ� = Ŭ���� ������ ����Լ�(�޼���)�� ��� ������ ����Ͽ� Ŭ���� ���� ��� ����
		return studentName;
	}

	public static void main(String[] args) {
		//new ������ Ŭ���� �����ϱ�!
		Student studentYoun = new Student(); //Student Ŭ���� ����
		studentYoun.studentName = "��ä��"; //Ŭ������ ��� ������ ���� ����
		
		System.out.println(studentYoun.studentName);
		System.out.println(studentYoun.getStudentName());
	}

}
