package by.htp.les04.main;

public class Task1 {

	public static void main(String[] args) {
		int[][] matrix = { {1, 2, 3},
						   {4, 5, 6},
						   {7, 8, 9}};
		
		System.out.println("Матрица: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Главная диагональ матрицы: ");
		for (int i = 0; i < matrix.length; i++) {
			System.out.print(matrix[i][i] + " ");
		}
	}

}
