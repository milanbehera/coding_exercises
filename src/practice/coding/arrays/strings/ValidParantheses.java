package practice.coding.arrays.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParantheses {



    public static boolean isValid(String s) {
        Map<Character, Character> mappings = new HashMap<>();
        mappings.put('(', ')');
        mappings.put('[', ']');
        mappings.put('{', '}');
        Stack<Character> parenthesis = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (mappings.containsKey(c)) {
                parenthesis.push(mappings.get(c));
            } else if (mappings.containsValue(c)) {
                if (parenthesis.isEmpty() || parenthesis.pop() != c) {
                    return false;
                }
            }
        }
        return parenthesis.isEmpty();
    }

    public static void main(String [] s) {
        String str = "{()[}[]";
        System.out.println(isValid(str));
    }
}
