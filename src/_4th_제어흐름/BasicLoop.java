package _4th_제어흐름;

public class BasicLoop {
// 반복문 : while, do-while, for문이 있음
	public static void main(String[] args) {
		// while : 조건문이 참인 경우 수행문을 수행하고 , 거짓이면 빠져나옴.
		
		int num = 1;
		int sum = 0;
		
		while(num <= 10) { //(조건식)이 참이면 {} 안의 수행문을 실행
			sum += num;
			num++;
		}
		System.out.println("1부터 10까지 합한 값은 " + sum + "입니다.");
		
		// do-while : while은 조건이 참이 아니면 수행문을 한 번도 실행하지 않음. 그러나 do-while은 중괄호의 수행문을 반드시 한 번 이상 수행함.
		
		int num2 = 1;
		int sum2 = 0; 
		
		do {
			sum2 += num2;
			num2++;
		} while(num2 <= 10 );
		
		System.out.println("1부터 10까지 합한 값은 " + sum2 + "입니다.");
		
		// for : for(초기화식; 조건식; 증감식) { 수행문; } ▶ () 안에 있는 초기화식, 조건식, 증감식, 요소 모두는 생략할 수 있음.	
		int i;
		int sum3 = 0;
		for(i = 1; i <= 10; i ++) {
			sum3 += i;
		}
		System.out.println("1부터 10까지 합한 값은 " + sum3 + "입니다.");
		
		// 중첩된 반복문 (구구단 만들기)
		
		int dan;
		int times;
		
			for(times = 1; times <= 9; times++) {
				for(dan = 2; dan <= 9; dan++) {
				System.out.print(dan + "x" + times + "=" + (dan*times)+"\t");
				}
				System.out.println();
			}
	}
}
