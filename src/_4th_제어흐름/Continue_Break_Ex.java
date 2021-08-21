package _4th_제어흐름;

public class Continue_Break_Ex {

	public static void main(String[] args) {
// continue : 반복문과 함께 쓰이고 반복문 안에서 continue문을 만나면 이후의 문장은 수행하지 않고 for문의 처음으로 돌아가 증감식을 수행.
		
		int i;
		int sum = 0;
		for(i = 1; i <= 100; i++) {
			if(i % 2 == 0)						// ▶ 참 이상하게도 세미콜론이나 중괄호가 있으면 안됨..!
				continue;
				sum += i;
			
		}
		System.out.println("1부터 100까지 홀수들의 합은 " + sum + "입니다.");
	
// break : switch-case 문에서 사용했듯이 반복문, 조건문에서 break를 사용하면 그 지점에서 더 이상 수행문을 반복하지 않음.
		int num;
		int total = 0;
		for(num=1; total<100; num++) {
			total += num;
		}
		System.out.println("num :" + num);
		System.out.println("total :" + total);
		
		int num2;
		int total2 = 0;
		for(num2=1; ; num2++) {
			total2 += num2;
			if(total2 > 100) {
				break;
			}
		}
		System.out.println("num2 :" + num2);
		System.out.println("total2 :" + total2);
	}
}
