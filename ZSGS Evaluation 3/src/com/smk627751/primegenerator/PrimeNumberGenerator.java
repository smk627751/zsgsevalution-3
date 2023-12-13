package com.smk627751.primegenerator;

import java.util.Scanner;

public class PrimeNumberGenerator {

	public boolean isPrime(int i)
	{
		boolean flag = true;
		if(i % 2 != 0 || i % 3 != 0 || i % 5 != 0|| i % 7 != 0)
		{
			for(int j = 2; j <= i; j++)
			{
				if(i != j && i % j == 0)
				{
					flag = false;
					break;
				}
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		PrimeNumberGenerator obj = new PrimeNumberGenerator();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the range seperated with space: ");
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		for(int i = start; i <= end; i++)
		{
			if(i != 1 && obj.isPrime(i))
			{
				System.out.print(i + " ");
			}
		}
	}

}
