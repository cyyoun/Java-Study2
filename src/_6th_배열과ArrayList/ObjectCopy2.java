package _6th_배열과ArrayList; ////얕은 복사 : 인스턴스 주소만 복사. 

public class ObjectCopy2 {

	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];

		bookArray1[0] = new Book("태백산맥", "조정래");
		bookArray1[1] = new Book("데미안", "헤르만 헤세");
		bookArray1[2] = new Book("어떻게 살 것인가", "유시민");
		
		//얕은 복사@
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);

		for (int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		/////여기까지가 배열 복사
		
		/////얕은 복사 >>> 복사를 주소 값만 복사한다고 해서 얕은 복사(shallow copy)라고 함.
		bookArray1[0].setBookName("나무");
		bookArray1[0].setAuthor("박완서");
		
		System.out.println("===bookArray1===");
		for(int i=0; i<bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		System.out.println("===bookArray2===");
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
			//bookArray2 배열 요소값들도 변경돼서 출력!!
			//그 이유는 객체 배열의 요소에 저장된 값은 인스턴스 자체가 아니고 인스턴스의 주소 값이기 때문!
			//따라서 객체 배열을 복사할 때 인스턴스를 따로 생성하는 게 아니라 기존 인스턴스의 주소 값만 복사
		}
	}

}
