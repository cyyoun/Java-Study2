package _4th_�����帧;

public class PracticeTest_1 {

	public static void main(String[] args) {

// Q1 operator ���� +, -, *, / �� ��쿡�� ��Ģ ������ �����ϴ� ���α׷��� if-else if���� switch-case���� ����Ͽ� �ۼ��ϼ���.
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
