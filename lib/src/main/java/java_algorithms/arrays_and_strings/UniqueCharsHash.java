package java_algorithms.arrays_and_strings;

import java.util.HashSet;

public class UniqueCharsHash {
    public static boolean isMadeOfUniqueChars(String input) {
        boolean result = true;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (set.contains(c)) {
                result = false;
            } else {
                set.add(c);
            }
        }
        return result;
    }
}
