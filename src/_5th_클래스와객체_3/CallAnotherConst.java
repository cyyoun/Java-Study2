package _5th_Ŭ�����Ͱ�ü_3;
// �����ڿ��� �ٸ� �����ڸ� ȣ���ϴ� this

class Person{
	int age;
	String name;
	
	Person(){	//����Ʈ �����ڰ� ȣ��Ǵ� ��� �ʱ갪���� "�̸� ����"�� 1 ���� �����ϰ��� ��
		/*
		 * this.name= "noname"; ***���� �ؾ� �� ��
		 �����ڴ� Ŭ������ ������ �� ȣ��ǹǷ� Ŭ���� ������ �Ϸ���� ���� ������ �ٸ� �ڵ尡 �ִٸ� ������ �߻��� �� ����.
		 �� ����Ʈ �����ڿ��� ������ �Ϸ�Ǵ� ���� �ƴ϶� this �� ����ˤ��� �ٸ� �����ڸ� ȣ���ϹǷ�, �̶��� this�� Ȱ���� ������ ���� �;� ��.
		 */
		this("�̸� ����", 1); //this�� ����� Person(String, int) ������ ȣ��
	}
	
	Person(String name, int age){ //�Ű������� ���� ������
		this.name = name;
		this.age = age;
	}
}

public class CallAnotherConst {
	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
	}

}
