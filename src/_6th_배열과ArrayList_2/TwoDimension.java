package _6th_배열과ArrayList_2;

public class TwoDimension {

	public static void main(String[] args) {
//		int[][] arr = new int[2][3]; 이게 2차원 배열 형태
//		int[][] arr = {{1,2,3},{4,5,6}};
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9,0}};
//					=[2][3]
		
		
		for(int i=0; i<arr.length; i++) { 
			
			for(int j=0; j<arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
			System.out.println();
			
		}
		
	}

}
