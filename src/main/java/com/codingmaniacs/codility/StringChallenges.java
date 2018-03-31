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


    /**
     * Given a line of shoes (L,R), we need to find the number of workers that can work on them given the condition that
     * A worker can work only on a group where the group contains the same number of L and R shoes.
     *
     * @param lineOfShoes String representing the line of shoes that we are processing.
     * @return Number of workers that can be assigned to work on the shoes.
     */
    public static int countMinWorkers(String lineOfShoes) {
        if (lineOfShoes.length() == 2)
            return 1;

        int workers = 0;
        int lCount = 0, rCount = 0;

        for (Character shoe : lineOfShoes.toCharArray()) {
            if (shoe.toString().equals("L")) {
                lCount++;
            } else {
                rCount++;
            }
            if (lCount == rCount) {
                workers++;
            }
        }
        return workers;
    }
}
