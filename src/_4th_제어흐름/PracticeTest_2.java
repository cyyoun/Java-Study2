package _4th_�����帧;

public class PracticeTest_2 {

	public static void main(String[] args) {

		//�������� ¦�� �ܸ� ����ϵ��� ���α׷��� ����� ������.
		int dan;
		int times;
		
		for(times=1; times<=9; times++) {
			for(dan=2; dan<=9; dan++) {
				if(dan%2!=0)
					continue;
				System.out.print(dan + "x" + times +"=" +(dan*times) +"\t");
			}
			System.out.println();
		}
	}

}
