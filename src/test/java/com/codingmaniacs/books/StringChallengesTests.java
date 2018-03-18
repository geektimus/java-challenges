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

    @Test
    public void isPermutationWithOnlyOneValue() {
        String word1 = "word";

        boolean isPermutation = StringChallenges.isPermutation(word1, null);
        assertEquals("This should be false as we have one word missing to compare", false, isPermutation);
    }

    @Test
    public void isPermutationDifferentLength() {
        String word = "word", otherWord = "other";

        boolean isPermutation = StringChallenges.isPermutation(word, otherWord);
        assertEquals("This should be false as the lengths are different", false, isPermutation);
    }

    @Test
    public void isCatPermutationOfTac() {
        String word1 = "cat", word2 = "tac";

        boolean isPermutation = StringChallenges.isPermutation(word1, word2);
        assertEquals("This should be true as cat is a permutation of tac", true, isPermutation);
    }

    @Test
    public void isTomatoPermutationOfOtamoc() {
        String word1 = "tomato", word2 = "otamoc";

        boolean isPermutation = StringChallenges.isPermutation(word1, word2);
        assertEquals("This should be false as tomato is not a permutation of otamoc", false, isPermutation);
    }

    @Test
    public void isPermutationPermutationOfPermutation() {
        String word1 = "permutation", word2 = "permutation";

        boolean isPermutation = StringChallenges.isPermutation(word1, word2);
        assertEquals("This should be true as it's the same word", true, isPermutation);
    }

    @Test
    public void isCatPermutationOfTacWithDifferentCase() {
        String word1 = "Cat", word2 = "Tac";

        boolean isPermutation = StringChallenges.isPermutation(word1, word2);
        assertEquals("This should be true as cat is a permutation of tac", true, isPermutation);
    }
}
