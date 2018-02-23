package com.codingmaniacs.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class CollectionChallenges {
    /**
     * Returns an array containing the odd numbers between bottom and top
     *
     * @param bottom Lower bound
     * @param top    Top bound
     * @return array containing all the odd numbers between lower and top
     */
    public static int[] oddNumbers(int bottom, int top) {
        List<Integer> numbers = new ArrayList<Integer>();
        int lBound = bottom;
        if (!isOddNumber(lBound))
            lBound = lBound + 1;

        while (lBound <= top) {
            numbers.add(lBound);
            lBound = lBound + 2;
        }
        return toIntArray(numbers);
    }

    /**
     * Returns an array containing all the int values of the list.
     *
     * @param numList List of integers to be transformed
     * @return array of ints.
     */
    private static int[] toIntArray(List<Integer> numList) {
        int[] numbers = new int[numList.size()];
        for (int i = 0; i < numList.size(); i++) {
            numbers[i] = numList.get(i);
        }
        return numbers;
    }

    /**
     * Returns if the given number is odd
     *
     * @param n number
     * @return boolean if the number is odd
     */
    private static boolean isOddNumber(int n) {
        return !(n % 2 == 0);
    }
}
