package _5th_클래스와객체_3;
// this 예약어 
public class ThisExample {	//한 파일에 클래스가 2개 이상인 경우도 있긴 하지만 public class는 하나뿐임
	
//this : 생성된 인스턴스 스스로를 가리키는 예약어
	public static void main(String[] args) {
		
		Birthday b = new Birthday(); //인스턴스 생성
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
		this.year = year;	//b.year = year; 과 같다는데..!
		
	}
	 
	public void printThis() { //printThis() 라는 또 다른 메서드 생성
		System.out.println(this); //클래스 코드에서 사용하는 THIS는 생성된 인스턴스 자신을 가리키는 역할을 함............이게 무슨말..?
		//System.out.println(b); 와 같다는데..! 
	}
}

