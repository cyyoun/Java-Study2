package _5th_Ŭ�����Ͱ�ü_2;
//���� ����. ���� ������
/*
 * public : �ܺ� Ŭ���� ��𿡼��� ������ �� ����
 * private : ���� Ŭ���� ���ο����� ������ �� ����.
 * protected : ���� ��Ű�� ���ο� ��� ������ Ŭ���������� ������ �� �ְ� �� �� Ŭ���������� ������ �� ����. 
*/
public class PersonTest2 {

	public static void main(String[] args) {
		Person2 personYoun = new Person2();	//Person2() ����Ʈ �����ڰ� ������ ���� �߻���
		personYoun.setPersonName("��ä��");

		System.out.println(personYoun.getPersonName());
	}
}

