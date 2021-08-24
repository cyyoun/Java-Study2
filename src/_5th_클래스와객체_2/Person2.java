package _5th_클래스와객체_2;
//정보 은닉. 접근 제어자
public class Person2 {
	int age;
	private String personName;
	int height;
	String address;
	
	// private 으로 선언한 personName 을 외부 코드에서 사용하기 위해 get(), set() 메서드 생성
	// 단축키 : shift + alt + S + R
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
}
