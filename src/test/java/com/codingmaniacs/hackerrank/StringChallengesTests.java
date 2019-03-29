package com.codingmaniacs.hackerrank;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringChallengesTests {
    @Test
    public void reduceStringRemovingChar() {
        String s = "eGymm_";
        String reducedString = StringChallenges.reduceString(s);
        String expected = "eGym";
        assertEquals(expected, reducedString);
    }

    @Test
    public void reduceStringUppercase() {
        String s = "e+gym";
        String reducedString = StringChallenges.reduceString(s);
        String expected = "eGym";
        assertEquals(expected, reducedString);
    }

    @Test
    public void reduceStringCombined() {
        String s = "ee_+Gym";
        String reducedString = StringChallenges.reduceString(s);
        String expected = "egym";
        assertEquals(expected, reducedString);
    }

    @Test
    public void reduceStringCombined1() {
        String s = "+ee_+Gym___";
        String reducedString = StringChallenges.reduceString(s);
        String expected = "E";
        assertEquals(expected, reducedString);
    }

    @Test
    public void reduceStringEmpty1() {
        String s = "+a+b+c+D+E_____";
        String reducedString = StringChallenges.reduceString(s);
        String expected = "";
        assertEquals(expected, reducedString);
    }

    @Test
    public void reduceStringNull() {
        String s = null;
        String reducedString = StringChallenges.reduceString(s);
        String expected = null;
        assertEquals(expected, reducedString);
    }

    @Test
    public void reduceStringEmpty() {
        String s = "";
        String reducedString = StringChallenges.reduceString(s);
        String expected = "";
        assertEquals(expected, reducedString);
    }

    @Test
    public void compareStrings() {
        String s1 = "e+gym";
        String s2 = "eGymm_";

        boolean equals = StringChallenges.equal(s1, s2);
        assertTrue(equals);
    }

    @Test
    public void compareStrings1() {
        String s1 = "+ee_+Gym___";
        String s2 = "E";

        boolean equals = StringChallenges.equal(s1, s2);
        assertTrue(equals);
    }

    @Test
    public void compareStrings2() {
        String s1 = null;
        String s2 = null;

        boolean equals = StringChallenges.equal(s1, s2);
        assertTrue(equals);
    }

    @Test
    public void compareStrings3() {
        String s1 = "";
        String s2 = "";

        boolean equals = StringChallenges.equal(s1, s2);
        assertTrue(equals);
    }
    @Test
    public void compareStrings4() {
        String s1 = null;
        String s2 = "";

        boolean equals = StringChallenges.equal(s1, s2);
        assertFalse(equals);
    }

}
