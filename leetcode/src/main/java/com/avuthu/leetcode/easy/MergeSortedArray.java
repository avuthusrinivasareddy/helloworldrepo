package com.avuthu.leetcode.easy;

import java.util.Arrays;

class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int num1Index = 0, num2Index = 0; num2Index < nums2.length;) {
        	if(num1Index >= m) {
        		nums1[num1Index] = nums2[num2Index];
        		num2Index++;
        	} else if(nums1[num1Index] > nums2[num2Index]) {
            	int temp = nums1[num1Index];
            	nums1[num1Index] = nums2[num2Index];
            	
            	for(int i = num1Index+1; i<=m; i++) {
            		int temp2 = nums1[i];
            		nums1[i] = temp;
            		temp = temp2;
            	}
            	m++;
            	num2Index++;
            } 
            num1Index++;
        }
    }
    
    public static void main(String args[]) {
    	MergeSortedArray msa = new MergeSortedArray();
    	int[] num1 = {1,2,3,0,0,0};
    	msa.merge(num1, 3, new int[] {2,5,6}, 3);
    	System.out.println(Arrays.toString(num1));
    }
}