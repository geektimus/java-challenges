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
}
