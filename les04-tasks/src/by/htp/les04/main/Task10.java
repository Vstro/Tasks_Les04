package by.htp.les04.main;

import java.util.Random;

public class Task10 {

	public static void main(String[] args) {
		int size = 5;
		int[][] matrix = new int[size][size];
		
		initMatrix(matrix);
		printMatrix(matrix);

		System.out.println("Положительные элементы главной диагонали матрицы: ");
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][i] > 0) {
				System.out.print(matrix[i][i] + " ");
			}
		}
	}
	
	public static void printMatrix(int[][] matrix) {
		System.out.println("Матрица: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("[%3d] ", matrix[i][j]);
			}
			System.out.println();
		}
	}

	public static void initMatrix(int[][] matrix) {
		Random rand = new Random();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = rand.nextInt(20) - 10;
			}
		}
	}
}
