package com.smk627751.rotatearray;

import java.util.Scanner;

public class RotateArray {

	public void rotateArray(int matrix[][], int n)
	{
		int left = 0, right = matrix.length - 1;
		while(left < right)
		{
			int[] temp = matrix[left];
			matrix[left] = matrix[right];
			matrix[right] = temp;
			left++;
			right--;
		}
		
		for(int i = 0; i < n; i++)
		{
			for(int j = i + 1; j < n; j++)
			{
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
	}
	public static void main(String[] args) {
		RotateArray obj = new RotateArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		int matrix[][] = new int[n][n];
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				matrix[i][j] = sc.nextInt();
			}
		}
		obj.rotateArray(matrix, n);
		for(int mat[]: matrix)
		{
			for(int m : mat)
			{
				System.out.printf("%2d",m);
			}
			System.out.println();
		}
	}

}
