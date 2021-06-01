package com.cci.array_string;

/*String Compression: Implement a method to perform basic string compression using the counts
        of repeated characters. For example, the string aabcccccaaa would become a2b1c5a3. If the
        "compressed" string would not become smaller than the original string, your method should return
        the original string. You can assume the string has only uppercase and lowercase letters (a - z).*/

public class StringCompression {

    public static String compressString(String input) {
        Character currentChar = null;
        int timesofRepetition = 0;
        StringBuilder output = new StringBuilder();
        for(Character ch: input.toCharArray()) {
            if(currentChar == null) {
                currentChar = ch;
                timesofRepetition = 1;
            } else {
                if(currentChar.equals(ch)) {
                    timesofRepetition++;
                } else {
                    output.append(currentChar);
                    output.append(timesofRepetition);
                    currentChar = ch;
                    timesofRepetition =1;
                }
            }
        }
        output.append(currentChar);
        output.append(timesofRepetition);
        System.out.println(output);
        return output.toString();
    }

    public static void main(String args[]) {
        System.out.println(compressString("aabcccccaaa").equals("a2b1c5a3"));
    }
}
