package _5th_Ŭ�����Ͱ�ü_4;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNum) {
		this.busNumber = busNum;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("���� " + busNumber + "���� �°��� " + passengerCount + "���̰�, ������ " + money + "�Դϴ�.");
	}

}
