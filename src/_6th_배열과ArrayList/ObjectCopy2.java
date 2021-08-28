package _6th_�迭��ArrayList; ////���� ���� : �ν��Ͻ� �ּҸ� ����. 

public class ObjectCopy2 {

	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];

		bookArray1[0] = new Book("�¹���", "������");
		bookArray1[1] = new Book("���̾�", "�츣�� �켼");
		bookArray1[2] = new Book("��� �� ���ΰ�", "���ù�");
		
		//���� ����@
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);

		for (int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		/////��������� �迭 ����
		
		/////���� ���� >>> ���縦 �ּ� ���� �����Ѵٰ� �ؼ� ���� ����(shallow copy)��� ��.
		bookArray1[0].setBookName("����");
		bookArray1[0].setAuthor("�ڿϼ�");
		
		System.out.println("===bookArray1===");
		for(int i=0; i<bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		System.out.println("===bookArray2===");
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
			//bookArray2 �迭 ��Ұ��鵵 ����ż� ���!!
			//�� ������ ��ü �迭�� ��ҿ� ����� ���� �ν��Ͻ� ��ü�� �ƴϰ� �ν��Ͻ��� �ּ� ���̱� ����!
			//���� ��ü �迭�� ������ �� �ν��Ͻ��� ���� �����ϴ� �� �ƴ϶� ���� �ν��Ͻ��� �ּ� ���� ����
		}
	}

}
