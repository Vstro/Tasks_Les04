package by.htp.les04.main;

import java.util.Random;

public class Task3 {

	public static void main(String[] args) {
		int m = 4;
		int n = 3;
		int[][] matrix = new int[m][n];
		Random rand = new Random();
		
		System.out.println("Матрица как есть: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = rand.nextInt(100);
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Матрица в нужном виде: ");
		for (int i = 0; i < matrix.length; i++) {
			if (i % 2 == 0) {
				for (int j = matrix[i].length - 1; j >= 0; j--) {
					System.out.print(matrix[i][j] + " ");
				}
			} else {
				for (int j = 0; j < matrix[i].length; j++) {
					System.out.print(matrix[i][j] + " ");
				}
			}
			System.out.println();
		}
	}

}
