package _2nd_변수와자료형;

public class Constant {

	public static void main(String[] args) {
//변수는 변하는 수라면 상수는 변하지 않는 값!
// ▶ 상수는 final 예약어를 사용해 선언
		final int MAX_NUM = 100;
		final int MIN_NUM;
		
		MIN_NUM = 0; //이렇게 초기화 안 하고 사용하면 오류 발생됨!
		
//		MAX_NUM = 99; 상수는 값 변경 불가.
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
	}

}
