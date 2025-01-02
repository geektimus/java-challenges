package com.codingmaniacs.others;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
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

    @Test
    public void findFirstOccurrenceOfCharEmptyString() {
        String str = "";
        String expected = "";

        String result = StringChallenges.findFirstRepeatedChar(str);
        assertEquals("There's not repeated char on an empty string", expected, result);
    }

    @Test
    public void findFirstOccurrenceOfCharNullString() {

        String expected = "";

        String result = StringChallenges.findFirstRepeatedChar(null);
        assertEquals("There's not repeated char on an null string", expected, result);
    }

    @Test
    public void findFirstOccurrenceOfCharOneElementString() {
        String str = "a";
        String expected = "";

        String result = StringChallenges.findFirstRepeatedChar(str);
        assertEquals("Since there's no duplicates it should return \"\"", expected, result);
    }

    @Test
    public void findFirstOccurrenceOfChaTwoRepeatedElementString() {
        String str = "aa";
        String expected = "a";

        String result = StringChallenges.findFirstRepeatedChar(str);
        assertEquals("Since the letter a is repeated once, that's the solution", expected, result);
    }

    @Test
    public void findFirstOccurrenceOfCharLongerString() {
        String str = "bdcdba";
        String expected = "d";

        String result = StringChallenges.findFirstRepeatedChar(str);
        assertEquals("Since the letter a is repeated once, that's the solution", expected, result);
    }

    @Test
    public void transformStringToURLNoSpaces() {
        String str = "helloworld";
        int trueLength = 10;
        String expected = "helloworld";

        String result = StringChallenges.URLlify(str, trueLength);
        assertEquals("We don't have spaces to parse so we expect the same string", expected, result);
    }

    @Test
    public void transformStringToURLTwoSpaces() {
        String str = "hello world! example    ";
        int trueLength = 20;
        String expected = "hello%20world!%20example";

        String result = StringChallenges.URLlify(str, trueLength);
        assertEquals(expected, result);
    }

    @Test
    public void transformStringToURLFourSpaces() {
        String str = "this is my friendly command        ";
        int trueLength = 27;
        String expected = "this%20is%20my%20friendly%20command";

        String result = StringChallenges.URLlify(str, trueLength);
        assertEquals(expected, result);
    }

    @Test
    public void checkBalancedBracesYES() {
        String str = "(){}[]";
        String expected = "YES";

        String result = StringChallenges.balancedBraces(str);
        assertEquals(expected, result);
    }

    @Test
    public void checkBalancedBracesNO() {
        String str = "{[}]}";
        String expected = "NO";

        String result = StringChallenges.balancedBraces(str);
        assertEquals(expected, result);
    }

    @Test
    public void checkBalancedBracesNested() {
        String str = "[](){()}";
        String expected = "YES";

        String result = StringChallenges.balancedBraces(str);
        assertEquals(expected, result);
    }

    @Test
    public void checkBalancedBracesMultiple() {

        String[] str = new String[]{"{[}]}", "(){}[]"};
        String[] expected = new String[]{"NO", "YES"};

        String[] result = StringChallenges.balancedBraces(str);
        assertArrayEquals(expected, result);
    }

}
