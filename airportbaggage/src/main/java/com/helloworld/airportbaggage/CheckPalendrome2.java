package com.subaru.micro.mysubaru.myspoi;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckPalendrome2 {

	public static void main(String[] args) throws Exception {
		File file = new File("abc.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		FileInputStream fir = new FileInputStream(file);
		BufferedInputStream bir = new BufferedInputStream(fir);
		
		
		
		String input = "abdcba";
		
		int originalLength = input.length();
		int testStringLength = originalLength -1;
		
		List<Character> charList = new ArrayList<>();
 		
		for(int index = 0; index < originalLength; index++) {
			boolean isPlendrome = false;
			for(int start = 0, end = testStringLength; start < testStringLength/2; start++, end--) {
				if(index == start) {
					start++;
				}
				if(index == end) {
					end--;
				}
				if(input.charAt(start) == input.charAt(end)) {
					isPlendrome = true;
				} else {
					isPlendrome = false;
					break;
				}
			}
			
			if(isPlendrome) {
				charList.add(input.charAt(index));
			}
		}
		
		
		Collections.sort(charList);
		System.out.println(charList);
		if(charList.size() > 0)
		System.out.println(charList.get(0));
		

	}

}
