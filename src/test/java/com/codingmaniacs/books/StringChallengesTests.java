package com.codingmaniacs.books;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringChallengesTests {
    @Test
    public void doesAlphanumericContainUniqueChars() {
        String word = "alphanumeric";

        boolean hasUniqueChars = StringChallenges.hasUniqueChars(word);
        assertEquals("This should be false as there are two (a) on this word", false, hasUniqueChars);
    }

    @Test
    public void doesMomContainUniqueChars() {
        String word = "mom";

        boolean hasUniqueChars = StringChallenges.hasUniqueChars(word);
        assertEquals("This should be false as there are two (m) on this word", false, hasUniqueChars);
    }

    @Test
    public void doesAbcContainUniqueChars() {
        String word = "abc";

        boolean hasUniqueChars = StringChallenges.hasUniqueChars(word);
        assertEquals("This should be true as all letters are unique", true, hasUniqueChars);
    }

    @Test
    public void doesEnableContainUniqueChars() {
        String word = "abode";

        boolean hasUniqueChars = StringChallenges.hasUniqueChars(word);
        assertEquals("This should be true as all letters are unique", true, hasUniqueChars);
    }

    @Test
    public void doesMomContainUniqueCharsHash() {
        String word = "mom";

        boolean hasUniqueChars = StringChallenges.hasUniqueCharsHash(word);
        assertEquals("This should be false as there are two (m) on this word", false, hasUniqueChars);
    }
}
