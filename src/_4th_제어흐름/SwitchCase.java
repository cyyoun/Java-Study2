package _4th_�����帧;

class SwitchCase {

	public static void main(String[] args) {

		int ranking = 1;
		char medalColor;

		switch(ranking) {
		case 1 : medalColor = 'G';
			break;								// ��break ���� switch-case�� ������ ���߰� ������������ ����!
		case 2 : medalColor = 'S';
			break;
		case 3 : medalColor = 'B';
			break;
		default : 
			medalColor = 'A';
		}
		System.out.println(ranking + "�� �޴��� ������ " + medalColor + " �Դϴ�.");
		/****************************************************************************/
		
		int day;
		int month = 6;
		
		switch(month) {
		case 1 : day = 31;
			break;
		case 2 : day = 28;
			break;
		case 3 : day = 31;
			break;
		case 4 : day = 30;
			break;
		case 5 : day = 31;
			break;
		case 6 : day = 30;
			break;
		case 7 : day = 31;
			break;
		case 8 : day = 31;
			break;
		case 9 : day = 30;
			break;
		case 10 : day = 31;
			break;
		case 11 : day = 30;
			break;
		default :						//�� �̷��� �� �ϸ� day�� �⺻��(?)�� ���� ������ day�� ���� �߻�. ���� day ���� �������� �⺻���� �־��ִ��� default ���� ��������� ��	
			day = 31;
		}
		System.out.println(month +"������ " +day +"���� �ֽ��ϴ�.");
		
		
		//�� �̷��� case ���� �ٿ��� ����� ���� ����!!
		
		switch(month) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : day = 31;
			break;
		case 4 : case 6 : case 9 : case 11 : day = 30;
			break;
		case 2 : day = 28;
			break;
		}
		System.out.println(month +"������ " +day +"���� �ֽ��ϴ�.");
		
	}
}
