package java_algorithms.arrays_and_strings;

import org.junit.Test;

import static org.junit.Assert.*;

/*
The actual length of the string is given.
it is also assumed that the array has enough space to hold the encoded string
 */

public class URLEncoderTest {
    @Test
    public void basicCase() {
        char[] input = "The quick brown fox            ".toCharArray();
        String expected = "The%20quick%20brown%20fox";

        URLEncoder.encode(input, 19);
        assertEquals(expected, new String(input).trim());
    }
}
