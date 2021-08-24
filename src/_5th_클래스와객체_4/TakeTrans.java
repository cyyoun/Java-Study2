package _5th_클래스와객체_4;

public class TakeTrans {
	public static void main(String[] args) {
		Student studentYoun = new Student("윤채영", 10000);
		Student studentCha = new Student("차정두", 12000);
		
		Bus bus100 = new Bus(100);
		studentYoun.takeBus(bus100);
		studentYoun.showInfo();
		bus100.showInfo();

		
		Subway subwayGreen = new Subway("2호선");
		studentCha.takeSubway(subwayGreen);
		studentCha.showInfo();
		subwayGreen.showInfo();
		
	}

}
