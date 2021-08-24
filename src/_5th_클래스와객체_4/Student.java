package _5th_Å¬·¡½º¿Í°´Ã¼_4;
//°´Ã¼ °£ Çù·Â
public class Student {
	public String studentName;
	public int grade;
	public int money;
	
	
	public Student(String name, int money) {
		this.studentName = name;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	
	public void showInfo() {
		System.out.println(studentName + "´ÔÀÇ ³²Àº µ·Àº " + money + "ÀÔ´Ï´Ù.");
	}
}
