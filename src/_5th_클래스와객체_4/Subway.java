package _5th_Ŭ�����Ͱ�ü_4;

public class Subway {
	String lineNumber;
	int passengerCount;
	int money;
	
	public Subway(String lineNum) {
		this.lineNumber = lineNum;
	}
	
	public void take(int money) {
		this.money = money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(lineNumber + "�� �°��� " + passengerCount + "���̰�, ������ " + money + "�Դϴ�.");
	}

}
