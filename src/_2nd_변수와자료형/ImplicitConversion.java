package _2nd_�������ڷ���;

/*�� ��ȯ �⺻ ��Ģ
 �� ����Ʈ ũ�Ⱑ ���� �ڷ������� ū �ڷ������� �� ��ȯ�� �ڵ����� �̷������.
 �� �� ������ �ڷ������� �� ������ �ڷ������� �� ��ȯ�� �ڵ����� �̷������.
 ���� ����������������������������������������������������������������  �Ǽ�
 byte		short		int		long		 float	double
 			char		
 (1byte)	(2byte)		(4byte)	(8byte)		(4byte)	(8byte)
������ �� ��ȯ(�ڵ� �� ��ȯ) : ȭ��ǥ ����
����� �� ��ȯ(���� �� ��ȯ) : ȭ��ǥ �ݴ� ����, �ڷ� �ս��� �߻��� �� ����

*/
public class ImplicitConversion {
	public static void main(String[] args) {
		byte bNum =10;
		int iNum = bNum;
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2;
		System.out.println(fNum);
		
		double dNum;
		dNum = iNum + iNum2; //�ڵ����� ����ȯ ��.
		System.out.println(dNum);
		
	}

}
