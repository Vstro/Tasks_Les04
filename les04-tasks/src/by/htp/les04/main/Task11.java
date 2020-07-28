package by.htp.les04.main;

import java.util.Random;

public class Task11 {

	public static void main(String[] args) {
		int[][] matrix = new int[10][20];
		int fives = 0;
		
		initMatrix(matrix);
		printMatrix(matrix);
		
		System.out.print("Номера строк (начиная с 0), где число 5 встречается 3 и более раз: ");
		for (int i = 0; i < matrix.length; i++) {
			fives = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 5) {
					fives++;
				}
			}
			if (fives >= 3) {
				System.out.print(i + " ");
			}
		}
	}
	
	public static void printMatrix(int[][] matrix) {
		System.out.println("Матрица: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("[%2d] ", matrix[i][j]);
			}
			System.out.println();
		}
	}

	public static void initMatrix(int[][] matrix) {
		Random rand = new Random();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = rand.nextInt(16);
			}
		}
	}
}
