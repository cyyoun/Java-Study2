package _2nd_�������ڷ���;

public class ExplicitConversion {

	public static void main(String[] args) {
		/*
		 * ����� �� ��ȯ : ����Ʈ ũ�Ⱑ ū �ڷ������� ���� �ڷ������� �����ϴ� ���, �ڷ� �ս� �߻��� �� ����. �� ������ �ڷ������� ��
		 * ������ �ڷ������� �����ϴ� �����.
		 */
		double dNum = 1.2;
		float fNum = 0.9f;
		
		int iNum1 = (int)dNum + (int)fNum; //1, �� �Ǽ��� ���� �� ��ȯ�Ǿ� ������
		int iNum2 = (int)(dNum+fNum);	//2, �� �Ǽ��� ���� ���� ���ǰ� �� ��ȯ��. 
		System.out.println(iNum1);
		System.out.println(iNum2);
		//���� �����̶� �� ��ȯ�� ���� �̷���������� �ٶ� �� ��� ���� �ٸ��� ��Ÿ�� �� ����.
	}

}
