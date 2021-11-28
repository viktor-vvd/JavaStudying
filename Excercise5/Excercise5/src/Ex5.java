import java.util.*;

public class Ex5 {
    public static void main(String[] args) throws Exception {
        String input = "(]";
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
        System.out.println(isValid && st.empty());
    }
}
