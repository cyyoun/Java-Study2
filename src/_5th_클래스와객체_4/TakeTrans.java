package _5th_Ŭ�����Ͱ�ü_4;

public class TakeTrans {
	public static void main(String[] args) {
		Student studentYoun = new Student("��ä��", 10000);
		Student studentCha = new Student("������", 12000);
		
		Bus bus100 = new Bus(100);
		studentYoun.takeBus(bus100);
		studentYoun.showInfo();
		bus100.showInfo();

		
		Subway subwayGreen = new Subway("2ȣ��");
		studentCha.takeSubway(subwayGreen);
		studentCha.showInfo();
		subwayGreen.showInfo();
		
	}

}
