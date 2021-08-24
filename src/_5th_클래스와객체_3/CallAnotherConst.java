package _5th_클래스와객체_3;
// 생성자에서 다른 생성자를 호출하는 this

class Person{
	int age;
	String name;
	
	Person(){	//디폴트 생성자가 호출되는 경우 초깃값으로 "이름 없음"과 1 값을 대입하고자 함
		/*
		 * this.name= "noname"; ***주의 해야 할 점
		 생성자는 클래스가 생성될 때 호출되므로 클래스 생성이 완료되지 않은 시점에 다른 코드가 있다면 오류가 발생할 수 있음.
		 즉 디폴트 생성자에서 생성이 완료되는 것이 아니라 this 를 사오ㅛㅇ해 다른 생성자를 호출하므로, 이때는 this를 활용한 문장이 먼저 와야 함.
		 */
		this("이름 없음", 1); //this를 사용해 Person(String, int) 생성자 호출
	}
	
	Person(String name, int age){ //매개변수를 갖는 생성자
		this.name = name;
		this.age = age;
	}
}

public class CallAnotherConst {
	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
	}

}
