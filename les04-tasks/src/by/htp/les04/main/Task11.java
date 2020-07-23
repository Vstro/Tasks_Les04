package by.htp.les04.main;

import java.util.Random;

public class Task11 {

	public static void main(String[] args) {
		int[][] matrix = new int[10][20];
		Random rand = new Random();
		int fives = 0;
		
		System.out.println("Матрица: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = rand.nextInt(16);
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.print("Номера строк, где число 5 встречается 3 и более раз: ");
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

}
