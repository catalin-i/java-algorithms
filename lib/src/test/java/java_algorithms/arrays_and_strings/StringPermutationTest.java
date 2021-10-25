package java_algorithms.arrays_and_strings;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringPermutationTest {
    @Test public void identifiesPermutation() {
        boolean result = StringPermutation.equalPermutations("xyzxyz", "xxyyzz");
        assertTrue(result);
    }
    @Test public void catchesDifferentLengths() {
        boolean result = StringPermutation.equalPermutations("reeds", "deer");
        assertFalse(result);
    }
    @Test public void identifiesMismatch() {
        boolean result = StringPermutation.equalPermutations("deer", "dear");

    }
}
