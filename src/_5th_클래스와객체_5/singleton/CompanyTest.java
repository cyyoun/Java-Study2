package _5th_Ŭ�����Ͱ�ü_5.singleton;

public class CompanyTest {
	public static void main(String[] args) {
		// Ŭ���� �̸����� getInstance() ȣ���Ͽ� ���� ������ ����
		Company myCom1 = Company.getInstance();
		Company myCom2 = Company.getInstance();
		
		System.out.println(myCom1.getInstance() == myCom2.getInstance());
		

	}

}
