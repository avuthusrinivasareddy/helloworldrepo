package com.facebook;

import java.io.*;
import java.util.*;
// Add any extra import statements you may need here


class EncryptedString {

    // Add any helper functions you may need here


    String findEncryptedWord(String s, boolean doRecursive) {
        String r = "";
        int len = s.length();
        if (len < 3) {
            return s;
        }
        int mid = (len % 2 == 0) ? (len / 2 - 1) : len / 2;
        r = "" + s.charAt(mid);

        String left = s.substring(0, mid);
        String right = s.substring(mid + 1, len);

        if (doRecursive) {
            return r + findEncryptedWord(left, true) + findEncryptedWord(right, true);
        } else {
            return r + left + right;
        }


    }


    // These are the tests we use to determine if the solution is correct.
    // You can add your own at the bottom, but they are otherwise not editable!
    int test_case_number = 1;

    void check(String expected, String output) {
        boolean result = (expected.equals(output));
        char rightTick = '\u2713';
        char wrongTick = '\u2717';
        if (result) {
            System.out.println(rightTick + " Test #" + test_case_number + ":" + output);
        } else {
            System.out.print(wrongTick + " Test #" + test_case_number + ": Expected ");
            printString(expected);
            System.out.print(" Your output: ");
            printString(output);
            System.out.println();
        }
        test_case_number++;
    }

    void printString(String str) {
        System.out.print("[\"" + str + "\"]");
    }

    public void run() {
        String s_1 = "abc";
        String expected_1 = "bac";
        String output_1 = findEncryptedWord(s_1, true);
        check(expected_1, output_1);

        String s_2 = "abcd";
        String expected_2 = "bacd";
        String output_2 = findEncryptedWord(s_2, true);
        check(expected_2, output_2);

        String s_3 = "facebook";
        String expected_3 = "eafcobok";
        String output_3 = findEncryptedWord(s_3, true);
        check(expected_3, output_3);

        String s_4 = "abcdefghijklmnopqrstuvwxyz";
        String expected_4 = "mfcabdeighkjltpnorqswuvyxz";
        String output_4 = findEncryptedWord(s_4, true);
        check(expected_4, output_4);

        // Add your own test cases here

    }

    public static void main(String[] args) {
        new EncryptedString().run();
    }
}