package _5th_클래스와객체_3;
// this 예약어 
public class ThisExample {
//this : 생성된 인스턴스 스스로를 가리키는 예약어
	public static void main(String[] args) {
		
		Birthday b = new Birthday();
		b.setYear(1995);
		System.out.println(b);
		b.printThis();
	}
	
}


// Birthday 클래스 생성
class Birthday{
	int day;
	int month;
	int year;

	public void setYear(int year) { //setYear 메서드 생성 
		this.year = year;
	}
	 
	public void printThis() {
		System.out.println(this);
	}
}

