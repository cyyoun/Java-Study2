package _5th_클래스와객체_5;

public class StudentTest1 {

	public static void main(String[] args) {
		Student1 youn = new Student1();
		youn.setStudentName("윤채영");
		System.out.println(youn.serialNum);
		youn.serialNum++;
		
		Student1 cha = new Student1();
		cha.setStudentName("차정두");
		System.out.println(youn.serialNum);
		System.out.println(cha.serialNum);
		
		
		
		
	
	}

}
