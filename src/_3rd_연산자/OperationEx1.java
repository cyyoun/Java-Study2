package _3rd_연산자;
/* 항과 연산자
 * Ex) 3+4 에서 3과 4는 항이고 +는 연산자
연산자는 항의 개수에 따라 단항 연산자, 이항 연산자, 삼항 연산자로 분류
Ex) 단항 연산자 : ++num;
	이항 연산자 : num1 + num2;
	삼항 연산자 : (5>3)?1:0;
*/
public class OperationEx1 {

	public static void main(String[] args) {
		int mathScore = 100;
		int engScore = 95;
		
		int totalScore = mathScore+engScore;
		System.out.println(totalScore);
		
		double avgScore = totalScore / 2.0 ; //2.0 이렇게 소수점 한 자리까지 나타내야지 소수점 첫번째 자리까지 결과가 출력됨!
		System.out.println(avgScore);
				
		/* 증가 감소 연산자
		val = ++num : num에 1을 증가한 후 val 변수에 대임
		val = num++ : val 변수에 num 값을 먼저 대입한 후 num값 1증가
		*/
		
		int gameScore = 180;
		
		int lastScore1 = ++gameScore;
		System.out.println("lastScore1 : "+lastScore1);
		
		int lastScore2 = --gameScore;
		System.out.println("lastScore2 : "+lastScore2);
		
		/* 관계 연산자
		>, <, >=, <=, ==, !=
		관계연산자를 사용할 때 괄호를 사용해서 가독성이 좋게 만들자!
		
		* 논리 연산자
		&&(논리 곱) : 두 항이 모두 참인 경우에만  참
		||(논리 합) : 두 항 중 하나만 참이면 참
		! (부정) : 단항 연산자라능. 참인 경우 거짓 거짓인 경우 참으로 변경
		*/
		
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10); // 논리 곱, 앞의 항이 거짓이므로 뒤의 항은 실행하지 않음
		System.out.println("value : "+value);
		System.out.println("num1 : "+num1);
		System.out.println("i : "+i); //값이 그대로라능
		
		value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10); // 논리 합, 앞의 항이 참이므로 뒤의 항은 실행하지 않음.
		System.out.println("value : "+value);
		System.out.println("num1 : "+num1);
		System.out.println("i : "+i); //얘도 값이 그대로징
		
		
	}

}
