package _6th_배열과ArrayList;

public class BookArray {

	public static void main(String[] args) {
		Book[] library = new Book[5]; 
		//배열의 자료형을 클래스형으로 만든 객체 배열임
		
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]); 
		}
	}

}
