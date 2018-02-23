package com.codingmaniacs.hackerrank;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class CollectionChallengesTests {
    @Test
    public void generateOddsSmallRangeStartsAndEndInOdds() {
        int[] numbers = CollectionChallenges.oddNumbers(5, 11);
        int[] expected = {5, 7, 9, 11};
        assertArrayEquals(expected, numbers);
    }

    @Test
    public void generateOddsSmallRangeStartsAndEndInEvens() {
        int[] numbers = CollectionChallenges.oddNumbers(4, 8);
        int[] expected = {5, 7};
        assertArrayEquals(expected, numbers);
    }

    @Test
    public void generateOddsOneEvenValue() {
        int[] numbers = CollectionChallenges.oddNumbers(2, 2);
        int[] expected = {};
        assertArrayEquals(expected, numbers);
    }

    @Test
    public void generateOddsOneOddValue() {
        int[] numbers = CollectionChallenges.oddNumbers(3, 3);
        int[] expected = {3};
        assertArrayEquals(expected, numbers);
    }
}
