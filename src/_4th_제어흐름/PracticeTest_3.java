package _4th_제어흐름;

public class PracticeTest_3 {

	public static void main(String[] args) {
		// 구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 프로그램을 만들어 보세요.
		int dan;
		int times;
		
		for(dan=2; dan<=9; dan++) {
			for(times=1; times<=9; times++) {
				if(times>dan)
					break;
				System.out.print(dan + "x" + times + "=" + (dan*times) + "\t");
			}
			System.out.println();
		}
	}

}
