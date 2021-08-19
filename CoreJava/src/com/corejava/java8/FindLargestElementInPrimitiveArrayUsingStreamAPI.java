package com.corejava.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class FindMinMaxElementInPrimitiveArrayUsingStreamAPI {

	public static void main(String[] args) {

		int[] intArray = { 0,1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int min = Arrays.stream(intArray).min().getAsInt();
		System.out.println("min element in given array:"+min);
		
		int max=Arrays.stream(intArray).max().getAsInt();
		System.out.println("max element in given array:"+max);	
	}
}
