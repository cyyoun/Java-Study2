package _4th_제어흐름;

public class PracticeTest_1 {

	public static void main(String[] args) {

// Q1 operator 값이 +, -, *, / 인 경우에서 사칙 연산을 수행하는 프로그램을 if-else if문과 switch-case문을 사용하여 작성하세요.
		int num1 = 10;
		int num2 = 2;
		char operator = '*';
		
		if(operator == '+') {
			System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
		}else if(operator == '-'){
			System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
		}else if(operator == '*'){
			System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
		}else if(operator == '/'){
			System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
			
		}
		
		switch(operator) {
		case '+' :  
			System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
			break;
		case '-' :  
			System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
			break;
		case '*' :  
			System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
			break;
		case '/' :  
			System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
			break;
		}
	}
}
