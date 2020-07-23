package by.htp.les04.main;

public class Task6 {

	public static void main(String[] args) {
		int n = 4;
		int[][] matrix = new int[n][n];
		
		for (int i = 0; i < matrix.length; i++) {
			matrix[0][i] = 1;
			matrix[matrix.length - 1][i] = 1;
		}
		for (int i = 1; i < matrix.length - 1; i++) {
			matrix[i][0] = 1;
			matrix[i][matrix.length - 1] = 1;
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
