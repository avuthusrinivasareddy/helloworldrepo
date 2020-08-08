package com.avuthu.leetcode.easy;

import java.util.Arrays;

public class ArrayAddOne {
    public long[] plusOne(int[] digits) {
        long number = 0;
        for(int digit : digits) {
            number = (number * 10) + digit;
        }
        
        number++;
        
        int length = Long.toString(number).length();
        long[] result = new long[length];
        
        for(int i = length-1; i >-1; i--) {
            result[i] = number % 10;
            number = number / 10;
        }
        return result;
    }
    
    public static void main(String args[]) {
    	ArrayAddOne solution = new ArrayAddOne();
    	System.out.println(Arrays.toString(solution.plusOne(new int[] {9,8,7,6,5,4,3,2,1,0})));
    }
}