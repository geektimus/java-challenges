package com.codingmaniacs.codility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringChallengesTests {

    @Test
    public void countWordsNormalPhrase() {
        String basePhrase = "We test coders. Give us a try?";
        int expectedWordCount = 4;

        int maxWords = StringChallenges.countMaxWords(basePhrase);
        assertEquals("We should have 4 words", expectedWordCount, maxWords);
    }

    @Test
    public void countWordsComplexPhrase() {
        String basePhrase = "Forget  CVs..Save time . x x";
        int expectedWordCount = 2;

        int maxWords = StringChallenges.countMaxWords(basePhrase);
        assertEquals("We should have 2 words", expectedWordCount, maxWords);
    }

    @Test
    public void countWordsSingleWord() {
        String basePhrase = "Success";
        int expectedWordCount = 1;

        int maxWords = StringChallenges.countMaxWords(basePhrase);
        assertEquals("This should be a single word", expectedWordCount, maxWords);
    }

    @Test
    public void countWordsEmptyString() {
        String basePhrase = "";
        int expectedWordCount = 0;

        int maxWords = StringChallenges.countMaxWords(basePhrase);
        assertEquals("No words expected on empty string", expectedWordCount, maxWords);
    }

    @Test
    public void countWordsOnlySymbolsString() {
        String basePhrase = "!!!!!!!!!!!!!!!";
        int expectedWordCount = 0;

        int maxWords = StringChallenges.countMaxWords(basePhrase);
        assertEquals("No words expected since the string contains only symbols", expectedWordCount, maxWords);
    }
}
