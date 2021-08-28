package _6th_�迭��ArrayList_2;

import java.util.ArrayList;

import _6th_�迭��ArrayList.Book;

public class ArrayListTest {
	public static void main(String[] args) {
		//add() �޼���� �迭 ���̿� ������� ��ü�� �߰� ����
		/*
		 * ArrayList ����
		 * ArrayList<�ڷ���> �迭�̸� = new ArrayList<�迭�̸�>();
		 */
		
		ArrayList<Book> library = new ArrayList<Book>();
		library.add( new Book("�¹���", "������"));
		library.add( new Book("���̾�", "�츣�� �켼"));
		library.add(new Book("��� �� ���ΰ�", "���ù�"));
		library.add(new Book("����", "�ڰ渮"));
		library.add(new Book("�����", "�������丮"));

		ArrayList<String> test = new ArrayList<String>();
		test.add(null);
		library.remove(4);
		System.out.println(test.isEmpty());
		
		
		for(int i=0; i<library.size(); i++) {
			Book book = library.get(i);
			book.showBookInfo();
		}
		System.out.println();
		
		System.out.println("===���� for��===");
		for(Book book : library) {
			book.showBookInfo();
		}
		
	}

}
