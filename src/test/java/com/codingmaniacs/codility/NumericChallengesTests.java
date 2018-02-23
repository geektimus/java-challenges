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
}
