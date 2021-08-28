package _5th_클래스와객체_5;

public class Student1 {
	
	// statice 변수 = 정적 변수 = 클래스 변수
	public static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	/* static 변수
	 인스턴스를 생성할 때마다 만들어지는 것이 아니고 클래스를 선언할 때 특정 메모리에 저장되어 모든 인스턴스가 공유하는 변수
	 static 변수는 프로그램이 시작할 때부터 끝날 때까지 메모리에 상주하므로 크기가 너무 큰 변수를 static으로 선언하는 것은
	 좋지 않음!
	*/
}
