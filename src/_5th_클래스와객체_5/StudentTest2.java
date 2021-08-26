package _5th_클래스와객체_5;


public class StudentTest2 {

	public static void main(String[] args) {
		Student2 youn = new Student2();
		youn.setStudentName("윤채영");
		System.out.println(Student2.getSerialNum()); 
		//위의 코드와 같이 Student2 클래스 명으로 직접 참조할 수도 있음.
		//static 변수는 클래스 이름으로 직접 참조!
		System.out.println(youn.studentName + " 학번 : " + youn.studentID);
		
		
		Student2 cha = new Student2();
		cha.setStudentName("차정두");
		System.out.println(cha.getSerialNum()); // 이렇게 노란색 줄은 변수가 static 이니 클래스 이름으로 직접 참조하라는 뜻
		System.out.println(cha.studentName + " 학번 : " + cha.studentID);

		//정적 변수는 클래스 메서드와 클래스 변수는 인스턴스가 생성되지 않아도 사용할 수 있음
		System.out.println("인스턴스 없이 호출 가능 : " + Student2.getSerialNum());
	}

}
