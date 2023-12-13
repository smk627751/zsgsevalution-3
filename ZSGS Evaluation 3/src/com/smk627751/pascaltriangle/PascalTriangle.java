package com.smk627751.pascaltriangle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<List<Integer>> list = new ArrayList<>();
		for(int i = 0; i < n; i++)
		{
			List<Integer> temp = new ArrayList<>();
			for(int j = 0; j <= i; j++)
			{
				if(j == 0 || j == i)
				{
					temp.add(1);
				}
				else
				{
					temp.add(list.get(i - 1).get(j) +  list.get(i - 1).get(j - 1));
				}
			}
			list.add(temp);
		}
		int space = n;
		for(List<Integer> l : list)
		{
			for(int i = 0; i < space; i++)
			{
				System.out.printf("%2s"," ");
			}
			for(int i : l)
			{
				System.out.printf("%4d",i);
			}
			System.out.println();
			space--;
		}
	}

}
