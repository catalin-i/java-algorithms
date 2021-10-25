package java_algorithms.arrays_and_strings;

import java.util.HashMap;
import java.util.Map;

public class StringPermutation {
    public static boolean equalPermutations(String left, String right) {
        int length = left.length();

        if (length != right.length()) {
            return false;
        }
        HashMap<Character, Integer> leftHash = new HashMap<>();
        HashMap<Character, Integer> rightHash = new HashMap<>();

        for (int i = 0; i < length; i++) {
            int l = leftHash.getOrDefault(left.charAt(i), 0);
            int r = rightHash.getOrDefault(right.charAt(i), 0);
            leftHash.put(left.charAt(i), l + 1);
            rightHash.put(right.charAt(i), r + 1);
        }

        for (Map.Entry<Character, Integer> e : leftHash.entrySet()) {
            if (e.getValue() != rightHash.get(e.getKey())) {
                return false;
            }
        }
        return true;
    }
}
