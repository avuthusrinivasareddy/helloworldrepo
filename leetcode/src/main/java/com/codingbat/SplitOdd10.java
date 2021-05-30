/*Given an array of ints, is it possible to divide the ints into two groups,
so that the sum of one group is a multiple of 10, and the sum of the other group is odd.
Every int must be in one group or the other. Write a recursive helper method that takes whatever arguments you like,
and make the initial call to your recursive helper from splitOdd10(). (No loops needed.)
splitOdd10([5, 5, 5]) → true
splitOdd10([5, 5, 6]) → false
splitOdd10([5, 5, 6, 1]) → true*/

package com.codingbat;

public class SplitOdd10 {

    public static boolean splitOdd10(int[] nums, int index, int sum1, int sum2) {
        if(index >= nums.length) {
            return (sum1%10 == 0 && sum2%2 !=0 ) || (sum1%2 != 0 && sum2 %10 == 0);
        }

       return splitOdd10(nums, index+1, sum1+nums[index], sum2) || splitOdd10(nums, index+1, sum1, sum2+nums[index]);
    }

    public static void main(String[] args) {
        System.out.println(splitOdd10(new int[] {5,5,5}, 0, 0, 0) == true);
        System.out.println(splitOdd10(new int[] {5,5,6}, 0, 0, 0) == false);
        System.out.println(splitOdd10(new int[] {5,5,6,1}, 0, 0, 0) == true);
        System.out.println(splitOdd10(new int[] {6,4,1}, 0, 0, 0) == true);
        System.out.println(splitOdd10(new int[] {6,4,2}, 0, 0, 0) == false);
    }
}