package _5th_클래스와객체_4;

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
		System.out.println(lineNumber + "의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다.");
	}

}
