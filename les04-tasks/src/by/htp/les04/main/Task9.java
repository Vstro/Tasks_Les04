package by.htp.les04.main;

import java.util.Random;

public class Task9 {

	public static void main(String[] args) {
		int n = 5;
		double[] xArray = new double[n];
		Random rand = new Random();
		double[][] matrix = new double[n][n];
		
		System.out.println("Исходная последовательность: ");
		for (int i = 0; i < xArray.length; i++) {
			xArray[i] = rand.nextDouble() * 20 - 10;
			System.out.printf("[%.3f] ", xArray[i]);
		}
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = Math.pow(xArray[j], i + 1);
			}
		}
		
		System.out.println("\nСформированная матрица: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("[%.3f] ", matrix[i][j]);
			}
			System.out.println();
		}
	}

}
