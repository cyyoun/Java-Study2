package _6th_�迭��ArrayList;

public class ArrayCopy {

	public static void main(String[] argys) {
		int[] array = {10, 20, 30, 40, 50};
		int[] array2 = {1, 2, 3, 4, 5};
		
		
//		System.arraycopy(������ �迭 �̸�, ������ �迭�� ù ��° ��ġ, �����ؼ� �ٿ� ���� ��� �迭 �̸�, �����ؼ� ��� �迭�� �ٿ� �ֱ⸦ ������ ù ��° ��ġ, ������ ��� ���� );
		System.arraycopy(array, 0, array2, 1, 3);
		
		for(int i=0; i<array2.length; i++) {
			System.out.println(array2[i]);
		}
		
	}

}
