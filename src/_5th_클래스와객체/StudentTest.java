package _5th_클래스와객체;
/////////////////////////////////////클래스, 객체, 인스턴스 정리_3
public class StudentTest {

	public static void main(String[] args) {
		// 이렇게 생성된 클래스를 '인스턴스' 라고 함. //인스턴스(studentYoun) = 객체 = 클래스가 생성됨 = 메모리 공간을 할당받음 
		// 인스턴스를 가리키는 클래스형 변수를 '참조변수' 라고 함 ▶ studentYoun	
		//new 예약어로 Student 클래스 생성하기!
		Student studentYoun = new Student(); // ▶ 클래스가 생성된다는 뜻은 실제 사용할 수 있도록 메모리가 공간(힙 메모리)을 할당 받은 상태임(즉, 이것을 인스턴스라고 함.)
		//클래스형	   참조변수
		studentYoun.studentName = "윤채영"; //studentYoun 참조 변수로 studentName 멤버 변수에 이름을 저장함.
		
		
		System.out.println(studentYoun.studentName); // ▶ 멤버변수 사용		
		System.out.println(studentYoun.getStudentName()); // ▶ 메서드 사용
		
		/* 인스턴스와 힙 메모리
		 new Student()를 선언하면 Student 하나가 생성되는데 Student는 studentID, studentName 등의 멤버 변수를 가지고 있음.
		 이 변수들을 저장하기 위해 사용하는 메모리가 힙 메모리(heap memory) → 동적 메모리, 자바에서는 가비치 컬렉터가 자동으로 메모리를 해제해 줌.
		 즉 클래스 생성자를 하나 호출하면 인스턴스가 힙 메모리에 생성되는 것임.
		*/
		
		/* studentYoun → Student 클래스 생성
		 * (스택 메모리)  →  (힙 메모리) 	
		studentYoun 은 지역변수(함수 내부에서만 사용하는 변수). 지역변수는 스택 메모리에 생성. 그리고 인스턴스는 힙 메모리에 생성
		지역 변수 studentYoun에 생성된 인스턴스를 대입하는 것은 studentYoun에 인스턴스가 생성된 힙 메모리의 주소를 대입하는 것과 같은 의미.....!
		*/
		
		
		Student student1 = new Student();
		student1.studentName = "차정두";
		Student student2 = new Student();
		student2.studentName = "윤채영";
		
		System.out.println(student1);  // 참조 변수 값 출력..!!  
		System.out.println(student2);
		/* 출력 결과 ▶ _5th_클래스와객체.Student@8efb846
		 '클래스 이름@주소 값', 주소 값 = 해시코드(Hash Code) 값
		 student1 변수를 사용하여 student1 인스턴스를 참조할 수 있음.
		 이 때 student1 을 참조 변수, 주소 값을 참조 값이라고 함.
		 */
		
		/* 참조 변수와 참조 값
		참조 변수는 힙 메모리에 생성된 인스턴스르 가리킴   ★☆★☆
		힙 메모리에 생성된 인스턴스의 메모리 주소는 참조 변수에 저장됨.
		*/
	
	
	//정리 
	/*
	 1. 객체 : 객체 지향 프로그램의 대상, 생성된 인스턴스
	 2. 클래스 : 객체를 프로그래밍하기 위해 코드로 만든 상태
	 3. 인스턴스 : 클래스가 메모리에 생성된 상태
	 4. 멤버 변수 : 클래스의 속성, 특성, 인스턴스 변수
	 5. 메서드 : 멤버 변수를 이용하여 클래스의 기능 구현
	 6. 참조 변수 : 메모리에 생성된 인스턴스를 가리키는 변수
	 7. 참조 값 : 생성된 인스턴ㅅ의 메모리 주소 값
	*/
	}
}
