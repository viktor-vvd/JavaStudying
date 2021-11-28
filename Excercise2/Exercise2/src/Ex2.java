import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Ex2 {
    public static void main(String[] args) throws Exception {
        System.out.println(Prefix(new String[] { "flower", "flow", "flight" }));
    }

    public static String Prefix(String[] text) {
        String prefix = "";
        Boolean stop = false;
        while (!stop) {
            for (String str : text) {
                if (!str.startsWith(prefix)) {
                    stop = true;
                    prefix = prefix.substring(0, prefix.length() - 1);
                    break;
                }
            }
            for (String str : text) {
                if (str.length() == prefix.length()) {
                    stop = true;
                    break;
                }
            }
            if (!stop)
                prefix = text[0].substring(0, prefix.length() + 1);
        }
        return prefix;
    }

    @Test
    public void textEx() {
        assertEquals("fl", Prefix(new String[] { "flower", "flow", "flight" }));
        assertEquals("", Prefix(new String[] { "dog", "racecar", "car" }));
        assertEquals("flower", Prefix(new String[] { "flower", "flower", "flower" }));
        assertEquals("", Prefix(new String[] { "", "flower", "flower" }));
    }

}
