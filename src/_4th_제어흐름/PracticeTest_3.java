package _4th_�����帧;

public class PracticeTest_3 {

	public static void main(String[] args) {
		// �������� �ܺ��� ���ϴ� ���� �۰ų� ���� �������� ����ϴ� ���α׷��� ����� ������.
		int dan;
		int times;
		
		for(dan=2; dan<=9; dan++) {
			for(times=1; times<=9; times++) {
				if(times>dan)
					break;
				System.out.print(dan + "x" + times + "=" + (dan*times) + "\t");
			}
			System.out.println();
		}
	}

}
