package _5th_Ŭ�����Ͱ�ü_3;
// this ����� 
public class ThisExample {
//this : ������ �ν��Ͻ� �����θ� ����Ű�� �����
	public static void main(String[] args) {
		
		Birthday b = new Birthday();
		b.setYear(1995);
		System.out.println(b);
		b.printThis();
	}
	
}


// Birthday Ŭ���� ����
class Birthday{
	int day;
	int month;
	int year;

	public void setYear(int year) { //setYear �޼��� ���� 
		this.year = year;
	}
	 
	public void printThis() {
		System.out.println(this);
	}
}

