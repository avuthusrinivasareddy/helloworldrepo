package com.avuthu.leetcode.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class CustomStackImpl  {
	public static void main(String[] args) throws IOException {
		class CustomStack<T>  {
			List<T> list = new ArrayList<>();
			public void push(T t){
				list.add(t);
			}
		 
			public T pop() {
				int currentSize = list.size();
				T t = list.get(currentSize - 1);
				list.remove(currentSize-1);
				return t;
			}
			
			public boolean isEmpty() {
				return list.isEmpty();
			}
		}
		
		
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String line;
		
		CustomStack<Integer> customStack = new CustomStack<Integer>();
		line = in.readLine();
		
		String[] inputArr = line.split(" ");
		
		for(String inputElement : inputArr) {
			customStack.push(Integer.parseInt(inputElement));
		}
		
		StringBuilder sb = new StringBuilder();
		
		boolean print = true;
		while(!customStack.isEmpty()) {
			Integer temp = customStack.pop();
			if(print) {
				sb.append(temp);
				sb.append(" ");
			}
			print = !print;
		}
		System.out.println(sb.toString());
		

	}
}
