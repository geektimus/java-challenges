package com.codingmaniacs.others;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringChallengesTests {

    @Test
    public void reverseRecursiveEmptyString() {
        String str = "";
        String expected = "";

        String result = StringChallenges.reverse(str);
        assertEquals("The reverse of an empty string is the same empty string", expected, result);
    }

    @Test
    public void reverseRecursiveSingleCharString() {
        String str = "a";
        String expected = "a";

        String result = StringChallenges.reverse(str);
        assertEquals("The reverse of a single char is the same char", expected, result);
    }

    @Test
    public void reverseRecursiveAB() {
        String str = "ab";
        String expected = "ba";

        String result = StringChallenges.reverse(str);
        assertEquals("The reverse of ab is ba", expected, result);
    }

    @Test
    public void reverseRecursiveMultipleRepetitions() {
        String str = "aaa";
        String expected = "aaa";

        String result = StringChallenges.reverse(str);
        assertEquals("The reverse of aaa is aaa", expected, result);
    }

    @Test
    public void reverseRecursiveComplexString() {
        String str = "longer and complex words";
        String expected = "sdrow xelpmoc dna regnol";

        String result = StringChallenges.reverse(str);
        assertEquals("The reverse of an empty string is the same empty string", expected, result);
    }
}
