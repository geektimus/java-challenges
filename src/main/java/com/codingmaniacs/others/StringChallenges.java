package com.codingmaniacs.others;

public class StringChallenges {
    /**
     * Given a string it reverses the order of the chars
     *
     * @param str String
     * @return String on reverse order
     */
    public static String reverse(String str) {
        if (str.length() == 0) return str;
        else {
            int last = str.length() - 1;
            return str.charAt(last) + reverse(str.substring(0, last));
        }
    }
}
