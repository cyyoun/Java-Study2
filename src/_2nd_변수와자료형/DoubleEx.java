package _2nd_변수와자료형;

public class DoubleEx {

	public static void main(String[] args) {
		/*
		 * ▶ 부동소수점 방식 : 실수는 정수와 표현 방식이 다르며, 지수와 가수를 구분해서 표현하는데 이 방식이 '부동 소수점 방식'임.
		 * 부동소수점 값을 연산하면 약간의 오차가 발생할 수 있음.
		 * float형 : 부호 1비트, 지수부 8비트, 가수부 23비트로 총 32비트(4바이트) 
		 * double형 : 부호 1비트, 지수부 11비트, 가수부 52비트로 총 64비트(8바이트)
		 */	
		
		double dnum = 3.14;
		float fnum = 3.14f; //f 또는 F 붙여주기
		
		System.out.println(dnum);
		System.out.println(fnum);
		
	}

}
