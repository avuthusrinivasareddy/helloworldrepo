package com.avuthu.leetcode.easy;

public class RegExMatching {
	
	public static boolean isMatch(String s, String p) {
        if(s.isEmpty() ^ p.isEmpty() ) {
        	return false;
        } else if(s.isEmpty() && p.isEmpty() ) {
        	return true;
        }
        int indexS = 0;
        int indexP = 0;
        
        boolean isMatched = false;
        
        while(indexS < s.length() && indexP < p.length()) {
        	System.out.println(p.charAt(indexP) +"" +" == "+s.charAt(indexS));
            if(s.charAt(indexP) == '.' || s.charAt(indexS) == p.charAt(indexP)) {
            	indexS++;
            	indexP++;
            } else if(p.charAt(indexP) == '*') {
            	if(p.charAt(indexP-1) == '.' || s.charAt(indexS) == p.charAt(indexP-1)) {
            		indexS++;
            		isMatched = true;
            	} else if(indexP+1 < p.length() && s.charAt(indexS) == p.charAt(indexP+1)) {
            		indexS++;
            		indexP+=2;
            		isMatched = true;
            	} else {
            		return false;
            	}
            	
            } else if(indexP+1 < p.length() && p.charAt(indexP+1) == '*') {
            	indexP+=2;
            }
            else {
            	return false;
            }
        }
        if(isMatched && indexP < p.length() && p.charAt(indexP) == '*') {
        	indexP++;
        }
        return isMatched && (indexS == s.length() && indexP == p.length());
    }

	public static void main(String[] args) {
		System.out.println("test1 :"+ Boolean.toString(isMatch("aa", "a") == false));
		System.out.println("test2 :"+ Boolean.toString(isMatch("aa", "a*") == true));
		System.out.println("test3 :"+ Boolean.toString(isMatch("ab", ".*") == true));
		System.out.println("test4 :"+ Boolean.toString(isMatch("aab", "c*a*b") == true));
		System.out.println("test5 :"+ Boolean.toString(isMatch("mississippi", "mis*is*p*.") == false));

	}

}
