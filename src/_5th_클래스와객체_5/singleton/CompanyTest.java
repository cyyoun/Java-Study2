package _5th_클래스와객체_5.singleton;

public class CompanyTest {
	public static void main(String[] args) {
		// 클래스 이름으로 getInstance() 호출하여 참조 변수에 대입
		Company myCom1 = Company.getInstance();
		Company myCom2 = Company.getInstance();
		
		System.out.println(myCom1.getInstance() == myCom2.getInstance());
		

	}

}
