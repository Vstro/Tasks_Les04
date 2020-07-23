package by.htp.les04.main;

public class Task4 {

	public static void main(String[] args) {
		int n = 4;
		int[][] matrix = new int[n][n];
		
		System.out.println("Сформированная матрица: ");
		for (int i = 0; i < matrix.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < matrix[i].length; j++) {
					matrix[i][j] = j + 1;
					System.out.print(matrix[i][j] + " ");
				}
			} else {
				for (int j = 0; j < matrix[i].length; j++) {
					matrix[i][j] = n - j;
					System.out.print(matrix[i][j] + " ");
				}
			}
			System.out.println();
		}
	}

}
