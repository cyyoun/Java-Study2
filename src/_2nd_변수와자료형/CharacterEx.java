package _2nd_변수와자료형;

public class CharacterEx {

	public static void main(String[] args) {
		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1); //강제로 형변환
		
		char ch2 = 66; //문자형이라면서 어떻게 정수값이 대입될 수가 있지?
		System.out.println(ch2); // B 출력
		
		int ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3);
		
		//int가 32비트, char가 16비트
		
		char ch4 = '윤'; //한 글자밖에 안 돼;
		char ch5 = '\uCC44';
		char ch6 = '\uC601'; //유니코드
		System.out.println(ch4);
		System.out.println(ch5);
		System.out.println(ch6);
		
		int a = 65;
		int b= -66;
		
		char a2 = 65;
		//char b2 = -66; 문자형 변수에 음수를 넣으면 오류 발생
		
		System.out.println((char)a);
		System.out.println((char)b); // ?출력 → ?는 알 수 없는 문자라는 의미
		System.out.println(a2);
	}

}
