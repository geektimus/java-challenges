package com.codingmaniacs.codility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumericChallengesTests {
    @Test
    public void shuffleNumber() {
        int number = 123456;

        int expectedNumber = 162534;
        int shuffledNumber = NumericChallenges.shuffleNumber(number);
        assertEquals("The number should be shuffled", expectedNumber, shuffledNumber);
    }

    @Test
    public void shuffleSmallNumber() {
        int number = 123;

        int expectedNumber = 132;
        int shuffledNumber = NumericChallenges.shuffleNumber(number);
        assertEquals("The number should be shuffled", expectedNumber, shuffledNumber);
    }

    @Test
    public void shuffleOneDigitNumber() {
        int number = 1;

        int expectedNumber = 1;
        int shuffledNumber = NumericChallenges.shuffleNumber(number);
        assertEquals("It should return the same number as no shuffle was applied", expectedNumber, shuffledNumber);
    }

    @Test
    public void shuffleNegativeNumber() {
        int number = -1;

        int expectedNumber = -1;
        int shuffledNumber = NumericChallenges.shuffleNumber(number);
        assertEquals("It should return the same number as no shuffle was applied", expectedNumber, shuffledNumber);
    }

    @Test
    public void binaryGapOfFive() {
        int number = 5;

        int expectedGap = 1;
        int binaryGap = NumericChallenges.findBinaryGap(number);
        assertEquals("It should return one because that's the binary gap on 5 (0101)", expectedGap, binaryGap);
    }

    @Test
    public void binaryGapOfTwenty() {
        int number = 20;

        int expectedGap = 1;
        int binaryGap = NumericChallenges.findBinaryGap(number);
        assertEquals("It should return two because that's the binary gap on 20 (10100)", expectedGap, binaryGap);
    }

    @Test
    public void binaryGapOfFifteen() {
        int number = 15;

        int expectedGap = 0;
        int binaryGap = NumericChallenges.findBinaryGap(number);
        assertEquals("It should return zero because there's no binary gap on 15 (11111)", expectedGap, binaryGap);
    }

    @Test
    public void binaryGapOfBigNumber() {
        int number = 1041;

        int expectedGap = 5;
        int binaryGap = NumericChallenges.findBinaryGap(number);
        assertEquals("It should return five because there's no binary gap on 1041 (10000010001)", expectedGap, binaryGap);
    }

    @Test
    public void binaryGapOfLongestNumber() {
        int number = 1148223232;

        int expectedGap = 5;
        int binaryGap = NumericChallenges.findBinaryGap(number);
        assertEquals("It should return five because there's no binary gap on 1148223232 (01000100011100000111111100000000)", expectedGap, binaryGap);
    }

    @Test
    public void findTheNumberOfPlaysNoAllIns() {
        int chips = 8;
        int allInPlays = 0;
        int result = NumericChallenges.minimumPlays(chips, allInPlays);
        assertEquals("It should return seven as there's no all ins and we have eight chips", 7, result);
    }

    @Test
    public void findTheNumberOfPlaysTwoAllIns() {
        int chips = 18;
        int allInPlays = 2;
        int result = NumericChallenges.minimumPlays(chips, allInPlays);
        assertEquals("It should return six as it's the minimum plays to reach 18", 6, result);
    }

    @Test
    public void findTheNumberOfPlaysLotsOfAllIns() {
        int chips = 10;
        int allInPlays = 10;
        int result = NumericChallenges.minimumPlays(chips, allInPlays);
        assertEquals("It should return four as it's the minimum plays to reach 10 (we don't use all the all ins", 4, result);
    }
}
