package by.htp.les04.main;

import java.util.Random;

public class Task10 {

	public static void main(String[] args) {
		int size = 5;
		int[][] matrix = new int[size][size];
		Random rand = new Random();

		System.out.println("Матрица: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = rand.nextInt(20) - 10;
				System.out.printf("[%3d] ", matrix[i][j]);
			}
			System.out.println();
		}

		System.out.println("Положительные элементы главной диагонали матрицы: ");
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][i] > 0) {
				System.out.print(matrix[i][i] + " ");
			}
		}
	}

}
