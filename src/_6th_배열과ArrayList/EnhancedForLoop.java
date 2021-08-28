package _6th_배열과ArrayList;

//향상된 for문 : 배열의 처음에서 끝까지 모든 요소를 참조할 때 사용하면 편리한 반복
public class EnhancedForLoop {
	public static void main(String[] args) {
		String[] strArray = { "Java", "Android", "C", "JavaScript", "Ptyhon" };

		for (String str : strArray) { 
			System.out.println(str);
		}
		for(int i=0; i<strArray.length; i++) {
			System.out.println(strArray[i]);
		}
	}
}
