package _2nd_변수와자료형;

/*형 변환 기본 원칙
 ① 바이트 크기가 작은 자료형에서 큰 자료형으로 형 변환은 자동으로 이루어진다.
 ② 덜 정밀한 자료형에서 더 정밀한 자료형으로 형 변환은 자동으로 이루어진다.
 정수 ―――――――――――――――――――――――――――――――▶  실수
 byte		short		int		long		 float	double
 			char		
 (1byte)	(2byte)		(4byte)	(8byte)		(4byte)	(8byte)
묵시적 형 변환(자동 형 변환) : 화살표 방향
명시적 형 변환(강제 형 변환) : 화살표 반대 방향, 자료 손실이 발생할 수 있음

*/
public class ImplicitConversion {
	public static void main(String[] args) {
		byte bNum =10;
		int iNum = bNum;
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2;
		System.out.println(fNum);
		
		double dNum;
		dNum = iNum + iNum2; //자동으로 형변환 됨.
		System.out.println(dNum);
		
	}

}
