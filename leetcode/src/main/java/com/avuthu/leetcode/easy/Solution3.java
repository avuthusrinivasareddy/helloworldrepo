package com.avuthu.leetcode.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Solution3 {
	/**
	 * Iterate through each line of input.
	 */
	public static void main(String[] args) throws IOException {
		class CustomStack<T> extends ArrayList<T> {
			private static final long serialVersionUID = 1436637148431637609L;

			public void push(T t) {
				add(t);
			}

			public T pop() {
				int currentSize = size();
				T t = get(currentSize - 1);
				remove(currentSize - 1);
				return t;
			}
		}
		
		CustomStack<Integer> customStack = new CustomStack<Integer>();

		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String line;
		while ((line = in.readLine()) != null) {
			String[] inputArr = line.split(" ");
			for (String inputElement : inputArr) {
				customStack.push(Integer.parseInt(inputElement));
			}

			StringBuilder sb = new StringBuilder();
			boolean print = true;
			while (!customStack.isEmpty()) {
				Integer temp = customStack.pop();
				if (print) {
					sb.append(temp);
					sb.append(" ");
				}
				print = !print;
			}
			System.out.println(sb.toString());
		}
	}
}
