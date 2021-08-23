package _5th_클래스와객체_2;
//정보 은닉. 접근 제어자
/*
 * public : 외부 클래스 어디에서나 접근할 수 있음
 * private : 같은 클래스 내부에서만 접근할 수 있음.
 * protected : 같은 패키지 내부와 상속 관계의 클래스에서만 접근할 수 있고 그 외 클래스에서는 접근할 수 없음. 
*/
public class PersonTest {

	public static void main(String[] args) {
		Person personYoun = new Person();
		personYoun.setPersonName("윤채영");

		System.out.println(personYoun.getPersonName());
	}
}

