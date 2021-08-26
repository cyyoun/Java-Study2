package _5th_Ŭ�����Ͱ�ü_5.singleton;

public class Company {
	private static Company instance = new Company(); // 2. Ŭ���� ���ο� static���� ������ �ν��Ͻ� �����ϱ�
	private Company() {} // 1. �����ڸ� private���� �����

	// 3. �ܺο��� ������ �� �ִ� public �޼��� �����
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
	
}
