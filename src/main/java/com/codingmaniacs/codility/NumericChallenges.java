package com.codingmaniacs.codility;

public class NumericChallenges {
    /**
     * Given a number it shuffles the digits taking one from the front and one from the end until we reach the middle.
     *
     * @param number Number to be shuffled
     * @return Number with the original digits shuffled.
     */
    public static int shuffleNumber(int number) {

        if (number < 10)
            return number;

        String numberStr = String.valueOf(number);
        int length = numberStr.length();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length / 2; i++) {
            sb.append(numberStr.charAt(i));
            sb.append(numberStr.charAt(length - i - 1));
        }
        if (length % 2 != 0) {
            sb.append(numberStr.charAt(length / 2));
        }
        return Integer.valueOf(sb.toString());
    }
}
