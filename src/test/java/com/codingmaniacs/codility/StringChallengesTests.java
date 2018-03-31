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

    @Test
    public void getMinimumWorkersOnlyOnePair() {
        String lineOfShoes = "LR";
        int expectedWorkers = 1;

        int workers = StringChallenges.countMinWorkers(lineOfShoes);
        assertEquals("One worker should work on this as we have only one pair", expectedWorkers, workers);
    }

    @Test
    public void getMinimumWorkersOnlyOnePairReverse() {
        String lineOfShoes = "RL";
        int expectedWorkers = 1;

        int workers = StringChallenges.countMinWorkers(lineOfShoes);
        assertEquals("One worker should work on this as we have only one pair", expectedWorkers, workers);
    }

    @Test
    public void getMinimumWorkersMixedPairsLength() {
        String lineOfShoes = "RLRRLLRLRRLL";
        int expectedWorkers = 4;

        int workers = StringChallenges.countMinWorkers(lineOfShoes);
        assertEquals(
                "Four workers should work on this line as we have four clear groups",
                expectedWorkers,
                workers);
    }

    @Test
    public void getMinimumWorkersComplexLine() {
        String lineOfShoes = "LLRLRLRLRLRLRR";
        int expectedWorkers = 1;

        int workers = StringChallenges.countMinWorkers(lineOfShoes);
        assertEquals(
                "One worker should work on this line since LL has it's pair at the end",
                expectedWorkers,
                workers);
    }


    @Test
    public void getMinimumWorkersComplexLineRepeated() {
        String lineOfShoes = "LLRLRLRLRLRLRRLLRLRLRLRLRLRRLLRLRLRLRLRLRRLLRLRLRLRLRLRR";
        int expectedWorkers = 4;

        int workers = StringChallenges.countMinWorkers(lineOfShoes);
        assertEquals(
                "Four workers should work on this line as it's a mix of a previous one",
                expectedWorkers,
                workers);
    }

    @Test
    public void getMinimumWorkersComplexLineRepeatedWithExtraPair() {
        String lineOfShoes = "LLRLRLRLRLRLRRLLRLRLRLRLRLRRLLRLRLRLRLRLRRLLRLRLRLRLRLRRLR";
        int expectedWorkers = 5;

        int workers = StringChallenges.countMinWorkers(lineOfShoes);
        assertEquals(
                "Five workers should work on this line as it's a mix of a previous one + a pair",
                expectedWorkers,
                workers);
    }

    @Test
    public void getMinimumWorkersWorstCase() {
        String lineOfShoes = "LLRLRLRLRLRLRLLRLRLRLRLRLRRLLRLRLRLRLRLRRLLRLRLRLRLRLRRLRR";
        int expectedWorkers = 1;

        int workers = StringChallenges.countMinWorkers(lineOfShoes);
        assertEquals(
                "One worker should work on this line since a L on the middle has it's pair at the end",
                expectedWorkers,
                workers);
    }
}
