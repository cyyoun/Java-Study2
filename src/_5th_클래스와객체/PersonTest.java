package _5th_Ŭ�����Ͱ�ü;

/////////////////////////////////////������_2
public class PersonTest {

	public static void main(String[] args) {
		// �����Ʈ �����ڷ� Ŭ������ ������ �� �ν��Ͻ� ���� ���� ���� �ʱ�ȭ!!!
		Person personYoun = new Person(); //Person()�� ���� �Լ��� '������'��� �� 
		//�����ڴ� Ŭ������ ó�� ���� �� ��� ������ ����� �ʱ�ȭ �ϴ� ��!, �����ڴ� Ŭ������ ������ ���� ȣ��.
		//������ �̸��� Ŭ���� �̸��� ����, �����ڴ� ��ȯ ���� ��
		personYoun.name = "��ä��";
		personYoun.height = 161.7f;
		personYoun.weight = 55.7f;
		
		Person personCha = new Person("������", 184f, 78.0f); //�ν��Ͻ��� ���� �ʱ�ȭ�� ���ÿ� Ŭ���� ����
		System.out.println(personCha.name);
		
		
		
	}

}
