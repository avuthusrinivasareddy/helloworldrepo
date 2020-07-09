package com.subaru.micro.mysubaru.myspoi;

import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindNumbers {

	public static void main(String[] args) {
		String input = "zeroonetwothreezerofourseveneight";
		
		String result = "";
		//String to list of chars
		List<Character> inputList = input.chars().mapToObj(c->(char)c).collect(Collectors.toList());
		
		//char list to string
		Collections.shuffle(inputList);
		String inputShuffled =  inputList.stream().map(String::valueOf).collect(Collectors.joining()); 
		System.out.println(inputShuffled);
		
		Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();
    	for(char car: inputList) {
    		charCountMap.computeIfPresent(car, (key,value)->value+1);
    		charCountMap.putIfAbsent(car, 1);
    	}
    	System.out.println(charCountMap);
    	
    	List<SimpleEntry<String, Integer>> stringToIntegerEntryList = Arrays.asList(new AbstractMap.SimpleEntry<String, Integer>("zero", 0), 
						    			  new AbstractMap.SimpleEntry<String, Integer>("four", 4),
						    			  new AbstractMap.SimpleEntry<String, Integer>("five", 5),
						    			  new AbstractMap.SimpleEntry<String, Integer>("six", 6),
						    			  new AbstractMap.SimpleEntry<String, Integer>("seven", 7),
						    			  new AbstractMap.SimpleEntry<String, Integer>("eight", 8),
						    			  new AbstractMap.SimpleEntry<String, Integer>("three", 3),
						    			  new AbstractMap.SimpleEntry<String, Integer>("nine", 9),
						    			  new AbstractMap.SimpleEntry<String, Integer>("one", 1),
						    			  new AbstractMap.SimpleEntry<String, Integer>("two", 2));
    	
    	
    	for(int i=0; i< stringToIntegerEntryList.size(); i++) {
    		//check for existance of all chars of string, say : zero
    		SimpleEntry<String, Integer> entry = stringToIntegerEntryList.get(i);
    		boolean existsAllChars = false;
    		for(Character c : entry.getKey().toCharArray()) {
    			 if(charCountMap.containsKey(c) && charCountMap.get(c) > 0) {
    				 existsAllChars = true;
    			 } else {
    				 existsAllChars = false;
    				 break;
    			 }
    		}
    		
    		if(existsAllChars) {
    			for(Character c : entry.getKey().toCharArray()) {
    				charCountMap.put(c, charCountMap.get(c) -1);
    			}
    			result = result+entry.getValue();
    			//check again for the integer string, say : zero
    			--i;
    		}
    		System.out.println(charCountMap);
    	}
    	
    	System.out.println(result);
		
	}
	
	public void snippetsShuffle() {
		String input = "zeroonetwothreezero";
		List<Character> inputList = input.chars().mapToObj(c->(char)c).collect(Collectors.toList());
		
		//char list to string
		Collections.shuffle(inputList);
		String inputShuffled =  inputList.stream().map(String::valueOf).collect(Collectors.joining()); 
		System.out.println(inputShuffled);
		
		Map<String, Integer> integerStringMap = Stream.of(
		  new AbstractMap.SimpleEntry<String, Integer>("zero", 0), 
		  new AbstractMap.SimpleEntry<String, Integer>("one", 1),
		  new AbstractMap.SimpleEntry<String, Integer>("two", 2),
		  new AbstractMap.SimpleEntry<String, Integer>("three", 3),
		  new AbstractMap.SimpleEntry<String, Integer>("four", 4),
		  new AbstractMap.SimpleEntry<String, Integer>("five", 5),
		  new AbstractMap.SimpleEntry<String, Integer>("six", 6),
		  new AbstractMap.SimpleEntry<String, Integer>("seven", 7),
		  new AbstractMap.SimpleEntry<String, Integer>("eight", 8),
		  new AbstractMap.SimpleEntry<String, Integer>("nine", 9))
		  .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		System.out.println(integerStringMap);
	}

}
