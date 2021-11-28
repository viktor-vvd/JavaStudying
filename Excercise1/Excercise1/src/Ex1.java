import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Ex1 {
    public static void main(String[] args) throws Exception {
        System.out.println(Palindrom("abcv J4f4J . sdfv aaa 9876789"));
    }

    public static int Palindrom(String text) {
        int pal = 0;
        String[] words = text.split(" ");
        for (String word : words) {
            word = word.trim();
            if (word.length() > 1) {
                int count = 0;
                for (int i = 0; i < word.length() / 2; i++) {
                    if (word.toCharArray()[i] == word.toCharArray()[word.length() - 1 - i]) {
                        count++;
                    }
                }
                if (count == word.length() / 2) {
                    pal++;
                }
            }
        }
        return pal;
    }

    @Test
    public void textEx() {
        assertEquals(3, Palindrom("abcv J4f4J . sdfv aaa 9876789"));
        assertEquals(4, Palindrom("abcba J4f4J . sdfv aaa 9876789"));
        assertEquals(1, Palindrom("abcv J4fg4J . sdfv aaa 98768789"));
        assertEquals(0, Palindrom("."));
    }
}
