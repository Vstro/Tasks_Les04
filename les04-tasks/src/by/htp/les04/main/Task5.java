package by.htp.les04.main;

public class Task5 {

	public static void main(String[] args) {
		int n = 4;
		int[][] matrix = new int[n][n];
		
		for (int i = 0; i < matrix.length; i++) {
			matrix[i][n - 1 - i] = i + 1;
		}
		
		System.out.println("Сформированная матрица: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[j].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
