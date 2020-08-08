package com.avuthu.leetcode.easy;

public class BinarySearch {
	public static int findNumberByLoop(int number, int[] arr) {
		int start = 0;
		int end = arr.length;
		
		while(end > start) {
			int mid = (start+end)/2;
			System.out.println("start="+start+" end="+end+" mid = "+mid);
			if(arr[mid] == number) {
				return mid;
			} else if(arr[mid] > number) {
				end = mid-1;
			} else {
				start = mid+1;
			}
		}
		return -1;
	}
	
	
	public static int findNumber(int start, int end, int number, int[] arr) {
		int mid = (start+end)/2;
		System.out.println("start="+start+" end="+end+" mid = "+mid);
		
		if(end < start) {
			return -1;
		}
		
		if(arr[mid] == number) {
			return mid;
		} else if(arr[mid] > number) {
			return findNumber(start, mid-1, number, arr);
		} else {
			return findNumber(mid+1, end, number, arr);
		}
	}
	
	public static int findNumber(int value, int[] arr) {
		return findNumber(0, arr.length, value, arr);
	}
	
	/*
	 * 11,13,15,17,19,21,25,27,29,31,33,35,37,38,1,3,5,7,9
	*/
	public static int findMinimum2(int start, int end, int minimum, int[] arr) {
		int mid = (start+end)/2;
		
		System.out.println("start="+start+" end="+end+" mid = "+mid+" minimum ="+minimum);
		if(end < start) {
			return minimum;
		}
		
		if(arr[mid] > minimum) {
			return findMinimum(mid+1, end, minimum, arr);
		} else {
			return findMinimum(start, mid-1, arr[mid], arr);
		}
	}
	
	/*
	 * 11,13,15,17,19,21,25,27,29,31,33,35,37,38,1,3,5,7,9
	*/
	public static int findMinimum(int start, int end, int minimum, int[] arr) {
		while(start < end) {
			int mid = (start+end)/2;
			System.out.println("start="+start+" end="+end+" mid = "+mid+" minimum ="+minimum);
			if(arr[mid] > minimum) {
				start = mid+1;
			} else {
				end = mid-1;
				minimum = arr[mid];
			}
		}
		return minimum;
	}
	
	public static int findMinimum(int[] arr) {
		return findMinimum(0, arr.length, arr[arr.length-1], arr);
	}

	public static void main(String[] args) {
		double a = 22;
		int b = 7;
		double c = 22/7;
		System.out.println((double)22/7); //3.142857142857143
		System.out.println(a/b); //3.142857142857143
		System.out.println(c); //3.0
		
		/*int index = findNumber(37, new int[] {1,3,5,7,9,11,13,15,17,19,21, 25,27,29,31,33,35,37,38});
		System.out.println(index);*/
		
		//int minimumNum = findMinimum2(37, new int[] {11,13,15,17,19,21,25,27,29,31,33,35,37,38,1,3,5,7,9});
		//int minimumNum = findMinimum(37, new int[] {3,5,7,9,11,13,15,17,19,21,25,27,29,31,33,35,37,38,2});
		
		/*int minimumNum = findNumberByLoop(37, new int[] {1,3,5,7,9,11,13,15,17,19,21, 25,27,29,31,33,35,37,38});
		System.out.println(minimumNum);*/
		
		int minimumNum = findMinimum(new int[] {11,13,15,17,19,21,25,27,29,31,33,35,37,38,1,3,5,7,9});
		System.out.println(minimumNum);
	}

}
