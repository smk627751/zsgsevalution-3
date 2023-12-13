package com.smk627751.frequencyofwords;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfWords {

	public String frequencyOfWords(String str)
	{
		String arr[] = str.split(" ");
		Map<String, Integer> map = new LinkedHashMap<>();
		for(String s : arr)
		{
			map.put(s.toLowerCase(), map.getOrDefault(s.toLowerCase(), 0) + 1);
		}
		StringBuilder s = new StringBuilder();
		for(Map.Entry<String,Integer> m : map.entrySet())
		{
			s.append(m.getKey()+"-"+m.getValue()+" ");
		}
		return s.toString();
	}
	public static void main(String[] args) {
		FrequencyOfWords obj = new FrequencyOfWords();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String s = obj.frequencyOfWords(str);
		System.out.println(s);
	}

}
