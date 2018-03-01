package com.codingmaniacs.codility;

import java.util.Arrays;

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

    /**
     * Finds the binary gap of the given number
     * Binary gap is the max number of consecutive zeros between ones on the binary representation of the number.
     *
     * @param number Number
     * @return Integer representing the binary gap on the given number.
     */
    public static int findBinaryGap(int number) {
        String binaryRep = Integer.toBinaryString(number);

        String trimmedRep = binaryRep.substring(1, binaryRep.lastIndexOf("1"));

        return Arrays
                .stream(trimmedRep.split("1"))
                .mapToInt(String::length)
                .max()
                .orElse(0);

    }
}
