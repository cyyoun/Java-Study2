package _6th_�迭��ArrayList_2;

public class TwoDimension {

	public static void main(String[] args) {
//		int[][] arr = new int[2][3]; �̰� 2���� �迭 ����
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
