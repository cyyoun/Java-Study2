package _4th_제어흐름;

class SwitchCase {

	public static void main(String[] args) {

		int ranking = 1;
		char medalColor;

		switch(ranking) {
		case 1 : medalColor = 'G';
			break;								// ▶break 문은 switch-case의 수행을 멈추고 빠져나가도록 만듦!
		case 2 : medalColor = 'S';
			break;
		case 3 : medalColor = 'B';
			break;
		default : 
			medalColor = 'A';
		}
		System.out.println(ranking + "등 메달의 색상은 " + medalColor + " 입니다.");
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
		default :						//▶ 이렇게 안 하면 day의 기본값(?)이 없기 때문에 day에 오류 발생. 위에 day 변수 설정에서 기본값을 넣어주던가 default 값을 설정해줘야 함	
			day = 31;
		}
		System.out.println(month +"월달은 " +day +"까지 있습니다.");
		
		
		//▶ 이렇게 case 문을 줄여서 사용할 수도 있음!!
		
		switch(month) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : day = 31;
			break;
		case 4 : case 6 : case 9 : case 11 : day = 30;
			break;
		case 2 : day = 28;
			break;
		}
		System.out.println(month +"월달은 " +day +"까지 있습니다.");
		
	}
}
