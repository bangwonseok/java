package chapter7_1;

public class ArrayEx8 {
	public static void main(String[] args) {
		//int[][] nums = new int[][] { {1,2,3}, {4,5,6} };
		int[][] nums = { {1,2,3}, {4,5,6}};
		for (int i = 0; i < nums.length; i++) { // Çà 
			for (int j = 0; j < nums[i].length; j++) { // i¹øÂ° ÇàÀÇ j ¿­
				System.out.println(nums[i][j]);
			}
		}
	}
}
