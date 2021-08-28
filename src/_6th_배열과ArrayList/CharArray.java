package _6th_배열과ArrayList;

public class CharArray {

	public static void main(String[] args) {

		char[] alphabets = new char[26];
		char ch = 'A';
		System.out.println((char)(ch+1));
		System.out.println(ch+1);
		
		for(int i=0; i<alphabets.length; i++, ch++) {
			alphabets[i] = ch;	//아스키코드로 값 저장
		}
		
		for(int i=0; i<alphabets.length; i++) {
			System.out.println(alphabets[i] + "," + (int)alphabets[i]);
		}
		
	}

}
