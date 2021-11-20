package com.leetcode.plus_one;

/**
 * 力扣第66题，加一，题解，
 * 解题思路：
 * 1.对最后一位数字a进行加一，此时有两种情况
 * ①(a+1)%10=0;说明，最后一位数是9，加一之后为10，此时a=(a+1)%10=0;,继续循环，直到
 * 遇到一个不为9的数停止。如果每一位数都为9，则声明一个比当前数组长1的数组，并且让第0位的数字为1即可
 * ②(a+1)%10!=0;说明最后一位数不是9，则直接加1返回即可
 * @author dumaokun
 *
 */
public class Solution {

	public static void main(String[] args) {
		int[] test = {1, 2, 8, 9};
		int[] result = plusOne(test);
		for(Integer i : result) {
			System.out.print(i + " ");
		}
		
	}
	
	/**
	 * 
	 * @param digits
	 * @return
	 */
	public static int[] plusOne(int[] digits) {
		
		for (int i = digits.length -1; i >= 0; i--) {
	        digits[i]++;
	        //当前位为9，则加一后%10=0，不为9加一后%10为加1之后的数
	        digits[i] = digits[i] % 10;
	        //如果当前位的数字不为9，则此数字直接加1
	        digits[i] = digits[i] % 10;
	        if (digits[i] != 0) return digits;
	    }

	    int[] largeDigits = new int[digits.length + 1];
	    largeDigits[0] = 1;
	    return largeDigits;
	}
}
