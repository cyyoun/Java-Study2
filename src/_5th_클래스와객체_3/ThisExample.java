package _5th_Ŭ�����Ͱ�ü_3;
// this ����� 
public class ThisExample {	//�� ���Ͽ� Ŭ������ 2�� �̻��� ��쵵 �ֱ� ������ public class�� �ϳ�����
	
//this : ������ �ν��Ͻ� �����θ� ����Ű�� �����
	public static void main(String[] args) {
		
		Birthday b = new Birthday(); //�ν��Ͻ� ����
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
		this.year = year;	//b.year = year; �� ���ٴµ�..!
		
	}
	 
	public void printThis() { //printThis() ��� �� �ٸ� �޼��� ����
		System.out.println(this); //Ŭ���� �ڵ忡�� ����ϴ� THIS�� ������ �ν��Ͻ� �ڽ��� ����Ű�� ������ ��............�̰� ������..?
		//System.out.println(b); �� ���ٴµ�..! 
	}
}

