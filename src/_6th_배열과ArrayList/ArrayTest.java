package _6th_�迭��ArrayList;

public class ArrayTest {
	public static void main(String[] args) {
		// �ڷ���[] V �迭 �̸� = new V �ڷ���[����];
		// �ڷ��� V �迭 �̸�[] = new V �ڷ���[����]; 
	//�ڹٿ��� �迭�� �����ϸ� �׿� ���ÿ� �� ����� ���� �ʱ�ȭ ��.
	/*	
	 int[] studentID = new int[] {101, 102, 103} 
	 �� ������ ����	       new int[3] {101, 102, 103} �� ���� �߻�

	 int[] studentID = {101, 102, 103}
	 �� new int[] �κ� ���� ����

	 int [] studentID;
	 studentID = new int[] {101, 102, 103}
	 �� �迭�� �ڷ����� ���� �����ϰ� �ʱ�ȭ�ϴ� ��쿡�� new int[] �� ������ �� ����.	
		
	*/
		
		double[] data = new double[5];
		
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;
		
		for(int i = 0; i<data.length; i++) {
			System.out.println(data[i]); //�迭�� ������� ���� ���� 0.0 ���� �ʱ�ȭ���� ��µ�
		}
		
		
	}
}
