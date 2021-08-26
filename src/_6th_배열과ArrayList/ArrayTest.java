package _6th_배열과ArrayList;

public class ArrayTest {
	public static void main(String[] args) {
		// 자료형[] V 배열 이름 = new V 자료형[개수];
		// 자료형 V 배열 이름[] = new V 자료형[개수]; 
	//자바에서 배열을 선언하면 그와 동시에 각 요소의 값이 초기화 됨.
	/*	
	 int[] studentID = new int[] {101, 102, 103} 
	 ▶ 개수는 생략	       new int[3] {101, 102, 103} → 오류 발생

	 int[] studentID = {101, 102, 103}
	 ▶ new int[] 부분 생략 가능

	 int [] studentID;
	 studentID = new int[] {101, 102, 103}
	 ▶ 배열의 자료형을 먼저 선언하고 초기화하는 경우에는 new int[] 를 생략할 수 없음.	
		
	*/
		
		double[] data = new double[5];
		
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;
		
		for(int i = 0; i<data.length; i++) {
			System.out.println(data[i]); //배열에 저장되지 않은 값은 0.0 으로 초기화값이 출력됨
		}
		
		
	}
}
