package _2nd_�������ڷ���;

public class CharacterEx {

	public static void main(String[] args) {
		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1); //������ ����ȯ
		
		char ch2 = 66; //�������̶�鼭 ��� �������� ���Ե� ���� ����?
		System.out.println(ch2); // B ���
		
		int ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3);
		
		//int�� 32��Ʈ, char�� 16��Ʈ
		
		char ch4 = '��'; //�� ���ڹۿ� �� ��;
		char ch5 = '\uCC44';
		char ch6 = '\uC601'; //�����ڵ�
		System.out.println(ch4);
		System.out.println(ch5);
		System.out.println(ch6);
		
		int a = 65;
		int b= -66;
		
		char a2 = 65;
		//char b2 = -66; ������ ������ ������ ������ ���� �߻�
		
		System.out.println((char)a);
		System.out.println((char)b); // ?��� �� ?�� �� �� ���� ���ڶ�� �ǹ�
		System.out.println(a2);
	}

}
