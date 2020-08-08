package com.avuthu.leetcode.easy;

public class PrintPatterns {
	
	/*
	X   X
	 X X 
	  X  
	 X X 
	X   X
	*/
	public static void printX(int n, String string) {
		for(int i=0; i<n;i++) {
			for(int j=0; j<n; j++) {
				if(i == j || i+j == n-1) {
					System.out.print(string);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	/*
	1 1 1 1 
	 2 2 2 
	 3 3 3 
	4 4 4 4 
	(OR)
	1 1 1 1 1 
	 2 2 2 2 
	  3 3 3 
	 4 4 4 4 
	5 5 5 5 5 
	*/
	public static void printX2(int n, String string) {
		for(int i=0; i<n;i++) {
			for(int j=0; j<n; j++) {
				if(i< n/2) {
					if(j<i) {
						System.out.print(" ");
					} else {
						System.out.print(string.substring(i, i+1)+" ");
					}
				} else {
					if((i+j)<(n-1)) {
						System.out.print(" ");
					} else {
						System.out.print(string.substring(i, i+1)+" ");
					}
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		//System.out.println(5/2);
		System.out.println("PrintX - sample1");
		printX(5, "X");
		System.out.println("PrintX2 - sample1");
		printX2(4, "1234");
		System.out.println("PrintX2 - sample2");
		printX2(5, "12345");
		System.out.println("PrintX2 - sample3");
		printX2(26, "ABCDEFGHIJKLMNOPQRSTUVWXYZ");
	}

}
