package com.ttn.javaAssignment;

import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int row = scn.nextInt();
		int colunm = scn.nextInt();
		int[][] array = new int[row][colunm];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = scn.nextInt();
			}
		}
		rowWiseSum(array);
		colWiseSum(array);
	}

	public static void rowWiseSum(int[][] array) {
		int count = 1;
		for (int matrix[] : array) {
			int sum = 0;
			for (int val : matrix) {
				sum += val;
			}
			System.out.println("Row-" + count + " having sum = " + sum);
			count++;
		}
	}

	public static void colWiseSum(int[][] array) {
		int count = 1;
		for (int i = 0; i < array.length; i++) {
			int sum = 0;
			for (int j = 0; j < array[0].length; j++) {
				sum += array[j][i];
			}
			System.out.println("Colunm-" + count + " having sum = " + sum);
			count++;
		}
	}
}


















