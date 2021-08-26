package _5th_클래스와객체_5.singleton;

public class Company {
	private static Company instance = new Company(); // 2. 클래스 내부에 static으로 유일한 인스턴스 생성하기
	private Company() {} // 1. 생성자를 private으로 만들기

	// 3. 외부에서 참조할 수 있는 public 메서드 만들기
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
	
}
