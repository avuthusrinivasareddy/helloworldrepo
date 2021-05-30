/*One Away: There are three types of edits that can be performed on strings: insert a character,
        remove a character, or replace a character. Given two strings, write a function to check if they are
        one edit (or zero edits) away.
        EXAMPLE
        pale, ple -> true
        pales. pale -> true
        pale. bale -> true
        pale. bake -> false*/

package com.cci.array_string;

public class OneEditAway {

    private static boolean checkOneEditAway(String source, String target) {
        int sourceLength = source.length();
        int targetLength = target.length();
        boolean update = (sourceLength == targetLength);
        boolean insert = (sourceLength - targetLength == -1);
        boolean delete = (sourceLength - targetLength == 1);

        if (!(update || insert || delete)) {
            return false;
        }

        int numberOfEdits = 0;
        for (int i = 0; i < source.length(); i++) {
            if (update) {
                if (update) {
                    if (source.charAt(i) != target.charAt(i)) {
                        numberOfEdits++;
                    }
                }
            }

            if (insert) {
                if (source.charAt(i - numberOfEdits) != target.charAt(i)) {
                    if (source.charAt(i) == target.charAt(i + 1)) {
                        numberOfEdits++;
                    } else {
                        return false;
                    }
                }
            }

            if (delete) {
                if (targetLength > i && source.charAt(i) != target.charAt(i - numberOfEdits)) {
                    if (source.charAt(i + 1) == target.charAt(i)) {
                        numberOfEdits++;
                    } else {
                        return false;
                    }
                }
            }

            if (numberOfEdits > 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        System.out.println(checkOneEditAway("pale", "ple") == true);
        System.out.println(checkOneEditAway("pales", "pale") == true);
        System.out.println(checkOneEditAway("pale", "bale") == true);
        System.out.println(checkOneEditAway("pale", "bake") == false);
    }
}
