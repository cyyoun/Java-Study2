package _5th_클래스와객체_5;

public class Student2 {
	private static int serialNum = 1000;	//private static
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public Student2() {
		serialNum++;
		studentID = serialNum;
	}
	
	// 클래스 메서드 내부에서는 인스턴스 변수를 사용할 수 없음!!
	// 지역변수와 클래스변수(정적변수)는 사용 가능~~
	public static int getSerialNum() {	//static
		int i = 10;	//지역변수라서 가능 : 메서드가 끝나면 사라지는 변수
//		studentName = "채영";	//인스턴스변수(멤버변수)라서 불가능 : static인 경우 불가능!
		return serialNum;
	}
	public static void setSerialNum(int serialNum) {	//static
		Student2.serialNum = serialNum;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	

}
