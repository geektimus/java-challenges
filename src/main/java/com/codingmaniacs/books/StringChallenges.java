package com.codingmaniacs.books;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Map;

public class StringChallenges {

    /**
     * Function that given a string determines if all letters are unique
     *
     * @param str String being analyzed.
     * @return true if all the chars in this string are unique, false otherwise.
     */
    public static boolean hasUniqueChars(String str) {
        return str.chars().distinct().count() == str.length();
    }

    public static boolean hasUniqueCharsHash(String str) {
        Hashtable<String, Integer> chars = new Hashtable<>(str.length());

        for (String c : str.split("")) {
            if (chars.containsKey(c))
                return false;
            else
                chars.putIfAbsent(c, 1);
        }

        for (Map.Entry<String, Integer> val : chars.entrySet()) {
            System.out.println(val);
        }
        return true;
    }

    /**
     * Finds if word1 is a permutation of word2
     *
     * @param word1 First word to test
     * @param word2 Second word to test
     * @return true if word1 is a permutation of word2, false otherwise.
     */
    public static boolean isPermutation(String word1, String word2) {
        if (word1 == null || word2 == null)
            return false;

        if (word1.length() != word2.length())
            return false;

        if (word1.equals(word2))
            return true;

        char[] word1arr = word1.toLowerCase().toCharArray();
        char[] word2arr = word2.toLowerCase().toCharArray();
        Arrays.sort(word1arr);
        Arrays.sort(word2arr);
        return Arrays.equals(word1arr, word2arr);
    }
}
