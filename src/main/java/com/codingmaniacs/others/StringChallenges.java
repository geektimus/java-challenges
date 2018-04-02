package com.codingmaniacs.others;

import java.util.HashMap;
import java.util.Map;

class StringChallenges {
    /**
     * Given a string it reverses the order of the chars
     *
     * @param str String
     * @return String on reverse order
     */
    static String reverse(String str) {
        if (str.length() == 0) return str;
        else {
            int last = str.length() - 1;
            return str.charAt(last) + reverse(str.substring(0, last));
        }
    }

    /**
     * Given a string, we should find the first occurrence of some letter
     *
     * @param str String to be used
     * @return Returns the letter duplicated.
     */
    static String findFirstRepeatedChar(String str) {
        if (str == null || str.isEmpty())
            return "";

        final Map<String, Integer> occ = new HashMap<>(26);

        for (int i = 0; i < str.length(); i++) {
            final String shard = Character.toString(str.charAt(i));
            if (occ.containsKey(shard)) {
                return shard;
            }
            occ.putIfAbsent(shard, 1);
        }
        return "";
    }

    /**
     * Given a String and its true length, transform the string to a URL friendly string by replacing the spaces by %20
     *
     * @param str        String to be transformed
     * @param trueLength True size of the string without the trailing spaces.
     * @return A URL friendly string with the spaces replaced.
     */
    static String URLlify(String str, int trueLength) {
        if (str.length() == trueLength)
            return str;

        char[] chars = str.toCharArray();
        int spaces = 0;

        // Count spaces
        for (int i = 0; i < trueLength; i++) {
            if (chars[i] == ' ') {
                spaces++;
            }
        }

        if (trueLength < str.length()) chars[trueLength] = '\0';

        // Replace the string backwards so we don't need to worry about overriding data.
        int index = trueLength + spaces * 2;
        for (int j = trueLength - 1; j >= 0; j--) {
            if (chars[j] == ' ') {
                chars[index - 1] = '0';
                chars[index - 2] = '2';
                chars[index - 3] = '%';
                index = index - 3;
            } else {
                chars[index - 1] = chars[j];
                index--;
            }
        }

        return new String(chars);
    }
}
