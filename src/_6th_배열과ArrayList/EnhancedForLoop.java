package _6th_�迭��ArrayList;

//���� for�� : �迭�� ó������ ������ ��� ��Ҹ� ������ �� ����ϸ� ���� �ݺ�
public class EnhancedForLoop {
	public static void main(String[] args) {
		String[] strArray = { "Java", "Android", "C", "JavaScript", "Ptyhon" };

		for (String str : strArray) { 
			System.out.println(str);
		}
		for(int i=0; i<strArray.length; i++) {
			System.out.println(strArray[i]);
		}
	}
}
