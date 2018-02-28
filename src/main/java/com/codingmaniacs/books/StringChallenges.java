package com.codingmaniacs.books;

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
}
