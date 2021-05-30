/*
Given an array of ints, is it possible to choose a group of some of the ints,
such that the group sums to the given target? This is a classic backtracking recursion problem.
Once you understand the recursive backtracking strategy in this problem, you can use the same pattern for
many problems to search a space of choices. Rather than looking at the whole array, our convention is to
consider the part of the array starting at index start and continuing to the end of the array.
The caller can specify the whole array simply by passing start as 0. No loops are needed -- the recursive calls progress down the array.
        groupSum(0, [2, 4, 8], 10) → true
        groupSum(0, [2, 4, 8], 14) → true
        groupSum(0, [2, 4, 8], 9) → false

*/

package com.codingbat;

import java.util.Arrays;

public class GropuSumRecursive {

    public static boolean groupSum(int start, int[] nums, int target, String selected) {
        if(start >= nums.length) {
            if(target == 0) {
                System.out.print("input array:"+ Arrays.toString(nums) +"Result:"+ selected);
            }
            return target == 0;
        }

        if(groupSum(start+1, nums, target-nums[start], selected+", "+nums[start])) {
            return true;
        }

        if(groupSum(start+1, nums, target, selected)) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        //System.out.println(Integer.toBinaryString(2));
        System.out.println(groupSum(0, new int[] {2, 4, 8}, 10, "") == true);
        System.out.println(groupSum(0, new int[] {2, 4, 8}, 14, "") == true);
        System.out.println(groupSum(0, new int[] {2, 4, 8}, 9, "") == false);
        System.out.println(groupSum(0, new int[] {2, 4, 8}, 8, "") == true);
        System.out.println(groupSum(1, new int[] {2, 4, 8}, 8, "") == true);
        System.out.println(groupSum(1, new int[] {2, 4, 8}, 2, "") == false);
        System.out.println(groupSum(0, new int[] {1}, 1, "") == true);
        System.out.println(groupSum(0, new int[] {9}, 1, "") == false);
        System.out.println(groupSum(1, new int[] {9}, 0, "") == true);
        System.out.println(groupSum(0, new int[] {}, 0, "") == true);
        System.out.println(groupSum(0, new int[] {10, 2, 2, 5}, 17, "") == true);
        System.out.println(groupSum(0, new int[] {10, 2, 2, 5}, 15, "") == true);
        System.out.println(groupSum(0, new int[] {10, 2, 2, 5}, 9, "") == true);
    }
}