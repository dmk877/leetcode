package com.leetcode.plus_one;

public class Solution {

	public static void main(String[] args) {
		int[] test = {1, 2, 8, 9};
		int[] result = plusOne(test);
		for(Integer i : result) {
			System.out.print(i + " ");
		}
		
	}
	
	public static int[] plusOne(int[] digits) {
		
		for (int i = digits.length -1; i >= 0; i--) {
	        digits[i]++;
	        digits[i] = digits[i] % 10;
	        if (digits[i] != 0) return digits;
	    }

	    int[] largeDigits = new int[digits.length + 1];
	    largeDigits[0] = 1;
	    return largeDigits;
	}
}
