package _4th_제어흐름;

public class PracticeTest_2 {

	public static void main(String[] args) {

		//구구단을 짝수 단만 출력하도록 프로그램을 만들어 보세요.
		int dan;
		int times;
		
		for(times=1; times<=9; times++) {
			for(dan=2; dan<=9; dan++) {
				if(dan%2!=0)
					continue;
				System.out.print(dan + "x" + times +"=" +(dan*times) +"\t");
			}
			System.out.println();
		}
	}

}
