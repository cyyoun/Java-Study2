package _5th_클래스와객체;
/////////////////////////////////////클래스, 객체, 인스턴스 정리_2
/* 클래스 내부에 main() 함수 포함하기.
▶ 클래스 내부에 main() 함수를 만들면 이 클래스가 프로그램의 시작 클래스가 됨.
*/
public class Student {
		int studentID;
		String studentName;
		int grade;
		String address;
		
	public String getStudentName() { //메서드 = 멤버 함수 = 클래스 내부의 멤버함수(메서드)는 멤버 변수를 사용하여 클래스 내부 기능 구현
		return studentName;
	}

	public static void main(String[] args) {
		//new 예약어로 클래스 생성하기!
		Student studentYoun = new Student(); //Student 클래스 생성
		studentYoun.studentName = "윤채영"; //클래스의 멤버 변수에 값을 대입
		
		System.out.println(studentYoun.studentName);
		System.out.println(studentYoun.getStudentName());
	}

}
