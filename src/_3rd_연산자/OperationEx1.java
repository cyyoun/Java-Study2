package _3rd_������;
/* �װ� ������
 * Ex) 3+4 ���� 3�� 4�� ���̰� +�� ������
�����ڴ� ���� ������ ���� ���� ������, ���� ������, ���� �����ڷ� �з�
Ex) ���� ������ : ++num;
	���� ������ : num1 + num2;
	���� ������ : (5>3)?1:0;
*/
public class OperationEx1 {

	public static void main(String[] args) {
		int mathScore = 100;
		int engScore = 95;
		
		int totalScore = mathScore+engScore;
		System.out.println(totalScore);
		
		double avgScore = totalScore / 2.0 ; //2.0 �̷��� �Ҽ��� �� �ڸ����� ��Ÿ������ �Ҽ��� ù��° �ڸ����� ����� ��µ�!
		System.out.println(avgScore);
				
		/* ���� ���� ������
		val = ++num : num�� 1�� ������ �� val ������ ����
		val = num++ : val ������ num ���� ���� ������ �� num�� 1����
		*/
		
		int gameScore = 180;
		
		int lastScore1 = ++gameScore;
		System.out.println("lastScore1 : "+lastScore1);
		
		int lastScore2 = --gameScore;
		System.out.println("lastScore2 : "+lastScore2);
		
		/* ���� ������
		>, <, >=, <=, ==, !=
		���迬���ڸ� ����� �� ��ȣ�� ����ؼ� �������� ���� ������!
		
		* �� ������
		&&(�� ��) : �� ���� ��� ���� ��쿡��  ��
		||(�� ��) : �� �� �� �ϳ��� ���̸� ��
		! (����) : ���� �����ڶ��. ���� ��� ���� ������ ��� ������ ����
		*/
		
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10); // �� ��, ���� ���� �����̹Ƿ� ���� ���� �������� ����
		System.out.println("value : "+value);
		System.out.println("num1 : "+num1);
		System.out.println("i : "+i); //���� �״�ζ��
		
		value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10); // �� ��, ���� ���� ���̹Ƿ� ���� ���� �������� ����.
		System.out.println("value : "+value);
		System.out.println("num1 : "+num1);
		System.out.println("i : "+i); //�굵 ���� �״��¡
		
		
	}

}
