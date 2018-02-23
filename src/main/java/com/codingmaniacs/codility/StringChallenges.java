package com.codingmaniacs.codility;

import java.util.stream.Stream;

public class StringChallenges {
    /**
     * Given a phrase it counts the max number of words of the longest sentence.
     *
     * @param phrase Phrase containing sentences that we need to analyze.
     * @return Max number of words on the longest sentence.
     */
    static int countMaxWords(String phrase) {
        if (phrase == null || phrase.isEmpty())
            return 0;

        return Stream
                .of(phrase.split("[?!.]"))
                .map(String::trim)
                .mapToInt(sentence -> sentence.split("\\s+").length)
                .max()
                .orElse(0);
    }
}
