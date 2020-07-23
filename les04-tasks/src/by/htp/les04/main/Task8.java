package by.htp.les04.main;

public class Task8 {

	public static void main(String[] args) {
		int n = 4;
		int[][] matrix = new int[n][n];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = matrix[i].length - 1 - i; j >= 0 ; j--) {
				matrix[i][j] = j + 1 + i;
			}
		}
		
		System.out.println("Сформированная матрица: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
