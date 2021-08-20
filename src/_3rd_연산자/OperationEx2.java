package _3rd_연산자;

public class OperationEx2 {

	public static void main(String[] args) {
		/*
		 * 복합 대입 연산자 : 대입 연산자와 다른 연산자를 조합해 하나의 연산자처럼 사용하는 연산자.
		 += : 두 항의 값을 더해서 왼쪽 항에 대입
		 Ex) num1 += 2 
		 num1 = num1+2 와 같음
		 Cf) +=, -=, *=, /=, %= 와 같이 사용함
		 <<= : 비트를 왼쪽으로 이동하고 그 값을 왼쪽 항에 대입
		 Ex) num <<= 2;
		 num = num << 2; 와 같음
		 >>= : 비트를 오른쪽으로 이동하고 그 값을 왼쪽 항에 대입 (왼쪽에 채워지는 비트 값은 부호 비트와 동일.)
		 >>>= : 비트를 오른쪽으로 이동하고 그 값을 왼쪽 항에 대입 (왼쪽에 채워지는 비트 값은 0임.)
		 Cf) &=, |=, ^= 와 같은 연산도 있음
		 */
		
		// 조건 연산자 ▶ 조건식 ? 결과1 : 결과2
		int fatherAge = 2021-1968+1;
		int motherAge = 2021-1972+1;
		
		char ch;
		ch = (fatherAge > motherAge ? 'T':'F');
		System.out.println(ch);
		
		
		/*
		 * 비트 연산자 ▶ 비트 단위로 &,|,^,~ 연산이 있음
		 ① &(and)연산자 : 두 개의 비트 값이 모두 1인 경우에만 연산의 결과 값이 1이 됨.
		 ② |(or)연산자 : 두 개의 비트 중 하나만 1이면 결과 값이 1.
		 ③ ^(xor)연산자 : 같은 값이면 0, 다른 값이면 1.
		 ④ ~(not)연산자 : 0은 1로, 1은 0으로 ,,
		 Ex) int num = 10;
		 int result = ~num;
		 */
		
		
		
		/*
		 * 비트 이동 연산자 (<<, >>, >>>)
		 * 책을 참조하면서 다시 이해하는게 좋음
		 */
		
		int num = 0b00000101; //5를 8비트 이진수로 표현
		
		System.out.println(num << 2);
		System.out.println(num >> 2);
		System.out.println(num >>> 2);
		System.out.println(num);
// 연산자 우선 순위 : 산술, 관계, 논리, 대입 순서로 우선순위를 가짐		
		
		
	}
}
