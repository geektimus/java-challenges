package com.codingmaniacs.hackerrank;

public class StringChallenges {
    public static String reduceString(String s) {
        if (s == null) {
            return null;
        }
        String[] letters = s.split("");
        StringBuilder sb = new StringBuilder();
        boolean toggleCase = false;
        for (String l : letters) {
            if (l.equals("_")) {
                sb.deleteCharAt(sb.length() - 1);
            } else if (l.equals("+")) {
                toggleCase = true;
            } else {
                boolean isUpper = l.matches("[A-Z]");
                sb.append(toggleCase ? isUpper ? l.toLowerCase() : l.toUpperCase() : l);
                toggleCase = false;
            }

        }
        return sb.toString();
    }

    public static boolean equal(String s1, String s2) {
        if (s1 == null && s2 == null ) {
            return true;
        }
        if (s1 == null || s2 == null ) {
            return false;
        }
        return reduceString(s1).equals(reduceString(s2));
    }
}
