package com.helloworld.airportbaggage;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckPalendrome {

	public static void main(String[] args) {
		approach1();
		approach2();
		 
	}
	
	public static void approach2() {
		Instant start = Instant.now();
		
		 String input ="abckkdba";
		 int originalLength = input.length();
		 int testStringLength = originalLength-1;
		 
		 List<Character> charList = new ArrayList<>();
		 
		 for(int index = 0; index < originalLength; index++) {
			 boolean isPlendrome = false;
			 for(int front=0, end = testStringLength ; front < testStringLength/2; front++, end--) {
				 if(index == front) {
					 front++;
				 }
				 
				 if(index == end) {
					 end--;
				 }
				 
				 //System.out.println(input.charAt(front)+", "+ input.charAt(end));
				 if(input.charAt(front) == input.charAt(end)) {
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
		 
		 System.out.println(charList);
		 Instant end = Instant.now();
		 System.out.println(start +"/"+end +":"+Duration.between(start, end).toMillis());
	}
	
	public static void approach1() {
		Instant start = Instant.now();
		
		 String input ="abcdba";
		 StringBuilder tempInput = new StringBuilder(input);
		 int originalLength = tempInput.length();
		 int testStringLength = originalLength-1;
		 
		List<Character> charList = new ArrayList<>();
		 for(int i = 0; i < originalLength; i++) {
			 tempInput.deleteCharAt(i);
			 
			 boolean isPlendrome = true;
			 for(int j=0; j < testStringLength/2; j++) {
				 if(tempInput.charAt(j) != tempInput.charAt(testStringLength-j-1)) {
					 isPlendrome = false;
					 break;
				 }
			 }
			 
			 if(isPlendrome) {
				 charList.add(input.charAt(i));
			 }
			 
			 tempInput.insert(i, input.charAt(i));
		 }
		 
		 //finding min char
		 char minChar = Character.MAX_VALUE;
		 for(char ch : charList) {
			 if(ch < minChar) {
				 minChar = ch;
			 }
		 }
		 System.out.println(minChar);
		 
		 //OR by sorting to ascending
		 Collections.sort(charList);
		 System.out.println(charList);
		 
		 Instant end = Instant.now();
		 System.out.println(start +"/"+end +":"+Duration.between(start, end).toMillis());
	}

}
