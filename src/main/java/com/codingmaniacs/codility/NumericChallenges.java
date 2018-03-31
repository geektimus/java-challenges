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

    /**
     * Returns the minimum number of plays a player can make to earn {{@code chips}} using max of {{@code allInPlays}} plays
     *
     * @param chips      Number of chips the player earned on his visit to the casino.
     * @param allInPlays Number of all in moves that he used.
     * @return Minimum number of plays a player can make to earn {{@code chips}}
     */
    public static int minimumPlays(int chips, int allInPlays) {
        if (allInPlays == 0) {
            return chips - 1;
        }

        System.out.println("Initial: {Chips: " + chips + ", AllIn: " + allInPlays + "}");

        int plays = 0;

        while (chips > 1) {
            if (chips % 2 == 0 && allInPlays > 0) {
                allInPlays--;
                chips /= 2;
                plays++;
            } else {
                chips--;
                plays++;
            }
            System.out.println("Loop: {Chips: " + chips + ", AllIn: " + allInPlays + "}");
        }
        return plays;
    }
}
