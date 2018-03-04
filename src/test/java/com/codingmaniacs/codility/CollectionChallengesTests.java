package com.codingmaniacs.codility;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class CollectionChallengesTests {

    @Test
    public void validateNormalArraySolvable() {
        int[] numbers = {1, 5, 3, 3, 7};
        boolean success = CollectionChallenges.isOrderedBySingleSwap(numbers.clone());
        assertEquals("It should be true we get to [1,3,3,5,7] in one swap", true, success);
    }

    @Test
    public void validateNormalArrayUnsolvable() {
        int[] numbers = {1, 3, 5, 3, 4};
        boolean success = CollectionChallenges.isOrderedBySingleSwap(numbers.clone());
        assertEquals("It should be false as we get to [1,3,3,4,5] in two swaps", false, success);
    }

    @Test
    public void validateShortArraySolvable() {
        int[] numbers = {1, 5, 3};
        boolean success = CollectionChallenges.isOrderedBySingleSwap(numbers.clone());
        assertEquals("It should be true as we get to [1,3,5] in one swap", true, success);
    }

    @Test
    public void validateUnaryArraySolvable() {
        int[] numbers = {1};
        boolean success = CollectionChallenges.isOrderedBySingleSwap(numbers.clone());
        assertEquals("It should be true as we don't require swap (already sorted)", true, success);
    }

    @Test
    public void validateAlreadySortedArray() {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        boolean success = CollectionChallenges.isOrderedBySingleSwap(numbers.clone());
        assertEquals("It should be true as we don't require swap (already sorted)", true, success);
    }

    @Test
    public void validateLongArrayUnsolvable() {
        int[] numbers = {1, 3, 5, 5, 8, 2, 1};
        boolean success = CollectionChallenges.isOrderedBySingleSwap(numbers.clone());
        assertEquals("It should be false as we get to [1,1,2,3,5,5,8] in three swaps", false, success);
    }

    @Test
    public void arrayShiftRightWhereNEqualsK() {
        int[] numbers = {1, 2, 3, 4};
        int[] result = CollectionChallenges.arrayShiftRight(numbers, 4);
        int[] expected = {1, 2, 3, 4};
        assertArrayEquals(expected, result);
    }

    @Test
    public void arrayShiftRightWhereNLessThanK() {
        int[] numbers = {1, 2, 3, 4};
        int[] result = CollectionChallenges.arrayShiftRight(numbers, 3);
        int[] expected = {2, 3, 4, 1};
        assertArrayEquals(expected, result);
    }

    @Test
    public void arrayShiftRightFiveElements() {
        int[] numbers = {3, 8, 9, 7, 6};
        int[] result = CollectionChallenges.arrayShiftRight(numbers, 3);
        int[] expected = {9, 7, 6, 3, 8};
        assertArrayEquals(expected, result);
    }

    @Test
    public void arrayShiftRightEmpty() {
        int[] numbers = {};
        int[] result = CollectionChallenges.arrayShiftRight(numbers, 3);
        int[] expected = {};
        assertArrayEquals(expected, result);
    }

    @Test
    public void arrayShiftRightOneElement() {
        int[] numbers = {1};
        int[] result = CollectionChallenges.arrayShiftRight(numbers, 3);
        int[] expected = {1};
        assertArrayEquals(expected, result);
    }

    @Test
    public void arrayShiftRightKGreaterThanN() {
        int[] numbers = {1, 2, 3};
        int[] result = CollectionChallenges.arrayShiftRight(numbers, 6);
        int[] expected = {1, 2, 3};
        assertArrayEquals(expected, result);
    }
}
