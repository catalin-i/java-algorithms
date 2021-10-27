package java_algorithms.arrays_and_strings;

public class URLEncoder {
    public static void encode(char[] input, int len) {
        int remaining_spaces = countSpaces(input, len);
        int index = len - 1;

        while (remaining_spaces > 0) {
            char originalChar = input[index];
            placeChar(input, index, remaining_spaces);
            if (originalChar == ' ') {
                remaining_spaces --;
            }
            index --;
        }
    }

    private static int countSpaces(char[] input, int len) {
        int result = 0;
        for (int i = 0; i < len; i++) {
            if (input[i] == ' ') result ++;
        }
        return result;
    }

    private static void placeChar(char[] input, int index, int remaining_spaces) {
        if (input[index] != ' ') {
            input[index + 2 * remaining_spaces] = input[index];
        } else {
            input[index + 2 * remaining_spaces] = '0';
            input[index + 2 * remaining_spaces - 1] = '2';
            input[index + 2 * remaining_spaces - 2] = '%';
        }
    }
}
