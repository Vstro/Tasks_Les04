package by.htp.les04.main;

import java.util.Random;

public class Task2 {

	public static void main(String[] args) {
		int[][] matrix = new int[5][5];
		Random rand = new Random();
		int k = 2;
		int p = 3;
		
		System.out.println("Матрица: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = rand.nextInt(100);
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println(k + "-ая строка: ");
		for (int i = 0; i < matrix[k].length; i++) {
			System.out.print(matrix[k][i] + " ");
		}
		System.out.println();
		System.out.println(p + "-ый столбец: ");
		for (int i = 0; i < matrix.length; i++) {
			System.out.print(matrix[i][p] + " ");
		}
	}

}
