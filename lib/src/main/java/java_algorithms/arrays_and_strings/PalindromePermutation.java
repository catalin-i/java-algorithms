package java_algorithms.arrays_and_strings;

import java.util.HashMap;
import java.util.Map;

public class PalindromePermutation {
    public static boolean isPalindromePermutation(String input) {
        char[] chars = input.toLowerCase().toCharArray();
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : chars) {
            if (c != ' ') {
                int freq = frequencyMap.getOrDefault(c, 0);
                frequencyMap.put(c, freq + 1);
            }
        }
        int count = 0;

        for (Map.Entry entry : frequencyMap.entrySet()) {
            if ((int) (entry.getValue()) % 2 == 1) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }
        return true;
    }
}
