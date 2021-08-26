package _5th_클래스와객체_4;
//객체 간 협력
public class Student {
	public String studentName;
	public int grade;
	public int money;
	
	
	

	public Student(String name, int money) {
		this.studentName = name;
		this.money = money;
	}
	
	public void takeBus(Bus bus) { //Bus bus : 자료형이 Bus 클래스야!
		bus.take(1000); // 이렇게 쓰이는군 큼큼!
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "입니다.");
	}
}
