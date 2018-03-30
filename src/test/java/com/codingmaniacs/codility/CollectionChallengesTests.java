package com.codingmaniacs.codility;

import org.junit.Test;

import static org.junit.Assert.*;

public class CollectionChallengesTests {

    @Test
    public void validateNormalArraySolvable() {
        int[] numbers = {1, 5, 3, 3, 7};
        boolean success = CollectionChallenges.isOrderedBySingleSwap(numbers.clone());
        assertTrue("It should be true we get to [1,3,3,5,7] in one swap", success);
    }

    @Test
    public void validateNormalArrayUnsolvable() {
        int[] numbers = {1, 3, 5, 3, 4};
        boolean success = CollectionChallenges.isOrderedBySingleSwap(numbers.clone());
        assertFalse("It should be false as we get to [1,3,3,4,5] in two swaps", success);
    }

    @Test
    public void validateShortArraySolvable() {
        int[] numbers = {1, 5, 3};
        boolean success = CollectionChallenges.isOrderedBySingleSwap(numbers.clone());
        assertTrue("It should be true as we get to [1,3,5] in one swap", success);
    }

    @Test
    public void validateUnaryArraySolvable() {
        int[] numbers = {1};
        boolean success = CollectionChallenges.isOrderedBySingleSwap(numbers.clone());
        assertTrue("It should be true as we don't require swap (already sorted)", success);
    }

    @Test
    public void validateAlreadySortedArray() {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        boolean success = CollectionChallenges.isOrderedBySingleSwap(numbers.clone());
        assertTrue("It should be true as we don't require swap (already sorted)", success);
    }

    @Test
    public void validateLongArrayUnsolvable() {
        int[] numbers = {1, 3, 5, 5, 8, 2, 1};
        boolean success = CollectionChallenges.isOrderedBySingleSwap(numbers.clone());
        assertFalse("It should be false as we get to [1,1,2,3,5,5,8] in three swaps", success);
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

    @Test
    public void findFrogJumpsShortSequence() {
        int[] leaves = {1, 3, 2, 4};
        int target = 2;
        int result = CollectionChallenges.findFrogJumpsOverLeaves(target, leaves);
        int expected = 2;
        assertEquals(expected, result);
    }

    @Test
    public void findFrogJumpsLongSequence() {
        int[] leaves = {1, 3, 1, 4, 2, 3, 5, 4};
        int target = 5;
        int result = CollectionChallenges.findFrogJumpsOverLeaves(target, leaves);
        int expected = 6;
        assertEquals(expected, result);
    }

    @Test
    public void findIfArrayIsPermDuplicatedElements() {
        int[] arr = {1, 1};
        int result = CollectionChallenges.isPermutation(arr);
        assertEquals(0, result);
    }

    @Test
    public void findIfArrayIsPermShortUnorderedArr() {
        int[] arr = {2, 1};
        int result = CollectionChallenges.isPermutation(arr);
        assertEquals(1, result);
    }

    @Test
    public void findIfArrayIsPermShortOrderedArr() {
        int[] arr = {1, 2};
        int result = CollectionChallenges.isPermutation(arr);
        assertEquals(1, result);
    }

    @Test
    public void findIfArrayIsPermLongUnorderedArr() {
        int[] arr = {4, 1, 3, 2};
        int result = CollectionChallenges.isPermutation(arr);
        assertEquals(1, result);
    }

    @Test
    public void findIfArrayIsPermLongArrMissingEl() {
        int[] arr = {4, 1, 3};
        int result = CollectionChallenges.isPermutation(arr);
        assertEquals(0, result);
    }

    @Test
    public void counterOperationsOneIncreaseOperation() {
        int[] arr = {3};
        int n = 5;
        int[] expected = {0, 0, 1, 0, 0};
        int[] result = CollectionChallenges.counterOperations(n, arr);
        assertArrayEquals(expected, result);
    }

    @Test
    public void counterOperationsOneUpdateAllOperation() {
        int[] arr = {6};
        int n = 5;
        int[] expected = {0, 0, 0, 0, 0};
        int[] result = CollectionChallenges.counterOperations(n, arr);
        assertArrayEquals(expected, result);
    }

    @Test
    public void counterOperationsOneUpdateAllAfterIncrease() {
        int[] arr = {3, 6};
        int n = 5;
        int[] expected = {1, 1, 1, 1, 1};
        int[] result = CollectionChallenges.counterOperations(n, arr);
        assertArrayEquals(expected, result);
    }


    @Test
    public void counterOperationsOnlyIncreaseSamePosition() {
        int[] arr = {1, 1, 1, 1, 1};
        int n = 5;
        int[] expected = {5, 0, 0, 0, 0};
        int[] result = CollectionChallenges.counterOperations(n, arr);
        assertArrayEquals(expected, result);
    }

    @Test
    public void counterOperationsOnlyIncreaseDifferentPositions() {
        int[] arr = {4, 2, 2, 3};
        int n = 4;
        int[] expected = {0, 2, 1, 1};
        int[] result = CollectionChallenges.counterOperations(n, arr);
        assertArrayEquals(expected, result);
    }

    @Test
    public void counterOperationsOnlyMax() {
        int[] arr = {2, 5, 5};
        int n = 4;
        int[] expected = {1, 1, 1, 1};
        int[] result = CollectionChallenges.counterOperations(n, arr);
        assertArrayEquals(expected, result);
    }

    @Test
    public void counterOperationsComplexSequence() {
        int[] arr = {3, 4, 4, 6, 1, 4, 4};
        int n = 5;
        int[] expected = {3, 2, 2, 4, 2};
        int[] result = CollectionChallenges.counterOperations(n, arr);
        assertArrayEquals(expected, result);
    }
}
