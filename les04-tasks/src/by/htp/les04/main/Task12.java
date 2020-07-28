package by.htp.les04.main;

import java.util.Random;

public class Task12 {

	public static void main(String[] args) {
		int iRand;
		Random rand = new Random();
		int n = rand.nextInt(10) + 1;
		// m (строки) в диапазоне [n-1, 10] потому, что если m < n-1, то будет столбец, где просто не поместится нужно кол-во единиц
		int m = rand.nextInt(10 - n + 2) + n - 1;
		int[][] matrix = new int[m][n];

		for (int j = 1; j < matrix[0].length; j++) {
			for (int k = 0; k < j; k++) {
				do {
					iRand = rand.nextInt(matrix.length);
				} while (matrix[iRand][j] != 0);
				matrix[iRand][j] = 1;
			}
		}
		
		printMatrix(matrix);
	}
	
	public static void printMatrix(int[][] matrix) {
		System.out.println("Матрица " + matrix.length + "x" + matrix[0].length + ":");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("[%1d] ", matrix[i][j]);
			}
			System.out.println();
		}
	}
}
