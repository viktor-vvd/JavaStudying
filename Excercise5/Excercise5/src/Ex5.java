import static org.junit.Assert.assertEquals;

import java.util.*;

import org.junit.Test;

public class Ex5 {
    public static void main(String[] args) throws Exception {
        String input = "(]";

        System.out.println(IsValidStr(input));
    }
    public static boolean IsValidStr(String input)
    {
        boolean isValid = true;

        Map<Character, Character> brackets = new HashMap<Character, Character>();
        brackets.put(')', '(');
        brackets.put(']', '[');
        brackets.put('}', '{');
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < input.length(); i++) {
            if (")}]".indexOf(input.toCharArray()[i]) >= 0) {
                if (st.empty()) {
                    isValid = false;
                    break;
                }
                else if (brackets.get(input.toCharArray()[i]) != st.pop()) {
                    isValid = false;
                    break;
                }
            } else {
                st.push(input.toCharArray()[i]);
            }
        }
        return isValid && st.empty();
    }

    @Test
    public void textEx() {
        assertEquals(true, IsValidStr("()"));
        assertEquals(true, IsValidStr("()[]{}"));
        assertEquals(false, IsValidStr("(]"));
        assertEquals(false, IsValidStr("([)]"));
        assertEquals(true, IsValidStr("{[]}"));
        assertEquals(false, IsValidStr("{[a]}"));
    }

}
