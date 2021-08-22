package _5th_클래스와객체;

/////////////////////////////////////생성자_2
public class PersonTest {

	public static void main(String[] args) {
		// ▼디폴트 생성자로 클래스를 생성한 후 인스턴스 변수 값을 따로 초기화!!!
		Person personYoun = new Person(); //Person()와 같은 함수를 '생성자'라고 함 
		//생성자는 클래스를 처음 만들 때 멤버 변수나 상수를 초기화 하는 것!, 생성자는 클래스를 생성할 때만 호출.
		//생성자 이름은 클래스 이름과 같고, 생성자는 반환 값이 없
		personYoun.name = "윤채영";
		personYoun.height = 161.7f;
		personYoun.weight = 55.7f;
		
		Person personCha = new Person("차정두", 184f, 78.0f); //인스턴스를 변수 초기화와 동시에 클래스 생성
		System.out.println(personCha.name);
		
		
		
	}

}
