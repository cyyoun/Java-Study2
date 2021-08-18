package _2nd_변수와자료형;

public class ExplicitConversion {

	public static void main(String[] args) {
		/*
		 * 명시적 형 변환 : 바이트 크기가 큰 자료형에서 작은 자료형으로 대입하는 경우, 자료 손실 발생할 수 있음. 더 정밀한 자료형에서 덜
		 * 정밀한 자료형으로 대입하는 경우임.
		 */
		double dNum = 1.2;
		float fNum = 0.9f;
		
		int iNum1 = (int)dNum + (int)fNum; //1, 두 실수가 각각 형 변환되어 더해짐
		int iNum2 = (int)(dNum+fNum);	//2, 두 실수의 합이 먼저 계산되고 형 변환됨. 
		System.out.println(iNum1);
		System.out.println(iNum2);
		//같은 연산이라도 형 변환이 언제 이루어졌는지에 다라 그 결과 값이 다르게 나타날 수 있음.
	}

}
