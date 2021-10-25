package java_algorithms.arrays_and_strings;

import org.junit.Test;
import static org.junit.Assert.*;

public class UniqueCharsHashTest {
    @Test public void identifiesUniqueChars() {
        assertTrue(UniqueCharsHash.isMadeOfUniqueChars("coding"));
    }

    @Test public void indetifiesNonUniqueChars() {
        assertFalse(UniqueCharsHash.isMadeOfUniqueChars("brown fox"));
    }
}
