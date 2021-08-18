package _2nd_변수와자료형;

public class BooleanEx {
	public static void main(String[] args) {
		boolean isMarried = true; //변수 지정, 초기화 동시 진행
		System.out.println(isMarried);

		var num =10;
		System.out.println(num);
		/*
		 * JAVA 10 부터 자료형 없이 변수 선언 가능해짐.
		 * 그러나 한 번 선언한 자료형 변수는 다른 자료형으로 사용 불가능 Ex) String으로 쓰면 int로 변경 불가
		 * var로 자료형 없이 변수를 선언하는 방법은 '지역변수'만 가능
		 */
	}
}

