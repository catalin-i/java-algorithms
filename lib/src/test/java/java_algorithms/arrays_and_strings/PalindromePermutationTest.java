package java_algorithms.arrays_and_strings;

import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromePermutationTest {
    @Test public void spacesAndCases() {
        boolean result = PalindromePermutation.isPalindromePermutation("Taco cat");
        assertTrue(result);
    }
    @Test public void closeToAPermutation() {
        boolean result = PalindromePermutation.isPalindromePermutation("Taco cats");
        assertFalse(result);
    }
    @Test public void moreSpaces() {
        boolean result = PalindromePermutation.isPalindromePermutation("Ta c o c at");
        assertTrue(result);
    }
    @Test public void higherIncidence() {
        boolean result = PalindromePermutation.isPalindromePermutation("Two taco cats to wow s");
        assertTrue(result);
    }
    @Test public void higherIncidenceFalse() {
        boolean result = PalindromePermutation.isPalindromePermutation("Two taco cats to wow");
        assertFalse(result);
    }
}
